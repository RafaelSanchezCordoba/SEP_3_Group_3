<<<<<<< HEAD
=======
using Shared.DTOs;
>>>>>>> new-master
using Shared.Models;

namespace Application.DaoInterfaces;

public interface ISocksInventoryDao
{
<<<<<<< HEAD
    Task<Stock> CreateAsync(Stock stock);
    Task<IEnumerable<Stock>> GetAsync();
    Task<Stock> GetById(int id);
    Task<IEnumerable<Stock>> GetByCardIdAsync(int id);

    Task UpdateAsync(Stock dto);
=======
    Task<Inventory> CreateAsync(Inventory inventory);
    Task<IEnumerable<Inventory>> GetAsync();
    Task<Inventory> GetById(int id);
    Task<IEnumerable<Inventory>> GetByCardIdAsync(int id);

    Task UpdateAsync(Inventory dto);
>>>>>>> new-master
    Task DeleteFromCardAsync(int id);
    Task DeleteAsync(int id);
}