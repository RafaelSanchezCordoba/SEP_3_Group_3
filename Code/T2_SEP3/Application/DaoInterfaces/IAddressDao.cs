using Shared.Models;

namespace Application.DaoInterfaces;

public interface IAddressDao
{ 
    Task<Address> Create(Address address);
    Task<IEnumerable<Address>> GetUserAddresses();
    Task<IEnumerable<Address>> GetNonUserAddresses();
    Task<Address> GetById(int id);
    Task UpdateAsync(Address updated);
}