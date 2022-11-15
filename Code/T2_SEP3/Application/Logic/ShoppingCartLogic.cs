using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

public class ShoppingCartLogic :IShoppingCartLogic
{
    private readonly IShoppingCartDao dao;

    public ShoppingCartLogic(IShoppingCartDao dao)
    {
        this.dao = dao;
    }

    public async Task<ShoppingCart> CreateAsync(CreateShoppingCartDto dto)
    {
        ShoppingCart shoppingCart= new ShoppingCart( dto.OwnerId);
        ShoppingCart created = await dao.CreateAsync(shoppingCart);
        return created;
    }

    public Task<ShoppingCart> GetById(int id)
    {
        return dao.GetById(id);
    }

    public Task<ShoppingCart> AddProduct(Product product, int cartId)
    {
        return dao.AddProduct(product, cartId);
    }

    public async Task DeleteAsync(int id)
    {
        ShoppingCart? shoppingCart= await dao.GetById(id);
        if (shoppingCart == null)
        {
            throw new Exception($"ShoppingCart with ID {id} was not found!!!");
        }

        await dao.DeleteAsync(id);
    }
}