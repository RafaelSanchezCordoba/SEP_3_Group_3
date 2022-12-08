using System.Security.Claims;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface IUserService
{
    Task<User> CreateAsync(UserRegisterDto dto);
    Task<User> EditAsync(User user);
    Task LoginAsync(string email, string password);
    Task LogoutAsync();
    Task<ClaimsPrincipal> GetAuthAsync();
    
    Task<User> GetByEmail(string? email);

    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }

}