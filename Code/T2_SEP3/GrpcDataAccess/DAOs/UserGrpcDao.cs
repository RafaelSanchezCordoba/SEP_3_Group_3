using Application.DaoInterfaces;
using Grpc.Core;
using Shared.Models;

namespace GrpcDataAccess.DAOs;

public class UserGrpcDao : IUserDao
{
    static Channel channel = new Channel("localhost:9999", ChannelCredentials.Insecure);
    private AddressAndUserGrpc.AddressAndUserGrpcClient stub = new AddressAndUserGrpc.AddressAndUserGrpcClient(channel);

    public Task<User> Register(User user, string password)
    {
        var req = new loginMessage()
        {
            Email = user.Email,Password = password
        };
        try
        {
            var resp =  stub.RegisterUser(req);
            resp.ToString();
            User newUser = new User(){Email = resp.Email,Password = password};
            newUser.Id = resp.Id;
            return Task.FromResult(newUser);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }

    public Task<User> Validateuser(string email, string password)
    {
        var req = new loginMessage()
        {
            Email = email,Password = password
        };
        try
        {
            var resp2 = stub.Login(req);

            if (resp2.Message.Equals(email))
            {
                var req2 = new StringMessageAddress() { Message = email };
                var resp = stub.GetUserByEmail(req2);
                User user = new User()
                {
                    Id = resp.Id,
                    Email = resp.Email,
                    //     Password = resp.Password,
                   // Address = new Address(resp.Address.Id, resp.Id,
                    //    resp.Address.Country, resp.Address.City, (int)resp.Address.PostCode, resp.Address.Street,
                      //  resp.Address.Number, resp.Address.ExtraInfo),
                    Auth = resp.Auth,// Name = resp.Name, PhoneNumber = resp.PhoneNumber
                };
                return Task.FromResult(user);
            }

            return null;
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }

    public Task<bool> UserExists(int id)
    {
        throw new NotImplementedException();
    }

    public Task<User> GetById(int id)
    {
        var req = new IntReqAddress()
        {
            Request = id
        };
        var resp = stub.GetUserById(req);
        User user = new User()
        {
            Id = resp.Id,
            Email = resp.Email,
       //     Password = resp.Password,
            Address = new Address(resp.Address.Id, resp.Id,
                resp.Address.Country,resp.Address.City,(int)resp.Address.PostCode,resp.Address.Street,resp.Address.Number,resp.Address.ExtraInfo),
            Auth = resp.Auth,Name = resp.Name,PhoneNumber = resp.PhoneNumber
                };
        user.Id = resp.Id;
        return Task.FromResult(user);
    }
       
      

    public Task<User> UpdateUser(User user)
    {
        var req = new user()
        {
            Id = user.Id,
            Email = user.Email,
            //     Password = resp.Password,
            Address = new address()
            {
                Id = user.Address.Id, UserId = user.Id,
                Country = user.Address.Country, City = user.Address.City, PostCode = user.Address.PostCode,
                Street = user.Address.Street, Number = user.Address.Number, ExtraInfo = user.Address.ExtraInfo
            },
            Auth = user.Auth, Name = user.Name, PhoneNumber = user.PhoneNumber
        };
        stub.UpdateUser(req);
        return Task.FromResult(user);
    }

    public Task<User> GetByEmail(string email)
    {
        var req = new StringMessageAddress()
        {
            Message = email };
        var resp = stub.GetUserByEmail(req);
        User user = new User()
        {
            Id = resp.Id,
            Email = resp.Email,
            //     Password = resp.Password,
           // Address = new Address(resp.Address.Id, resp.Id,
           //     resp.Address.Country,resp.Address.City,(int)resp.Address.PostCode,resp.Address.Street,resp.Address.Number,resp.Address.ExtraInfo),
            Auth = resp.Auth,
            //Name = resp.Name,PhoneNumber = resp.PhoneNumber
        };
        user.Id = resp.Id;
        return Task.FromResult(user);
    }
}