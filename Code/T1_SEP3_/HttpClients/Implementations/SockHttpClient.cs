using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.Implementations;

public class SockHttpClient:ISockService
{
    private readonly HttpClient client;
    private ISockService _sockServiceImplementation;

    public SockHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<ProductCardSock> Create(CreateSockCardDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("Socks", dto);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        ProductCardSock product = JsonSerializer.Deserialize<ProductCardSock>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;

        return product;
    }

    public async Task<ProductCardSock> GetById(int id)
    {
        HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/Socks/{id}");
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        ProductCardSock product = JsonSerializer.Deserialize<ProductCardSock>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;

        return product;
    }

    public async Task<ICollection<ProductCardSock>> GetAllSockCards()
    {
        HttpResponseMessage response = await client.GetAsync("https://localhost:7999/Socks");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        ICollection<ProductCardSock> socks = JsonSerializer.Deserialize<ICollection<ProductCardSock>>(content,
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
      
        return socks;
    }

    public async Task RemoveProductCardSockById(int id)
    {
        HttpResponseMessage response = await client.DeleteAsync($"https://localhost:7999/Socks/{id}");
        string content = await response.Content.ReadAsStringAsync();

      
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }
    }

    public async Task UpdateAsync(ProductCardSock card)
    {
        string cardAsJson = JsonSerializer.Serialize(card);
        StringContent body = new StringContent(cardAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PatchAsync("Socks", body);
      
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }
}