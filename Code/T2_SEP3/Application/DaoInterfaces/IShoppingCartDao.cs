using Shared.DTOs;
using Shared.Models;

namespace Application.DaoInterfaces;

public interface IShoppingCartDao
{
    Task<ShoppingCart> CreateAsync(ShoppingCart shoppingCart);
    Task<ShoppingCart> GetById(int id);
    Task<IEnumerable<ShoppingCart>> GetAsync();
    Task<ShoppingCart> AddProduct(Product product, int cartId);
    Task DeleteAsync(int cartId);
    Task<ShoppingCart> DeleteProductAsync(Product product, int id);

    
    Task<ShoppingCart> GetByCustomerName(int ownerId);

    Task<double> GetTotalPriceAsync(int id);

}