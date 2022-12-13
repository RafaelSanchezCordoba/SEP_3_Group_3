using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface InterfaceInventoryService
{
    Task<Inventory> CreateAsync(CreateInventoryDto dto);
    Task<Inventory> GetByIdAsync(int id);
    Task<Inventory> UpdateAsync(Inventory inventory);
    Task<ICollection<Inventory>> GetByCardIdAsync(int id);
    Task<Inventory> GetByParameters(int scId, String color, String size);
}