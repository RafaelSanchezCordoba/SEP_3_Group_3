using System.Net.Http.Json;
using System.Security.Claims;
using System.Text;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.Implementations;

public class JwtUserService:IUserService
{
    private readonly HttpClient client = new();

    public static string? Jwt { get; private set; } = "";

    public async Task<User> GetByEmail(string? email)
    {
        HttpResponseMessage response = await client.GetAsync($"https://localhost:7999/user/{email}");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        User user = JsonSerializer.Deserialize<User>(content, 
            new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            }
        )!;
        return user;
    }

    public  Action<ClaimsPrincipal> OnAuthStateChanged { get; set; } = null!;

    public  async Task<User> CreateAsync(UserRegisterDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("https://localhost:7999/User", dto);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        User user = JsonSerializer.Deserialize<User>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return user;
    }

    public async Task EditAsync(User user)
    {
        
        UpdateUserDto dto = new UpdateUserDto
        {
            Id = user.Id,
            Name = user.Name,
            Password = user.Password,
            PhoneNumber = user.PhoneNumber
        };
        string userAsJson = JsonSerializer.Serialize(dto);
        StringContent body = new StringContent(userAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PatchAsync("https://localhost:7999/User", body);
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(response.ToString());
        }
      
    }

    public async Task LoginAsync(string email, string password)
    {
        UserLoginDto userLoginDto = new()
        {
            Email = email,
            Password = password
        };

        string userAsJson = JsonSerializer.Serialize(userLoginDto);
        StringContent content = new(userAsJson, Encoding.UTF8, "application/json");


        HttpResponseMessage response = await client.PostAsync("https://localhost:7999/User/login",content);
        string responseContent = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }

        string token = responseContent;
        Jwt = token;

        ClaimsPrincipal principal = CreateClaimsPrincipal();
        OnAuthStateChanged.Invoke(principal);
    }

    public Task LogoutAsync()
    {
        Jwt = null;
        ClaimsPrincipal principal = new();
        OnAuthStateChanged.Invoke(principal);
        return Task.CompletedTask;
    }

    public Task<ClaimsPrincipal> GetAuthAsync()
    {
       
        ClaimsPrincipal principal = CreateClaimsPrincipal();
        return Task.FromResult(principal);
    }
    private static ClaimsPrincipal CreateClaimsPrincipal()
    {
        if (string.IsNullOrEmpty(Jwt))
        {
            return new ClaimsPrincipal();
        }

        IEnumerable<Claim> claims = ParseClaimsFromJwt(Jwt);
    
        ClaimsIdentity identity = new(claims, "jwt");

        ClaimsPrincipal principal = new(identity);
        return principal;
    }

    
    private static IEnumerable<Claim> ParseClaimsFromJwt(string jwt)
    {
        string payload = jwt.Split('.')[1];
        byte[] jsonBytes = ParseBase64WithoutPadding(payload);
        Dictionary<string, object>? keyValuePairs = JsonSerializer.Deserialize<Dictionary<string, object>>(jsonBytes);
        return keyValuePairs!.Select(kvp => new Claim(kvp.Key, kvp.Value.ToString()!));
    }

    private static byte[] ParseBase64WithoutPadding(string base64)
    {
        switch (base64.Length % 4)
        {
            case 2:
                base64 += "==";
                break;
            case 3:
                base64 += "=";
                break;
        }

        return Convert.FromBase64String(base64);
    }



}