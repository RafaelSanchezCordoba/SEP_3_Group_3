using System.Net.Http.Json;
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

    /*public async Task<ICollection<ProductCardBasicDto>> GetTitlesAsync()
    {
        HttpResponseMessage response = await client.GetAsync("/Post");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        ICollection<ProductCardBasicDto> socks = JsonSerializer.Deserialize<ICollection<ProductCardBasicDto>>(content,
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
        return socks;
    }*/
}