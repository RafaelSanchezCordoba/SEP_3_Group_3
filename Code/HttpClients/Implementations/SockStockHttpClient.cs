using System.Net.Http.Json;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.Implementations;

public class SockStockHttpClient:ISockStockService
{
    
    private readonly HttpClient client;
    private ISockStockService service;

    public SockStockHttpClient(HttpClient client)
    {
        this.client = client;
    }
    
    public async Task<Stock> CreateAsync(CreateSockStockDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("SockStock", dto);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Stock product = JsonSerializer.Deserialize<Stock>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;

        return product;
    }
}