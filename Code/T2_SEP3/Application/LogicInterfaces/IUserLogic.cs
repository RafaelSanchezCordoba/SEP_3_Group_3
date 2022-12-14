using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface IUserLogic
{
    Task<User> Register(User user, string password);
    Task<bool> UserExists(string email);
    Task<User> ValidateUser(string email, string password);

    Task<User> Update(User user);
    Task<string> Login(string email, string password);
    int GetUserId();
    string GetUserEmail();
    Task<User> GetByEmail(string email);
}