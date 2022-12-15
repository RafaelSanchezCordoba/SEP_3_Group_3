using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface IShoppingCartService
{
    Task<ShoppingCart> CreateAsync(CreateShoppingCartDto dto);
    Task<ICollection<ShoppingCart>> GetAsync();
    Task<ICollection<Product>> GetProducts(int id);
    Task<ShoppingCart> GetByIdAsync(int id);
    Task<ShoppingCart> AddProductAsync(Product product, int shoppingCartId);
    Task<ShoppingCart> RemoveProduct(Product product, int id);
    Task<ShoppingCart> GetByUserIdAsync(int id);
    Task<double> GetTotalPrice(int id);
}