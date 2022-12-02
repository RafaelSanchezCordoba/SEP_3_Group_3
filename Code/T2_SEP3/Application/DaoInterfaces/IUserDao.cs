using Shared.Models;

namespace Application.DaoInterfaces;

public interface IUserDao
{
    Task<User> Register(User user, string password);
}