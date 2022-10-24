using System.Net.Http.Json;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.Implementations;

public class SockHttpClient:ISockService
{
    private readonly HttpClient client;

    public SockHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<ProductCard> Create(CreateSockCardDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("Socks", dto);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        ProductCard product = JsonSerializer.Deserialize<ProductCard>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;

        return product;
    }
}