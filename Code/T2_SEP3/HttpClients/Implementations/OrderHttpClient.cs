using System.Net.Http.Json;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.Implementations;

public class OrderHttpClient:IOrderService
{
    private readonly HttpClient client;
 

    public OrderHttpClient(HttpClient client)
    {
        this.client = client;
    }
    
    public async Task<Order> CreateAsync(CreateOrderDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("Order", dto);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Order order = JsonSerializer.Deserialize<Order>(result, new JsonSerializerOptions 
            {
                PropertyNameCaseInsensitive = true 
            }
        )!;

        return order;
    }
    
}