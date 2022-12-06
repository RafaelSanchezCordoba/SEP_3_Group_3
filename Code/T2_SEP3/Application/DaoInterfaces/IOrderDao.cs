using Shared.DTOs;
using Shared.Models;

namespace Application.DaoInterfaces;

public interface IOrderDao
{
    Task<Order> CreateAsync(Order order);
    
}