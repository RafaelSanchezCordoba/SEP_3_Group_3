using Application.DaoInterfaces;
using Shared.Models;

namespace FileData.DAOs;

public class AddressFileDao:IAddressDao

{
    private readonly FileContext context;

    public AddressFileDao(FileContext context)
    {
        this.context = context;
    }

    public Task<Address> Create(Address address)
    {
        int Id = 1;
        if (context.Adresses.Any())
        {
            Id = context.Adresses.Max(u => u.Id);
            Id++;
        }

        address.Id = Id;
        
        context.Adresses.Add(address);
        context.SaveChanges();

        return Task.FromResult(address);
    }

    public Task<IEnumerable<Address>> GetUserAddresses()
    {
        IEnumerable<User> users = context.Users.AsEnumerable();
        List<Address>result = new List<Address>();
        foreach (var u in users)
        {
           
            result.Add(u.Address);
        }

        return Task.FromResult(result.AsEnumerable());
    }

    public Task<IEnumerable<Address>> GetNonUserAddresses()
    {
        IEnumerable<Address> result = context.Adresses.AsEnumerable();
        
        return Task.FromResult(result);
    }

    public Task<Address> GetById(int id)
    {
        Address? existing = context.Adresses.FirstOrDefault(adress =>adress.Id == id);
        
        if (existing == null)
        {
            throw new Exception($"Address with id {id} does not exist!");
        }
        return Task.FromResult(existing);
    }

    public Task UpdateAsync(Address updated)
    {
        Address? existing = context.Adresses.FirstOrDefault(adress => adress.Id == updated.Id);
        if (existing == null)
        {
            throw new Exception($"Address with ID {updated.Id} does not exist!!!");
        }

       
        context.Adresses.Remove(existing);
        context.Adresses.Add(updated);
        context.SaveChanges();
        return Task.CompletedTask;
    }
}