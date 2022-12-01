using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.Implementations;

public class SockCardHttpClient:ISockCardService
{
    private readonly HttpClient client;
    private ISockCardService _sockServiceImplementation;

    public SockCardHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<SocksCard> Create(CreateSockCardDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("SocksCards", dto);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        SocksCard product = JsonSerializer.Deserialize<SocksCard>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;

        return product;
    }

    public async Task<SocksCard> GetById(int id)
    {
        HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/SocksCards/{id}");
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        SocksCard product = JsonSerializer.Deserialize<SocksCard>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;

        return product;
    }

    public async Task<ICollection<SocksCard>> GetAllSockCards()
    {
        HttpResponseMessage response = await client.GetAsync("https://localhost:7999/SocksCards");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        ICollection<SocksCard> socks = JsonSerializer.Deserialize<ICollection<SocksCard>>(content,
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
      
        return socks;
    }

    public async Task RemoveProductCardSockById(int id)
    {
        HttpResponseMessage response = await client.DeleteAsync($"https://localhost:7999/SocksCards/{id}");
        string content = await response.Content.ReadAsStringAsync();

      
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }
    }

    public async Task UpdateAsync(UpdateSocksCardDto card)
    {
        string cardAsJson = JsonSerializer.Serialize(card);
        StringContent body = new StringContent(cardAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PatchAsync("SocksCards", body);
      
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }
}