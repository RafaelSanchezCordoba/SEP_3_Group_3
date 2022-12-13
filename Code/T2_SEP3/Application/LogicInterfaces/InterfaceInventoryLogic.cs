using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface InterfaceInventoryLogic
{
    Task<Inventory> CreateAsync(CreateInventoryDto dto);
    Task<IEnumerable<Inventory>> GetAsync();
    Task<Inventory> GetById(int id);
    Task<IEnumerable<Inventory>> GetByCardIdAsync(int id);
    Task UpdateAsync(Inventory dto);
    Task DeleteFromCardAsync(int id);
    Task DeleteAsync(int id);
    Task<Inventory> GetByParameters(int scId, String color, String size);

}