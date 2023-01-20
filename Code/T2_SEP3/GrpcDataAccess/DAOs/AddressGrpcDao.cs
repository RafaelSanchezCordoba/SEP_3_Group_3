using Application.DaoInterfaces;
using Grpc.Core;
using Shared.Models;

namespace GrpcDataAccess.DAOs;

public class AddressGrpcDao:IAddressDao
{
    static Channel channel = new Channel("localhost:9999", ChannelCredentials.Insecure);
    private AddressAndUserGrpc.AddressAndUserGrpcClient stub = new AddressAndUserGrpc.AddressAndUserGrpcClient(channel);

    public Task<Address> Create(Address address)
    {
        var req = new address()
        { 
            Id = address.Id,
           UserId = address.UserId,
           Country = address.Country,
           City = address.City,
           PostCode = address.PostCode,
           Street = address.Street,
           Number = address.Number,
           ExtraInfo = address.ExtraInfo
        };

        try
        {
            var resp =  stub.CreateAddress(req);
           Address newAddress = new Address(resp.Id,resp.UserId,resp.Country,resp.City,(int)resp.PostCode,resp.Street,resp.Number,resp.ExtraInfo);
            newAddress.Id = resp.Id;
            return Task.FromResult(newAddress);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }

    public async Task<IEnumerable<Address>> GetUserAddresses()
    {
        var req = new EmptyAddressMessage();
        using var call = stub.GetAllAddresses(req);
        List<Address> list = new List<Address>();

        while (await call.ResponseStream.MoveNext())
        {
            var resp = call.ResponseStream.Current;
            Address newAddress = new Address(resp.Id,resp.UserId,resp.Country,resp.City,(int)resp.PostCode,resp.Street,resp.Number,resp.ExtraInfo);
            newAddress.Id = resp.Id;
            list.Add(newAddress);
        }
        Console.WriteLine(list.Count);
        return await Task.FromResult(list.AsEnumerable());
    }

    public Task<IEnumerable<Address>> GetNonUserAddresses()
    {
        throw new NotImplementedException();
    }

    public Task<Address> GetById(int id)
    {
        var req = new IntReqAddress()
        {
            Request = id
        };
        var resp = stub.GetAddressById(req);
        Address address = new Address(resp.Id,resp.UserId,resp.Country,resp.City,(int)resp.PostCode,resp.Street,resp.Number,resp.ExtraInfo);
        address.Id = resp.Id;
        return Task.FromResult(address);
    }

    public Task UpdateAsync(Address updated)
    {
        var req = new addressUpdateMessage()
        {
            OwnerId = updated.UserId,
            Country = updated.Country,
            City = updated.City,
            PostCode = updated.PostCode,
            Street = updated.Street,
            Number = updated.Number,
            ExtraInfo = updated.ExtraInfo
        };
        var resp = stub.UpdateAddress(req);
        return Task.CompletedTask;
    }
}