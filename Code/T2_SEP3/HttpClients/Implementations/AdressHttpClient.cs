using System.Text;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.Implementations;

public class AdressHttpClient:IAdressService
{
    private readonly HttpClient client;
    
    
    public async Task UpdateAsync(UpdateAdressDto dto)
    {
      
        string adressAsJson = JsonSerializer.Serialize(dto);
        StringContent body = new StringContent(adressAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PatchAsync("https://localhost:7999/Adress", body);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }
}