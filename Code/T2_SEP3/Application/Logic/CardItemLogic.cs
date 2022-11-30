using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.Models;

namespace Application.Logic;

public class CardItemLogic : ICardItemLogic
{
    private readonly ICardItemDao dao;
    
    public CardItemLogic(ICardItemDao dao)
    {
        this.dao = dao;
    }
    
    public async Task<CardItem> CreateAsync(CardItem cardItem)
    {
        cardItem = await dao.CreateAsync(cardItem);
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

    public Task<CardItem> IncreaseQuantityAsync(int id)
    {
        return dao.IncreaseQuantityAsync(id);
    }

    public Task<CardItem> DecreaseQuantityAsync(int id)
    {
        return dao.DecreaseQuantityAsync(id);
    }
}