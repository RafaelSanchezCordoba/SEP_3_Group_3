using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

/// <summary>
/// This class is the implementation of the business logic of our system.
/// Implements the IShoppingCartDao
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
    /// 
    /// </summary>
    /// <param name="dto"></param>
    /// <returns></returns>
    public async Task<ShoppingCart> CreateAsync(CreateShoppingCartDto dto)
    {
        ShoppingCart shoppingCart= new ShoppingCart( dto.OwnerId);
        ValidateProduct(dto);
        ShoppingCart created = await dao.CreateAsync(shoppingCart);
        return created;
    }

    public async Task<ShoppingCart> GetById(int id)
    {
        ValidateShoppingCartById(id);
        return await dao.GetById(id) ?? throw new Exception($"ShoppingCart with ID {id} was not found!!!");
    }

    public async Task<IEnumerable<ShoppingCart>> GetAsync()
    {
        return await dao.GetAsync() ?? throw new Exception("ShoppingCarts were not found!!!");
    }

    public Task<ShoppingCart> AddProduct(Product product, int cartId)
    {
        ValidateProduct(product);
        ValidateShoppingCartById(cartId);
        return dao.AddProduct(product, cartId) ?? throw new Exception($"Product with id {product.Id} was not found!!!");
    }

    public Task DeleteAsync(int id)
    {
        ValidateShoppingCartById(id);
        return dao.DeleteAsync(id) ?? throw new Exception($"ShoppingCart with ID {id} was not found!!!");
    }

    public async Task<ShoppingCart> RemoveProduct(Product product, int id)
    {
        ValidateProduct(product);
        ValidateShoppingCartById(id);
        return await dao.DeleteProductAsync(product,id) ?? throw new Exception($"ShoppingCart with ID {id} was not found!!!");
    }

    public async Task<ShoppingCart> GetByCustomerName(int ownerId)
    {
        ValidateShoppingCartById(ownerId);
        return await dao.GetByCustomerId(ownerId) ?? throw new Exception($"ShoppingCart with ownerId {ownerId} was not found!!!");
    }
    

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