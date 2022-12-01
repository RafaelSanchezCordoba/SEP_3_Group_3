using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface ICardItemLogic
{
    Task<CardItem> CreateAsync(CreateCardItemDto dto);
    Task<IEnumerable<CardItem>> GetAsync();
    Task<CardItem> GetByIdsAsync(int idProduct,int idShoppingCard);
    Task<CardItem> GetByIdAsync(int id);
    Task<int> GetQuantityById(int id);
    Task<CardItem> UpdateQuantityAsync(int id, int newQuantity);
}