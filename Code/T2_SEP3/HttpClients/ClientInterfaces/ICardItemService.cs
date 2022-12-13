using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface ICardItemService
{
    Task<CartItem> CreateAsync(CreateCartItemDto dto);
    Task<IEnumerable<CartItem>> GetAsync();
    Task<CartItem> GetByIdAsync(int Id);
    Task<int> GetQuantityById(int id);
    Task UpdateQuantityAsync(int id, int newQuantity);
    Task<CartItem> GetByIdsAsync(int idProduct,int idShoppingCard);

    
}