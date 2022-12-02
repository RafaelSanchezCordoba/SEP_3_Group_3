using Shared.Models;

namespace Application.LogicInterfaces;

public interface IUserLogic
{
    Task<User> Register(User user, string password);
    Task<bool> UserExists(string email);
    Task<string> Login(string email, string password);
    int GetUserId();
    string GetUserEmail();
}