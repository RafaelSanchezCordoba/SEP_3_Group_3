using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface ICartItemLogic
{
    Task<CartItem> CreateAsync(CreateCartItemDto dto);
    Task<IEnumerable<CartItem>> GetAsync();
    Task<CartItem> GetByIdsAsync(int idProduct,int idShoppingCard);
    Task<CartItem> GetByIdAsync(int id);
    Task<int> GetQuantityById(int id);
    Task<CartItem> UpdateQuantityAsync(int id, int newQuantity);
    Task DeleteAsync(int cardId);

}