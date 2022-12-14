using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.Implementations;

public class ShoppingCartHttpClient:IShoppingCartService
{
    private readonly HttpClient client;
    

    public ShoppingCartHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<ShoppingCart> CreateAsync(CreateShoppingCartDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("shoppingCart", dto);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        ShoppingCart shoppingCart = JsonSerializer.Deserialize<ShoppingCart>(result, new JsonSerializerOptions 
            {
                PropertyNameCaseInsensitive = true 
            }
        )!;

        return shoppingCart;
    }

    public async Task<ICollection<ShoppingCart>> GetAsync()
    {
        HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/shoppingCart");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        ICollection<ShoppingCart> shoppingCarts = JsonSerializer.Deserialize<ICollection<ShoppingCart>>(content, 
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            }
        )!;
        return shoppingCarts;
    }

    public async Task<ICollection<Product>> GetProducts(int id)
    {
        HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/ShoppingCart/products/{id}");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        ICollection<Product> products = JsonSerializer.Deserialize<ICollection<Product>>(content,
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
      
        return products;
    }
    
    

    public async Task<ShoppingCart> getByIdAsync(int id)
    {
        HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/shoppingCart/{id}");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        ShoppingCart shoppingCart = JsonSerializer.Deserialize<ShoppingCart>(content, 
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            }
        )!;
        return shoppingCart;
    }

    public async Task<ShoppingCart> AddProductAsync(Product product, int shoppingCartId)
    {
       HttpResponseMessage response = await client.PostAsJsonAsync($"https://localhost:7999/shoppingCart/{shoppingCartId}", product);
              string result = await response.Content.ReadAsStringAsync();
        
        
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
       
        ShoppingCart shoppingCart = JsonSerializer.Deserialize<ShoppingCart>(result, new JsonSerializerOptions 
                    {
                        PropertyNameCaseInsensitive = true 
                    }
                )!;
       
 return shoppingCart;
      
    }

    public async Task<ShoppingCart> RemoveProduct(Product product, int id)
    {
        string productAsJson = JsonSerializer.Serialize(product);
        StringContent body = new StringContent(productAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PatchAsync($"https://localhost:7999/shoppingCart/products/{id}", body);
        string content = await response.Content.ReadAsStringAsync();
       
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }
        
        ShoppingCart shoppingCart = JsonSerializer.Deserialize<ShoppingCart>(content, 
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            }
        )!;
        
        return shoppingCart;
    }

    public async Task<ShoppingCart> getByUserIdAsync(int id)
    {
        HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/ShoppingCart/userId/{id}");
        string content = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        ShoppingCart shoppingCart = JsonSerializer.Deserialize<ShoppingCart>(content,
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
        return shoppingCart;
    }



    public async Task<double> GetTotalPrice(int id)
    {
      
  
        HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/ShoppingCart/TotalPrice/{id}");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }
       
        
        double totalPrice = JsonSerializer.Deserialize<double>(content,
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            }
        )!;

        return totalPrice;

    }
}