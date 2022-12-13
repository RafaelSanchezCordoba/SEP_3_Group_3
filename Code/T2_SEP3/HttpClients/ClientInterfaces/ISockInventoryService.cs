using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface ISockInventoryService
{
    Task<Inventory> CreateAsync(CreateInventoryDto dto);

    //Task<ICollection<Inventory>> GetByCardIdAsync(int cardId);
    Task<Inventory> getByIdAsync(int id);
    Task<Inventory> updateAsync(Inventory inventory);
    Task<ICollection<Inventory>> GetByCardIdAsync(int id);
    Task<Inventory> GetByParameters(int scId, String color, String size);

   

   
   

}