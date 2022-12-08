using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface IOrderService
{
   Task<Order> CreateAsync(CreateOrderDto dto);
}