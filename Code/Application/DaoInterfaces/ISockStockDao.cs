using Shared.Models;

namespace Application.DaoInterfaces;

public interface ISockStockDao
{
    Task<Stock> CreateAsync(Stock stock);
    Task<IEnumerable<Stock>> GetAsync();
    Task<Stock> GetById(int id);
    Task<IEnumerable<Stock>> GetByCardIdAsync(int id);

    Task UpdateAsync(Stock dto);
    Task DeleteFromCardAsync(int id);
    Task DeleteAsync(int id);
}