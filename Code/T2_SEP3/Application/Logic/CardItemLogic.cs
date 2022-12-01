using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

public class CardItemLogic : ICardItemLogic
{
    private readonly ICardItemDao dao;
    
    public CardItemLogic(ICardItemDao dao)
    {
        this.dao = dao;
    }
    
    public async Task<CardItem> CreateAsync(CreateCardItemDto dto)
    {
        CardItem cardItem = new CardItem(dto.ShoppingCartId, dto.ProductId);
        CardItem created = await dao.CreateAsync(cardItem);
        return cardItem;
    }

    public Task<IEnumerable<CardItem>> GetAsync()
    {
        return dao.GetAsync();
    }

    public Task<CardItem> GetByIdAsync(int id)
    {
        return dao.GetByIdAsync(id);
    }

    public Task<int> GetQuantityById(int id)
    {
        return dao.GetQuantityById(id);
    }

    public Task<CardItem> UpdateQuantityAsync(int id, int newQuantity)
    {
        return dao.UpdateQuantityAsync(id, newQuantity);
    }
}