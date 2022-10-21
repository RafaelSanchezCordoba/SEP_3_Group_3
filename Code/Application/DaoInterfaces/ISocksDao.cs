using Shared.DTOs;
using Shared.Models;

namespace Application.DaoInterfaces;

public interface ISocksDao
{
    Task<ProductCard> CreateAsync(ProductCard productCard);
    Task<IEnumerable<ProductCard>> GetAsync();
    Task<ProductCard> GetById(int id);

    Task UpdateAsync(ProductCard dto);
}