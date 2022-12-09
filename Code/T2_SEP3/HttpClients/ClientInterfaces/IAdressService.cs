using Shared.DTOs;

namespace HttpClients.ClientInterfaces;

public interface IAdressService
{
    Task UpdateAsync(UpdateAdressDto dto);
}