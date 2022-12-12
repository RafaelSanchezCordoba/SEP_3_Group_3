using Application.DaoInterfaces;
using Shared.Models;

namespace FileData.DAOs;

public class CartItemFileDao : ICartItemDao

{
    private readonly FileContext context;
    
    public CartItemFileDao(FileContext context)
    {
        this.context = context;
    }
    
    public Task<CartItem> CreateAsync(CartItem cartItem)
    {
        int Id = 1;
        if (context.CardItems.Any())
        {
            Id = context.CardItems.Max(u => u.Id);
            Id++;
        }

        cartItem.Id = Id;
        
        context.CardItems.Add(cartItem);
        context.SaveChanges();

        return Task.FromResult(cartItem);
    }

    public Task<IEnumerable<CartItem>> GetAsync()
    {
        IEnumerable<CartItem> result = context.CardItems.AsEnumerable();
        return Task.FromResult(result);
    }

    public Task<CartItem> GetByIdAsync(int id)
    {
        CartItem? existing = context.CardItems.FirstOrDefault(cardItem => cardItem.Id == id);
        
        if (existing == null)
        {
            throw new Exception($"Card item with id {id} does not exist!");
        }
        
        return Task.FromResult(existing);
    }

    public Task<int> GetQuantityById(int id)
    {
        CartItem? existing = context.CardItems.FirstOrDefault(cardItem => cardItem.Id == id);
        
        if (existing == null)
        {
            throw new Exception($"Card item with id {id} does not exist!");
        }
        
        return Task.FromResult(existing.Quantity);
    }

    public Task<CartItem?> GetByIdsAsync(int idProduct, int idShoppingCart)
    {
       CartItem result = context.CardItems.FirstOrDefault(c=>c.ProductId==idProduct&&c.ShoppingCartId==idShoppingCart);
       return Task.FromResult(result);
    }

    public Task<CartItem> UpdateQuantityAsync(int id, int newQuantity)
    {
        CartItem? existing = context.CardItems.FirstOrDefault(cardItem => cardItem.Id == id);
        
        if (existing == null)
        {
            throw new Exception($"Card item with id {id} does not exist!");
        }

        context.CardItems.Remove(existing);
        existing.Quantity = newQuantity;
        context.CardItems.Add(existing);
        context.SaveChanges();
        return Task.FromResult(existing);
    }

    public async Task DeleteAsync(int cardId)
    {
        CartItem? existing = context.CardItems.FirstOrDefault(card => card.Id == cardId);
        if (existing == null)
        {
            throw new Exception($"shopping cart with ID {cardId} does not exist!!!");
        }

        context.CardItems.Remove(existing);
        context.SaveChanges();

        
    }
}