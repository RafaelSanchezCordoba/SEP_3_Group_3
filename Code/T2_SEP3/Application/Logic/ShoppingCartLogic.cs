using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;
/// <summary>
/// This class is the implementation of the business logic of our system.
/// Implements the IShoppingCartDao
/// </summary>
namespace Application.Logic;

/// <summary>
/// 
/// </summary>
public class ShoppingCartLogic :IShoppingCartLogic
{
    private readonly IShoppingCartDao dao;

    /// <summary>
    /// Constructor that set the value of the da
    /// </summary>
    /// <param name="dao">Shopping cart dao</param>
    public ShoppingCartLogic(IShoppingCartDao dao)
    {
        this.dao = dao;
    }

    /// <summary>
    /// Create a shopping cart
    /// </summary>
    /// <param name="dto">The shopping cart to create</param>
    /// <returns>The created shopping cart</returns>
    public async Task<ShoppingCart> CreateAsync(CreateShoppingCartDto dto)
    {
        ShoppingCart shoppingCart= new ShoppingCart( dto.OwnerId);
        ValidateProduct(dto);
        ShoppingCart created = await dao.CreateAsync(shoppingCart);
        return created;
    }

    /// <summary>
    /// Get a shopping cart with an specific Id
    /// </summary>
    /// <param name="id">Id of the shopping cart</param>
    /// <returns>The shopping cart with the same id</returns>
    /// <exception cref="Exception">If the shopping exist</exception>
    public async Task<ShoppingCart> GetById(int id)
    {
        ValidateShoppingCartById(id);
        return await dao.GetById(id) ?? throw new Exception($"ShoppingCart with ID {id} was not found!!!");
    }

    /// <summary>
    /// Get all shopping carts
    /// </summary>
    /// <returns>ALl shopping carts</returns>
    /// <exception cref="Exception">If there are not shopping carts</exception>
    public async Task<IEnumerable<ShoppingCart>> GetAsync()
    {
        return await dao.GetAsync() ?? throw new Exception("ShoppingCarts were not found!!!");
    }

    /// <summary>
    /// Add product to the shopping cart
    /// </summary>
    /// <param name="product">The product to add</param>
    /// <param name="cartId">The cardId of the product</param>
    /// <returns>The added product</returns>
    /// <exception cref="Exception">If the shopping cart does not exist</exception>
    public Task<ShoppingCart> AddProduct(Product product, int cartId)
    {
        ValidateProduct(product);
        ValidateShoppingCartById(cartId);
        return dao.AddProduct(product, cartId) ?? throw new Exception($"Product with id {product.Id} was not found!!!");
    }

    /// <summary>
    /// Delete a shopping cart with an specific Id
    /// </summary>
    /// <param name="id">Id of the shopping cart</param>
    /// <returns>The deleted shopping cart</returns>
    /// <exception cref="Exception">If the shopping cart does not exist</exception>
    public Task DeleteAsync(int id)
    {
        ValidateShoppingCartById(id);
        return dao.DeleteAsync(id) ?? throw new Exception($"ShoppingCart with ID {id} was not found!!!");
    }

    /// <summary>
    /// Remove product from an specific shopping cart
    /// </summary>
    /// <param name="product">The product to delete</param>
    /// <param name="id">Id of the shopping cart</param>
    /// <returns>The deleted product</returns>
    /// <exception cref="Exception">If the shopping cart does not exist</exception>
    public async Task<ShoppingCart> RemoveProduct(Product product, int id)
    {
        ValidateProduct(product);
        ValidateShoppingCartById(id);
        return await dao.DeleteProductAsync(product,id) ?? throw new Exception($"ShoppingCart with ID {id} was not found!!!");
    }

    /// <summary>
    /// Get a shopping cart by customer name
    /// </summary>
    /// <param name="ownerId">Customer id of the shopping cart</param>
    /// <returns>The shopping cart with the same owner id</returns>
    /// <exception cref="Exception">If the shopping cart does not exist</exception>
    public async Task<ShoppingCart> GetByCustomerName(int ownerId)
    {
        ValidateShoppingCartById(ownerId);
        return await dao.GetByCustomerId(ownerId) ?? throw new Exception($"ShoppingCart with ownerId {ownerId} was not found!!!");
    }
    
    /// <summary>
    /// Get total price of a specific shopping cart
    /// </summary>
    /// <param name="id">The id of the shopping cart</param>
    /// <returns>The total price</returns>
    /// <exception cref="Exception">If the shopping cart does not exist</exception>
    public async Task<double> GetTotalPriceAsync(int id)
    {
        ValidateShoppingCartById(id);
        double? price = await dao.GetTotalPriceAsync(id);
        if (price == 0)
        {
            throw new Exception($"ShoppingCart with ID {id} was not found!!!");
        }
        return await dao.GetTotalPriceAsync(id);
    }

    /// <summary>
    /// Validate a product
    /// </summary>
    /// <param name="product">Product to validate</param>
    /// <exception cref="Exception">Multiple exceptions about the format</exception>
    public void ValidateProduct(Product product)
    {
        if (string.IsNullOrEmpty(product.Size)) throw new Exception("Size can not be empty!!!");
        if (string.IsNullOrEmpty(product.Color)) throw new Exception("Color can not be empty!!!");
        if (product.ProductCardId <= 0) throw new Exception("ProductCard id must be > 0!!!");
    }

    public void ValidateProduct(CreateShoppingCartDto dto)
    {
        if (dto.OwnerId <= 0) throw new Exception("Owner id must be > 0!!!");
    }
    
    public void ValidateShoppingCartById(int id)
    {
        if (id <= 0) throw new Exception("Id must be > 0!!!");
    }
}