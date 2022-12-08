using Shared.Models;

namespace Application.DaoInterfaces;

public interface IUserDao
{
    Task<User> Register(User user, string password);

    Task<User> Validateuser(string email, string password);

    Task<Boolean> UserExists(int id);

    Task<User> GetById(int id);

    Task<User> UpdateUser(User user);

    Task<User> GetByEmail(string email);

}