using Shared.Models;

namespace Application.DaoInterfaces;

public interface ICartItemDao
{
    Task<CartItem> CreateAsync(CartItem cartItem);
    Task<IEnumerable<CartItem>> GetAsync();
    Task<CartItem> GetByIdAsync(int id);
    Task<int> GetQuantityById(int id);
    Task<CartItem?> GetByIdsAsync(int idProduct, int idShoppingCart);
    Task<CartItem> UpdateQuantityAsync(int id, int newQuantity);
    Task DeleteAsync(int cardId);
}