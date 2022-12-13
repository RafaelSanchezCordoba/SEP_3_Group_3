using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface IAddressLogic
{
    Task<Address> CreateAsync(Address address);

    Task<IEnumerable<Address>> GetUserAddresses();

    Task<IEnumerable<Address>> GetNonUserAddresses();

    Task<Address> GetByUserId(int id);

    Task UpdateAsync(UpdateAdressDto dto);
    Task<Address> GetById(int id);
}