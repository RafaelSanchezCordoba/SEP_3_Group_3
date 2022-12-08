using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface IShoppingCartService
{
    Task<ShoppingCart> CreateAsync(CreateShoppingCartDto dto);
    Task<ICollection<ShoppingCart>> GetAsync();
    Task<ICollection<Product>> GetProducts(int id);

    Task<ShoppingCart> getByIdAsync(int id);

    Task<ShoppingCart> AddProductAsync(Product product, int shoppingCartId);
    
    Task<ShoppingCart> RemoveProduct(Product product, int id);
    
    Task<ShoppingCart> getByUserIdAsync(int id);

}