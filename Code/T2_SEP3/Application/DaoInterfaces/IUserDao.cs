using Shared.Models;

namespace Application.DaoInterfaces;

public interface IUserDao
{
    Task<User> Register(User user, string password);

    Task<User> Validateuser(string email, string password);
    Task<User> GetByEmail(string email);
}