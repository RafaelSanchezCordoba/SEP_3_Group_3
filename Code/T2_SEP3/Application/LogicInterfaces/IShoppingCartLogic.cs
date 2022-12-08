using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface IShoppingCartLogic
{
    Task<ShoppingCart> CreateAsync(CreateShoppingCartDto dto);
    Task<ShoppingCart> GetById(int id);
    Task<IEnumerable<ShoppingCart>> GetAsync();
    Task<ShoppingCart> AddProduct(Product product, int cartId);
    Task DeleteAsync(int cardId);
    Task<ShoppingCart> RemoveProduct(Product product, int id);
    Task<ShoppingCart> GetByCustomerName(int ownerId);


    Task<double> GetTotalPriceAsync(int id);

}