using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

public class SockStockLogic:ISockStockLogic
{
    
    private readonly ISockStockDao stockDao;

    public SockStockLogic(ISockStockDao stockDao)
    {
        this.stockDao = stockDao;
    }
    public async Task<Stock> CreateAsync(CreateSockStockDto dto)
    {
        Stock result = new Stock(dto.CardId, dto.Color,dto.Size,dto.Quantity);
        
        Stock created = await stockDao.CreateAsync(result);
        return created;
    }

    public Task<IEnumerable<Stock>> GetAsync()
    {
        return stockDao.GetAsync();
    }

    public Task<Stock> GetById(int id)
    {
        return stockDao.GetById(id);
    }

    public Task<IEnumerable<Stock>> GetByCardIdAsync(int id)
    {
        return stockDao.GetByCardIdAsync(id);
    }

    public Task UpdateAsync(Stock dto)
    {
        throw new NotImplementedException();
    }

    public async Task DeleteFromCardAsync(int id)
    {
       Task<IEnumerable<Stock>> toBeDeleted = stockDao.GetByCardIdAsync(id);
       if (toBeDeleted==null)
       {
           throw new Exception($"Sock Card with id{id} does not have any stock!!!");
       }

       await stockDao.DeleteFromCardAsync(id);
       
    }

    public async Task DeleteAsync(int id)
    {
        Stock? stock = await stockDao.GetById(id);
        if (stock == null)
        {
            throw new Exception($"Stock with ID {id} was not found!!!");
        }

        await stockDao.DeleteAsync(id);
       
    }
}