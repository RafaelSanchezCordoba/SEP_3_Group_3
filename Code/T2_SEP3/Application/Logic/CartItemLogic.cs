using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

public class CartItemLogic : ICartItemLogic
{
    private readonly ICartItemDao dao;

    public CartItemLogic(ICartItemDao dao)
    {
        this.dao = dao;
    }
    
    public async Task<CartItem> CreateAsync(CreateCartItemDto dto)
    {
        CartItem cartItem = new CartItem(dto.ShoppingCartId, dto.ProductId);
        ValidateCartItem(cartItem);
        CartItem created = await dao.CreateAsync(cartItem);
        return created;
    }

    public Task<IEnumerable<CartItem>> GetAsync()
    {
        return dao.GetAsync() ?? throw new Exception("CardItems were not found!!!");
    }


    public async Task<CartItem> GetByIdsAsync(int idProduct, int idShoppingCard)
    {
        ValidateById(idProduct);
        ValidateById(idShoppingCard);
        
        return await dao.GetByIdsAsync(idProduct, idShoppingCard) ?? throw new Exception($"CartItem with product id {idProduct} and shoppingCart id {idShoppingCard} were not found!!!");
    }

    public async Task<CartItem> GetByIdAsync(int id)
    {
        ValidateById(id);
        return await dao.GetByIdAsync(id) ?? throw new Exception($"CartItem with ID {id} was not found!!!");
    }

    public async Task<int> GetQuantityById(int id)
    {
        ValidateById(id);
        CartItem? cardItem = await dao.GetByIdAsync(id);
        if (cardItem == null)
        {
            throw new Exception($"CartItem with ID {id} was not found!!!");
        }

        return await dao.GetQuantityById(id);
    }

    public Task<CartItem> UpdateQuantityAsync(int id, int newQuantity)
    {
        ValidateById(id);
        ValidateById(newQuantity);
        return dao.UpdateQuantityAsync(id, newQuantity) ?? throw new Exception($"CartItem with ID {id} was not found!!!");
    }

    public Task DeleteAsync(int cardId)
    {
        ValidateById(cardId);
        return dao.DeleteAsync(cardId) ?? throw new Exception($"CartItem with ID {cardId} was not found!!!");
    }

    public void ValidateCartItem(CartItem cartItem)
    {
        if (cartItem.Quantity <= 0) throw new Exception("Quantity must be > 0!!!");
        if (cartItem.ProductId <= 0) throw new Exception("Product id must be > 0!!!");
        if (cartItem.ShoppingCartId <= 0) throw new Exception("ShoppingCart id must be > 0!!!");
    }

    public void ValidateById(int id)
    {
        if (id <= 0) throw new Exception("Id must be > 0!!!");
    }
}