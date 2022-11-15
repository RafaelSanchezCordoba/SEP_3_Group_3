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

    public Task UpdateAsync(Inventory dto)
    {
        throw new NotImplementedException();
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