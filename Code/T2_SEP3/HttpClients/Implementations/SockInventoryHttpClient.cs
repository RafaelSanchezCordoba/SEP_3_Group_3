using System.Net.Http.Json;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.Implementations;

public class SockInventoryHttpClient:ISockInventoryService
{
    
    private readonly HttpClient client;
    private ISockInventoryService service;

    public SockInventoryHttpClient(HttpClient client)
    {
        this.client = client;
        
    }

    public async Task<Inventory> CreateAsync(CreateSockInventoryDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("SocksInventory", dto);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Inventory inventory = JsonSerializer.Deserialize<Inventory>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return inventory;
    }
}