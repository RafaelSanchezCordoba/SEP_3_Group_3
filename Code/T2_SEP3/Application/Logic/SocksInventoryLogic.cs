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




    public async Task<Inventory> CreateAsync(CreateSockInventoryDto dto)
    {
        Inventory result = new Inventory(dto.CardId, dto.Color,dto.Size,dto.Quantity);
        
        Inventory created = await inventoryDao.CreateAsync(result);
        return created;
    }

    public Task<IEnumerable<Inventory>> GetAsync()

    {
        return inventoryDao.GetAsync();
    }


   

    public Task<Inventory> GetById(int id)

    {
        return inventoryDao.GetById(id);
    }


    public Task<IEnumerable<Inventory>> GetByCardIdAsync(int id)

    {
        return inventoryDao.GetByCardIdAsync(id);
    }


    public async Task UpdateAsync(Inventory inventory)

    {
        Inventory? existing = await inventoryDao.GetById(inventory.Id);

        if (existing == null)
        {
            throw new Exception($"Inventory with ID {inventory.Id} not found!!!");
        }
        
        string colorToUse =inventory.Color ?? existing.Color;
        string sizeToUse = inventory.Size ?? existing.Size;
        long quantityToUse = inventory.Quantity ;
        int cardIdToUse =  inventory.CardId;

        Inventory updated = new Inventory(cardIdToUse,colorToUse,sizeToUse,quantityToUse)
        {
            Id = existing.Id
        };
        
        
        await inventoryDao.UpdateAsync((Inventory)updated);
    }




    public async Task DeleteFromCardAsync(int id)
    {

       Task<IEnumerable<Inventory>> toBeDeleted = inventoryDao.GetByCardIdAsync(id);

       if (toBeDeleted==null)
       {
           throw new Exception($"Sock Card with id{id} does not have any stock!!!");
       }

       await inventoryDao.DeleteFromCardAsync(id);
       
    }

    public async Task DeleteAsync(int id)
    {

     
        Inventory? stock = await inventoryDao.GetById(id);

        if (stock == null)
        {
            throw new Exception($"Stock with ID {id} was not found!!!");
        }

        await inventoryDao.DeleteAsync(id);
       
    }
}