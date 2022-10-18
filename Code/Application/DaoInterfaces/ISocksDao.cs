using Shared.Models;

namespace Application.DaoInterfaces;

public interface ISocksDao
{
    Task<ProductCard> CreateAsync(ProductCard productCard);
}