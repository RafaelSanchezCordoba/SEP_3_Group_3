using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using HttpClients.ClientInterfaces.Trouser;
using Shared.DTOs;
using Shared.DTOs.Trousers;
using Shared.Models;

namespace HttpClients.Implementations.Trouser;

public class TrouserCardHttpClient : ITrouserCardService
{
    private readonly HttpClient client;
    private ITrouserCardService trouserCardService;

    public TrouserCardHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<TrouserCard> Create(CreateTrouserCardDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("https://localhost:7999/TrouserCard", dto);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        TrouserCard product = JsonSerializer.Deserialize<TrouserCard>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;

        return product;
    }

    public async Task<TrouserCard> GetById(int id)
    {
        HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/TrouserCard/{id}");
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        TrouserCard product = JsonSerializer.Deserialize<TrouserCard>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;

        return product;
    }

    public async Task<ICollection<TrouserCard>> GetAllTrouserCards()
    {
        HttpResponseMessage response = await client.GetAsync("https://localhost:7999/TrouserCard");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        ICollection<TrouserCard> trouserCards = JsonSerializer.Deserialize<ICollection<TrouserCard>>(content,
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
      
        return trouserCards;
    }

    public async Task RemoveById(int id)
    {
        HttpResponseMessage response = await client.DeleteAsync($"https://localhost:7999/TrouserCard/{id}");
        string content = await response.Content.ReadAsStringAsync();

      
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }
    }

    public async Task UpdateAsync(UpdateTrouserCardDto card)
    {
        string cardAsJson = JsonSerializer.Serialize(card);
        StringContent body = new StringContent(cardAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PatchAsync("TrouserCard", body);
      
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }
}