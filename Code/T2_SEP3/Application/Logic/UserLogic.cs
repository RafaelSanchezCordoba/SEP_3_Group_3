using System.Diagnostics.CodeAnalysis;
using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
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

    public async Task<User> Update(User user)
    {
        User? existing = await context.GetById(user.Id);

        if (existing == null)
        {
            throw new Exception($"User with ID {user.Id} not found!!!");
        }
        
        string passwordToUse =user.Password ?? existing.Password;
        string nameToUse = user.Name ?? existing.Name;
        string PhoneToUse = user.PhoneNumber ?? existing.PhoneNumber ;
        string AuthToUse = user.Auth ?? existing.Auth ;
        Adress adressToUse = null;
        if (user.Adress!=null)
        {
            adressToUse = user.Adress;
        } 
        else if (existing.Adress!=null)
        {
            adressToUse = existing.Adress;
        }
        
        User updated = new User()
        {
            Id = existing.Id,
            Password = passwordToUse,
            Name = nameToUse,
            PhoneNumber = PhoneToUse,
            Adress = adressToUse,
            Auth = AuthToUse,
            Email = existing.Email
        };

        await context.UpdateUser(updated);
        return updated;
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

    public Task<User> GetByEmail(string email)
    {
        return context.GetByEmail(email);
    }
}