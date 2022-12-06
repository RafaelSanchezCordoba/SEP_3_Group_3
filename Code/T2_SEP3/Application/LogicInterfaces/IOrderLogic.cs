using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface IOrderLogic
{
    Task<Order> CreateAsync(CreateOrderDto order);

}