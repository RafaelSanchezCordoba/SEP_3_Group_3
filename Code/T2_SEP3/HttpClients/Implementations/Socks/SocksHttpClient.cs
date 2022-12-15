using System.Net.Http.Json;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.Implementations;

public class SocksHttpClient : ISocksService
{
    private readonly HttpClient client;

    public SocksHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<Socks> CreateAsync(CreateSocksDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("Socks", dto);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Socks socks = JsonSerializer.Deserialize<Socks>(result, new JsonSerializerOptions 
            {
                PropertyNameCaseInsensitive = true 
            }
        )!;

        return socks;
    }

    public async Task<Socks> GetByIdAsync(int id)
    {
        HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/socks/{id}");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        Socks socks = JsonSerializer.Deserialize<Socks>(content, 
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            }
        )!;
        return socks;
    }

    public async Task RemoveSocks(int id)
    {
        HttpResponseMessage response = await client.DeleteAsync($"https://localhost:7999/Socks/{id}");
        string content = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }
    }
}