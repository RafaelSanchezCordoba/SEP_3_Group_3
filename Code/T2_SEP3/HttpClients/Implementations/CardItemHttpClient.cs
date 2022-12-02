using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.Implementations;

public class CardItemHttpClient:ICardItemService
{
    private readonly HttpClient client;
    private ICardItemService CardItemService;

    public CardItemHttpClient(HttpClient client)
    {
        this.client = client;
    }
    public async Task<CardItem> CreateAsync(CreateCardItemDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("ShoppingCartQuantities", dto);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        var cardItem = JsonSerializer.Deserialize<CardItem>(result, new JsonSerializerOptions 
            {
                PropertyNameCaseInsensitive = true 
            }
        )!;

        return cardItem;
    }

    public async Task<IEnumerable<CardItem>> GetAsync()
    {
        HttpResponseMessage response = await client.GetAsync("https://localhost:7999/ShoppingCartQuantities");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        ICollection<CardItem> cardItems = JsonSerializer.Deserialize<ICollection<CardItem>>(content,
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
      
        return cardItems;
    }

    public async Task<CardItem> GetByIdAsync(int Id)
    {
        HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/ShoppingCartQuantities/{Id}");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        CardItem cardItem = JsonSerializer.Deserialize<CardItem>(content, 
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            }
        )!;
        return cardItem;
    }

    public async Task<int> GetQuantityById(int Id)
    {
        HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/Quantity/{Id}");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        int quantity = JsonSerializer.Deserialize<int>(content, 
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            }
        )!;
        return quantity;
    }

    public async Task UpdateQuantityAsync(int Id, int newQuantity)
    {
        string cardAsJson = JsonSerializer.Serialize(newQuantity);
        StringContent body = new StringContent(cardAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PatchAsync($"ShoppingCartQuantities/{Id}", body);
      
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }

    public async Task<CardItem> GetByIdsAsync(int idProduct, int idShoppingCart)
    {
        HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/ShoppingCartQuantities/IDs?product_id={idProduct}&shoppingCard_id={idShoppingCart}");
            string content = await response.Content.ReadAsStringAsync();
            if (!response.IsSuccessStatusCode)
            {
                throw new Exception(content);
            }

            CardItem cardItem = JsonSerializer.Deserialize<CardItem>(content, 
                new JsonSerializerOptions
                {
                    PropertyNameCaseInsensitive = true
                }
            )!;
            return cardItem;
       
    }
    
    public async Task RemoveCardItemId(int id)
    {
        HttpResponseMessage response = await client.DeleteAsync($"https://localhost:7999/ShoppingCartQuantities/{id}");
        string content = await response.Content.ReadAsStringAsync();

      
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }
    }
}