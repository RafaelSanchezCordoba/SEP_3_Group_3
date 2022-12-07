using System.Security.Claims;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface IUserService
{
    Task CreateAsync(User user, string password);
    Task LoginAsync(string email, string password);
    Task LogoutAsync();
    Task<ClaimsPrincipal> GetAuthAsync();
    
    Task<User> GetByEmail(string email);

    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }

}