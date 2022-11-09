using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface ISockStockLogic
{
    Task<Stock> CreateAsync(CreateSockStockDto dto);
    Task<IEnumerable<Stock>> GetAsync();
    Task<Stock> GetById(int id);
    Task<IEnumerable<Stock>> GetByCardIdAsync(int id);

    Task UpdateAsync(Stock dto);
    Task DeleteFromCardAsync(int id);
    Task DeleteAsync(int id);
}