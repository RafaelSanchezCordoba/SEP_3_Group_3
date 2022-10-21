using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface ISocksLogic
{
    Task<ProductCard> CreateAsync(CreateSockCardDto dto);
}