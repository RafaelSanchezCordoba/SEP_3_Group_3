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
        ValidateOrder(dto);
        
      
        Order order = new Order(dto.NumberOfProducts, dto.TotalPrice, dto.Status, dto.CustomerName, dto.CustomerEmail,
            dto.CustomerPhoneNumber, dto.ShoppingCart, dto.Shipping);
        Order created = await dao.CreateAsync(order);
        return created;
    }

    public void ValidateOrder(CreateOrderDto dto)
    {
        if (string.IsNullOrEmpty(dto.CustomerEmail)) throw new Exception("Email can not be null!!!");
        if (string.IsNullOrEmpty(dto.Status)) throw new Exception("Status can not be null!!!");
        if (string.IsNullOrEmpty(dto.CustomerName)) throw new Exception("Name can not be null!!!");
        if (string.IsNullOrEmpty(dto.CustomerPhoneNumber)) throw new Exception("Phone number can not be null!!!");
        if (dto.ShoppingCart == null) throw new Exception("ShoppingCart can not be null!!!");
        if (dto.Shipping == null) throw new Exception("Address can not be null!!!");
        if (dto.TotalPrice == 0) throw new Exception("Price can not be 0!!!");
    }
    
}