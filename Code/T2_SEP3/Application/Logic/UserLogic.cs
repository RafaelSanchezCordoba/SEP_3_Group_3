using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.Models;

namespace Application.Logic;

public class UserLogic:IUserLogic
{
    private readonly IUserDao context;
   

    public UserLogic(IUserDao context)
    {
        this.context = context;
    }
    public Task<User> Register(User user, string password)
    {
        User result = new User
        {
            Email = user.Email,
            Password = user.Password,
            
        };
       
        return context.Register(result,password);

    }

    public Task<bool> UserExists(string email)
    {
        throw new NotImplementedException();
    }

    public Task<User> ValidateUser(string email, string password)
    {
        return context.Validateuser(email, password);
    }

    public Task<User> Update(User user)
    {
        return context.UpdateUser(user);
    }

    public Task<string> Login(string email, string password)
    {
        throw new NotImplementedException();
    }

    public int GetUserId()
    {
        throw new NotImplementedException();
    }

    public string GetUserEmail()
    {
        throw new NotImplementedException();
    }
}