using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;


public class SocksInventoryLogic:ISocksInventoryLogic
{
    private readonly ISocksInventoryDao inventoryDao;

    public SocksInventoryLogic(ISocksInventoryDao inventoryDao)
    {
        this.inventoryDao = inventoryDao;
    }
    
    public async Task<Inventory> CreateAsync(CreateInventoryDto dto)
    {
        Inventory result = new Inventory(dto.CardId, dto.Color,dto.Size,dto.Quantity);
        ValidateInventory(result);
        Inventory created = await inventoryDao.CreateAsync(result);
        return created;
    }

    public async Task<IEnumerable<Inventory>> GetAsync()
    {
        return await inventoryDao.GetAsync() ?? throw new Exception("Inventories were not found!!!");
    }
    
    public async Task<Inventory> GetById(int id)
    {
        ValidateInventoryById(id);
        return await inventoryDao.GetById(id) ?? throw new Exception($"Inventory with id {id} was not found!!!");
    }

    public async Task<IEnumerable<Inventory>> GetByCardIdAsync(int id)
    {
        ValidateInventoryById(id);
        return await inventoryDao.GetByCardIdAsync(id) ?? throw new Exception($"Inventories with id {id} were not found!!!");
    }
    
    public Task UpdateAsync(Inventory inventory)
    {
        ValidateInventory(inventory);
        if (inventory.Quantity <= 0)
        {
            throw new Exception("There is no more available stock!!!");
        }
        return inventoryDao.UpdateAsync(inventory) ?? throw new Exception($"Inventory with ID {inventory.Id} not found!!!");
    }
    
    public Task DeleteFromCardAsync(int id)
    {
        ValidateInventoryById(id);
       return inventoryDao.DeleteFromCardAsync(id) ?? throw new Exception($"Sock Card with id{id} does not have any stock!!!");
    }

    public Task DeleteAsync(int id)
    {
        ValidateInventoryById(id);
        return inventoryDao.DeleteAsync(id) ?? throw new Exception($"Inventory with ID {id} was not found!!!");
    }

    public async Task<Inventory> GetByParameters(int scId, string color, string size)
    {
        ValidateInventoryById(scId);
        ValidateInventoryString(color);
        ValidateInventoryString(size);

        return await inventoryDao.GetByParameters(scId, color, size) ??
               throw new Exception(
                   $"Inventory with sockcardId, size amd  color :  {scId}, {color}, {size} was not found!!!");
    }

    public void ValidateInventory(Inventory inventory)
    {
        if (string.IsNullOrEmpty(inventory.Color)) throw new Exception("Color cannot be empty!!!");
        if (string.IsNullOrEmpty(inventory.Size)) throw new Exception("Size cannot be empty!!!");
        if (inventory.Quantity < 0) throw new Exception("Quantity cannot be negative!!!");
        if (inventory.CardId <= 0) throw new Exception("Card id must be > 0!!!");
    }
    
    public void ValidateInventoryById(int id)
    {
        if (id <= 0) throw new Exception("Card id must be > 0!!!");
    }
    public void ValidateInventoryString(String message)
    {
        if (String.IsNullOrEmpty(message)) throw new Exception("Parameter empty!!!");
    }
}