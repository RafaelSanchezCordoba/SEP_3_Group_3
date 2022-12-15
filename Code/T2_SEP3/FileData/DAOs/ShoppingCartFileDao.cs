using Application.DaoInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace FileData.DAOs;

/// <summary>
/// Sopping Cart data storage
/// </summary>
public class ShoppingCartFileDao:IShoppingCartDao
{
    private readonly FileContext context;

    public ShoppingCartFileDao(FileContext context)
    {
        this.context = context;
    }

    /// <summary>
    /// Create and save a new shopping cart in the data file
    /// </summary>
    /// <param name="shoppingCart">Shopping cart to add</param>
    /// <returns>The added shopping cart</returns>
    public Task<ShoppingCart> CreateAsync(ShoppingCart shoppingCart)
    {
        int Id = 1;
        if (context.ShoppingCarts.Any())
        {
            Id = context.ShoppingCarts.Max(u => u.Id);
            Id++;
        }

        shoppingCart.Id = Id;
        
        context.ShoppingCarts.Add(shoppingCart);
        context.SaveChanges();

        return Task.FromResult(shoppingCart);
    }
    
    /// <summary>
    /// Get all shopping carts in the data file
    /// </summary>
    /// <returns>All the saved shopping carts</returns>
    public Task<IEnumerable<ShoppingCart>>GetAsync()
    {
        IEnumerable<ShoppingCart> result = context.ShoppingCarts.AsEnumerable();
        return Task.FromResult(result);
    }

    /// <summary>
    /// Get a shopping cart with an specific id
    /// </summary>
    /// <param name="id">The id of the shopping cart to get</param>
    /// <returns>The shopping cart with the same id</returns>
    /// <exception cref="Exception">If the shopping cart does not exist</exception>
    public Task<ShoppingCart> GetById(int id)
    {
        ShoppingCart? existing = context.ShoppingCarts.FirstOrDefault(shoppingCart => shoppingCart.Id == id);
        
        if (existing == null)
        {
            throw new Exception($"Shopping cart with id {id} does not exist!");
        }
        
        return Task.FromResult(existing);
    }

    /// <summary>
    /// Add a product to the shopping cart
    /// </summary>
    /// <param name="product">Product to add</param>
    /// <param name="cartId">Card id of the shopping cart</param>
    /// <returns>The added product</returns>
    /// <exception cref="Exception">If the shopping cart does not exist</exception>
    public Task<ShoppingCart> AddProduct(Product product, int cartId)
    {
        ShoppingCart? existing = context.ShoppingCarts.FirstOrDefault(shoppingCart => shoppingCart.Id == cartId);
        
        if (existing == null)
        {
            throw new Exception($"Shopping cart with id {cartId} does not exist!");
        }

        context.ShoppingCarts.Remove(existing);
        existing.AddProduct(product);
        context.ShoppingCarts.Add(existing);
        context.SaveChanges();
        return Task.FromResult(existing);
    }

    /// <summary>
    /// Delete a shopping cart with an specific id
    /// </summary>
    /// <param name="cartId">The card id of the shopping cart</param>
    /// <returns>The deleted shopping cart</returns>
    /// <exception cref="Exception">If the shopping cart does not exist</exception>
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

    /// <summary>
    /// Delete product from a shopping cart
    /// </summary>
    /// <param name="product">Product to delete</param>
    /// <param name="id">Id of the shopping cart</param>
    /// <returns>The deleted product</returns>
    /// <exception cref="Exception">If the shopping cart does not exist</exception>
    public Task<ShoppingCart> DeleteProductAsync(Product product, int id)
    {
        ShoppingCart? existing = context.ShoppingCarts.FirstOrDefault(cart => cart.Id == id);
        if (existing == null)
        {
            throw new Exception($"shopping cart with ID {id} does not exist!!!");
        }
       
        context.ShoppingCarts.Remove(existing);
        existing.RemoveProduct(product);
        context.ShoppingCarts.Add(existing);
        context.SaveChanges();
        return Task.FromResult(existing);
    }
    
    /// <summary>
    /// Get a shopping cart with an specific owner id
    /// </summary>
    /// <param name="ownerId">The owner id of the shopping cart</param>
    /// <returns>The shopping cart with the same owner id</returns>
    /// <exception cref="Exception">If the shopping cart does not exist</exception>
    public Task<ShoppingCart> GetByCustomerId(int ownerId)
    {
        ShoppingCart? existing = context.ShoppingCarts.FirstOrDefault(shoppingCart => shoppingCart.OwnerId == ownerId);

        if (existing == null)
        {
            throw new Exception($"Shopping cart with userName {ownerId} does not exist!");
        }

        return Task.FromResult(existing);
        
    }

    /// <summary>
    /// Get total price of an specific shopping cart
    /// </summary>
    /// <param name="id">The id of the shopping cart</param>
    /// <returns>The toal price</returns>
    public async Task<double> GetTotalPriceAsync(int id)
    {
        ShoppingCart shoppingCart =  await GetById(id);
        double totalprice = 0;
        foreach (var p in shoppingCart.Products)
        {
            ProductCard? exists = context.SocksCards.FirstOrDefault(sockCard => sockCard.Id == p.ProductCardId);
           
            if (exists==null)
            {
                exists = context.TrouserCards.FirstOrDefault(c => c.Id == p.ProductCardId);
            }
            if (exists==null)
            {
                throw new Exception($"Product with id {id} does not exists !!!");
            }
            CartItem cartItem = context.CardItems.FirstOrDefault(c => c.ProductId == exists.Id && id==c.ShoppingCartId);
            totalprice =totalprice+exists.Price*cartItem.Quantity;
        }

        return totalprice;
    }
}