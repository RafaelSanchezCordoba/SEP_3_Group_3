using System.Net.Http.Json;
using System.Text.Json;
using HttpClients.ClientInterfaces.Trouser;
using Shared.DTOs.Trousers;
using Shared.Models;

namespace HttpClients.Implementations.Trouser;

public class TrouserHttpClient : ITrouserService
{
    private readonly HttpClient client;
    private ITrouserService trouserService;

    public TrouserHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<Shared.Models.Trouser> CreateAsync(CreateTrouserDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("Trouser", dto);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Shared.Models.Trouser trouser = JsonSerializer.Deserialize<Shared.Models.Trouser>(result, new JsonSerializerOptions 
            {
                PropertyNameCaseInsensitive = true 
            }
        )!;

        return trouser;
    }

    public async Task<Shared.Models.Trouser> GetByIdAsync(int id)
    {
        HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/trouser/{id}");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        Shared.Models.Trouser trouser = JsonSerializer.Deserialize<Shared.Models.Trouser>(content, 
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            }
        )!;
        return trouser;
    }

    public async Task RemoveSocks(int id)
    {
        HttpResponseMessage response = await client.DeleteAsync($"https://localhost:7999/Trosuer/{id}");
        string content = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }
    }
}