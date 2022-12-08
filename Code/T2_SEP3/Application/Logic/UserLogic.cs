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

    public async Task<User> Update(UpdateUserDto dto)
    {
        User? existing = await context.GetById(dto.Id);

        if (existing == null)
        {
            throw new Exception($"User with ID {dto.Id} not found!!!");
        }
        
        string passwordToUse =dto.Password ?? existing.Password;
        string nameToUse = dto.Name ?? existing.Name;
        string PhoneToUse = dto.PhoneNumber ?? existing.PhoneNumber ;
        
        User updated = new User()
        {
            Id = existing.Id,
            Password = passwordToUse,
            Name = nameToUse,
            PhoneNumber = PhoneToUse
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