using System.Net.Http.Json;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.Implementations;

public class ShoppingCartHttpClient:IShoppingCartService
{
    private readonly HttpClient client;
    private IShoppingCartService shoppingCartService;

    public ShoppingCartHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<ShoppingCart> CreateAsync(CreateShoppingCartDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("shoppingCarts", dto);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        ShoppingCart shoppingCart = JsonSerializer.Deserialize<ShoppingCart>(result, new JsonSerializerOptions 
            {
                PropertyNameCaseInsensitive = true 
            }
        )!;

        return shoppingCart;
    }

    public async Task<ICollection<Socks>> GetAsync()
    {
        HttpResponseMessage response = await client.GetAsync("https://localhost:7999/ShoppingCart");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        ICollection<Socks> socks = JsonSerializer.Deserialize<ICollection<Socks>>(content,
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
      
        return socks;
    }

    public async Task<ShoppingCart> getByIdAsync(int id)
    {
        HttpResponseMessage response = await client.GetAsync($"https://localhost:7140/shoppingCarts/{id}");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        ShoppingCart shoppingCart = JsonSerializer.Deserialize<ShoppingCart>(content, 
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            }
        )!;
        return shoppingCart;
    }
}