using System.Net.Http.Json;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.Models;

namespace HttpClients.Implementations;

public class UserHttpClient:IUserService
{

    private readonly HttpClient client;
    private IUserService userService;

    public UserHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<User> CreateAsync(User user, string password)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("Users", user);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        User userToReturn = JsonSerializer.Deserialize<User>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return userToReturn;
    }
    
}
