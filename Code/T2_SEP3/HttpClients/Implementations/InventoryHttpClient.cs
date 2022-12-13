using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.Implementations;

public class InventoryHttpClient:InterfaceInventoryService 
{
    
    private readonly HttpClient client;
    private InterfaceInventoryService service;

    public InventoryHttpClient(HttpClient client)
    {
        this.client = client;
        
    }
    

    public async Task<Inventory> CreateAsync(CreateInventoryDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("Inventory", dto);
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


    
        public async Task<ICollection<Inventory>> GetByCardIdAsync(int id)
        {
            HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/Inventory/Card{id}");

            string content = await response.Content.ReadAsStringAsync();
            if (!response.IsSuccessStatusCode)
            {
                throw new Exception(content);
            }


            ICollection<Inventory> inventories = JsonSerializer.Deserialize<ICollection<Inventory>>(content,
                new JsonSerializerOptions
                {
                    PropertyNameCaseInsensitive = true
                })!;
            return inventories;
        }

        public async Task<Inventory> GetByParameters(int scId, string color, string size)
        {
            HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/Parameters?scId={scId}&color={color}&size={size}");
            string content = await response.Content.ReadAsStringAsync();
            if (!response.IsSuccessStatusCode)
            {
                throw new Exception(content);
            }

            Inventory inventory = JsonSerializer.Deserialize<Inventory>(content,
                new JsonSerializerOptions
                {
                    PropertyNameCaseInsensitive = true
                }
            )!;
            return inventory;
        }

        public async Task<Inventory> GetByIdAsync(int id)
        {
            HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/Inventory/{id}");
            string content = await response.Content.ReadAsStringAsync();
            if (!response.IsSuccessStatusCode)
            {
                throw new Exception(content);
            }

            Inventory inventory = JsonSerializer.Deserialize<Inventory>(content,
                new JsonSerializerOptions
                {
                    PropertyNameCaseInsensitive = true
                }
            )!;
            return inventory;
        }

        public async Task<Inventory> UpdateAsync(Inventory inventory)
        {
            string inventoryAsJson = JsonSerializer.Serialize(inventory);
            StringContent body = new StringContent(inventoryAsJson, Encoding.UTF8, "application/json");
            HttpResponseMessage response = await client.PatchAsync($"https://localhost:7999/Inventory/", body);
            string content = await response.Content.ReadAsStringAsync();
            if (!response.IsSuccessStatusCode)
            {
                throw new Exception(content);
            }

            var inventoryResult = string.IsNullOrEmpty(content)?null
                : JsonSerializer.Deserialize<Inventory>(content,
                new JsonSerializerOptions
                {
                    PropertyNameCaseInsensitive = true
                }
            )!;

            return inventoryResult;

        }
    }