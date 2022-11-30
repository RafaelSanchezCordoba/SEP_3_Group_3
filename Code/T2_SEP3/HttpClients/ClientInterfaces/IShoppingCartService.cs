using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface IShoppingCartService
{
    Task<ShoppingCart> CreateAsync(CreateShoppingCartDto dto);
    Task<ICollection<Socks>> GetAsync();

    Task<ShoppingCart> getByIdAsync(int id);

    Task<ShoppingCart> AddProductAsync(Product product, int shoppingCartId);

}