using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

public class OrderLogic:IOrderLogic
{
    private readonly IOrderDao dao;

    public OrderLogic(IOrderDao dao)
    {
        this.dao = dao;
    }

    public async Task<Order> CreateAsync(CreateOrderDto dto)
    {
      
        Order order = new Order(dto.NumberOfProducts, dto.TotalPrice, dto.Status, dto.CustomerName, dto.CustomerEmail,
            dto.CustomerPhoneNumber, dto.ShoppingCart, dto.Shipping);
        Order created = await dao.CreateAsync(order);
        return created;
    }
    
}