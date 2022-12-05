using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface ISockInventoryService
{
    Task<Inventory> CreateAsync(CreateSockInventoryDto dto);
    Task<ICollection<Inventory>> GetByCardIdAsync(int cardId);
    Task<Inventory> getByIdAsync(int id);
    Task<Inventory> updateAsync(Inventory inventory);
}