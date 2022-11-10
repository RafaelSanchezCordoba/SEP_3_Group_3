using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

public class SocksInventoryLogic:ISockStockLogic
{
    
    private readonly ISocksInventoryDao inventoryDao;

    public SocksInventoryLogic(ISocksInventoryDao inventoryDao)
    {
        this.inventoryDao = inventoryDao;
    }
    public async Task<Stock> CreateAsync(CreateSockStockDto dto)
    {
        Stock result = new Stock(dto.CardId, dto.Color,dto.Size,dto.Quantity);
        
        Stock created = await inventoryDao.CreateAsync(result);
        return created;
    }

    public Task<IEnumerable<Stock>> GetAsync()
    {
        return inventoryDao.GetAsync();
    }

    public Task<Stock> GetById(int id)
    {
        return inventoryDao.GetById(id);
    }

    public Task<IEnumerable<Stock>> GetByCardIdAsync(int id)
    {
        return inventoryDao.GetByCardIdAsync(id);
    }

    public Task UpdateAsync(Stock dto)
    {
        throw new NotImplementedException();
    }

    public async Task DeleteFromCardAsync(int id)
    {
       Task<IEnumerable<Stock>> toBeDeleted = inventoryDao.GetByCardIdAsync(id);
       if (toBeDeleted==null)
       {
           throw new Exception($"Sock Card with id{id} does not have any stock!!!");
       }

       await inventoryDao.DeleteFromCardAsync(id);
       
    }

    public async Task DeleteAsync(int id)
    {
        Stock? stock = await inventoryDao.GetById(id);
        if (stock == null)
        {
            throw new Exception($"Stock with ID {id} was not found!!!");
        }

        await inventoryDao.DeleteAsync(id);
       
    }
}