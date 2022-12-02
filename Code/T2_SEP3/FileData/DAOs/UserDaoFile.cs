using Application.DaoInterfaces;
using Shared.Models;

namespace FileData.DAOs;

public class UserDaoFile:IUserDao
{
    private readonly FileContext context;

    public UserDaoFile(FileContext context)
    {
        this.context = context;
    }

    public Task<User> Register(User user, string password)
    {
        int Id = 1;
        if (context.Users.Any())
        {
            Id = context.Users.Max(u => u.Id);
            Id++;
        }
        User exists = context.Users.FirstOrDefault(u =>  user.Email.Equals(u.Email));
        if (exists!=null)
        {
            throw new Exception($"User with email::${user.Email} already exists ");
        }

        user.Password = password;
        user.Id = Id;
        context.Users.Add(user);
        context.SaveChanges();
        
        return Task.FromResult(user);
    }
}