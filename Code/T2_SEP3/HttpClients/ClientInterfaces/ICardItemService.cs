using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface ICardItemService
{
    Task<CardItem> CreateAsync(CreateCardItemDto dto);
    Task<IEnumerable<CardItem>> GetAsync();
    Task<CardItem> GetByIdAsync(int Id);
    Task<int> GetQuantityById(int id);
    Task UpdateQuantityAsync(int id, int newQuantity);
    Task<CardItem> GetByIdsAsync(int idProduct,int idShoppingCard);

    
}