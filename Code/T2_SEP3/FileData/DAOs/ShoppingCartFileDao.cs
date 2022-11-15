using Application.DaoInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace FileData.DAOs;

public class ShoppingCartFileDao:IShoppingCartDao
{
    private readonly FileContext context;

    public ShoppingCartFileDao(FileContext context)
    {
        this.context = context;
    }

    public Task<ShoppingCart> CreateAsync(ShoppingCart shoppingCart)
    {
        int Id = 1;
        if (context.SocksCards.Any())
        {
            Id = context.SocksCards.Max(u => u.Id);
            Id++;
        }

        shoppingCart.Id = Id;
        
        context.ShoppingCarts.Add(shoppingCart);
        context.SaveChanges();

        return Task.FromResult(shoppingCart);
    }

    public Task<ShoppingCart> GetById(int id)
    {
        ShoppingCart? existing = context.ShoppingCarts.FirstOrDefault(shoppingCart => shoppingCart.Id == id);
        
        if (existing == null)
        {
            throw new Exception($"Shopping cart with id {id} does not exist!");
        }
        
        return Task.FromResult(existing);
    }

    public Task<ShoppingCart> AddProduct(Product product, int cartId)
    {
        ShoppingCart? existing = context.ShoppingCarts.FirstOrDefault(shoppingCart => shoppingCart.Id == cartId);
        
        if (existing == null)
        {
            throw new Exception($"Shopping cart with id {cartId} does not exist!");
        }
        existing.addProduct(product);
        return Task.FromResult(existing);
    }

    public Task DeleteAsync(int cartId)
    {
        ShoppingCart? existing = context.ShoppingCarts.FirstOrDefault(cart => cart.Id == cartId);
        if (existing == null)
        {
            throw new Exception($"shopping cart with ID {cartId} does not exist!!!");
        }

        context.ShoppingCarts.Remove(existing);
        context.SaveChanges();

        return Task.CompletedTask;
    }
}