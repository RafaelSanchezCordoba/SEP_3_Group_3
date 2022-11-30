using Shared.Models;

namespace Application.LogicInterfaces;

public interface ICardItemLogic
{
    Task<CardItem> CreateAsync(CardItem cardItem);
    Task<IEnumerable<CardItem>> GetAsync();
    Task<CardItem> GetByIdAsync(int id);
    Task<CardItem> IncreaseQuantityAsync(int id);
    Task<CardItem> DecreaseQuantityAsync(int id);
}