using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface ISockInventoryService
{
    Task<Inventory> CreateAsync(CreateSockInventoryDto dto);

}