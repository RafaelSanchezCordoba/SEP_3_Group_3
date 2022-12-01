using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

<<<<<<< HEAD
public class SocksInventoryLogic:ISockStockLogic
=======
public class SocksInventoryLogic:ISocksInventoryLogic
>>>>>>> new-master
{
    
    private readonly ISocksInventoryDao inventoryDao;

    public SocksInventoryLogic(ISocksInventoryDao inventoryDao)
    {
        this.inventoryDao = inventoryDao;
    }
<<<<<<< HEAD
    public async Task<Stock> CreateAsync(CreateSockStockDto dto)
    {
        Stock result = new Stock(dto.CardId, dto.Color,dto.Size,dto.Quantity);
        
        Stock created = await inventoryDao.CreateAsync(result);
        return created;
    }

    public Task<IEnumerable<Stock>> GetAsync()
=======
    public async Task<Inventory> CreateAsync(CreateSockInventoryDto dto)
    {
        Inventory result = new Inventory(dto.CardId, dto.Color,dto.Size,dto.Quantity);
        
        Inventory created = await inventoryDao.CreateAsync(result);
        return created;
    }

    public Task<IEnumerable<Inventory>> GetAsync()
>>>>>>> new-master
    {
        return inventoryDao.GetAsync();
    }

<<<<<<< HEAD
    public Task<Stock> GetById(int id)
=======
    public Task<Inventory> GetById(int id)
>>>>>>> new-master
    {
        return inventoryDao.GetById(id);
    }

<<<<<<< HEAD
    public Task<IEnumerable<Stock>> GetByCardIdAsync(int id)
=======
    public Task<IEnumerable<Inventory>> GetByCardIdAsync(int id)
>>>>>>> new-master
    {
        return inventoryDao.GetByCardIdAsync(id);
    }

<<<<<<< HEAD
    public Task UpdateAsync(Stock dto)
=======
    public Task UpdateAsync(Inventory dto)
>>>>>>> new-master
    {
        throw new NotImplementedException();
    }

    public async Task DeleteFromCardAsync(int id)
    {
<<<<<<< HEAD
       Task<IEnumerable<Stock>> toBeDeleted = inventoryDao.GetByCardIdAsync(id);
=======
       Task<IEnumerable<Inventory>> toBeDeleted = inventoryDao.GetByCardIdAsync(id);
>>>>>>> new-master
       if (toBeDeleted==null)
       {
           throw new Exception($"Sock Card with id{id} does not have any stock!!!");
       }

       await inventoryDao.DeleteFromCardAsync(id);
       
    }

    public async Task DeleteAsync(int id)
    {
<<<<<<< HEAD
        Stock? stock = await inventoryDao.GetById(id);
=======
        Inventory? stock = await inventoryDao.GetById(id);
>>>>>>> new-master
        if (stock == null)
        {
            throw new Exception($"Stock with ID {id} was not found!!!");
        }

        await inventoryDao.DeleteAsync(id);
       
    }
}