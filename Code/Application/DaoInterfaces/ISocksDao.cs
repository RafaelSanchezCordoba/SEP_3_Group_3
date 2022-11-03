using Shared.DTOs;
using Shared.Models;

namespace Application.DaoInterfaces;

public interface ISocksDao
{
    Task<ProductCardSock> CreateAsync(ProductCardSock productCard);
    Task<IEnumerable<ProductCardSock>> GetAsync();
    Task<IEnumerable<ProductCardBasicDto>> GetTitlesAsync();
    Task<ProductCardSock> GetById(int id);

    Task UpdateAsync(ProductCardSock dto);
    Task DeleteAsync(int id);
    Task<ProductCardSock?> GetByTitlesAsync(string title);
}