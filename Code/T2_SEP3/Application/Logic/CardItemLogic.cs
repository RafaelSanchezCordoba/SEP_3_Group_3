using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

public class CardItemLogic : ICardItemLogic
{
    private readonly ICardItemDao dao;
    private readonly ISocksInventoryDao invDao;
    private readonly ISocksDao sockDao;
    
    
    public CardItemLogic(ICardItemDao dao,ISocksInventoryDao invDao,ISocksDao sockDao)
    {
        this.dao = dao;
        this.invDao = invDao;
        this.sockDao = sockDao;
    }

 /*   public void InvCheck(int cardId, int qnt,int cardItemId)
    {
       IEnumerable<Inventory> inventories = invDao.GetByCardIdAsync(cardId).Result;

       CardItem cardItem = dao.GetByIdAsync(cardItemId).Result;

       Socks sockToCompare = sockDao.GetById(cardItem.ProductId).Result;
       
      
       Inventory? toCompare = null ;

       foreach (var x in inventories)
       {
           if (x.Color.Equals(sockToCompare.Color)&&x.Size.Equals(sockToCompare.Size))
           {
               toCompare = x;
           }
       }

       if (toCompare.Quantity >= qnt) throw new Exception("quantity is more than the avaiable inv");
    }
**/
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


    public Task<CardItem> GetByIdsAsync(int idProduct, int idShoppingCard)
    {
        return dao.GetByIdsAsync(idProduct, idShoppingCard);
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

    public Task DeleteAsync(int cardId)
    {
        return dao.DeleteAsync(cardId);
    }
}