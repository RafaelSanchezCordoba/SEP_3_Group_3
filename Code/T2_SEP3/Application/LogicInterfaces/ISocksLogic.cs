using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface ISocksLogic
{
    Task<ProductCardSock> CreateAsync(CreateSockCardDto dto);
    Task<IEnumerable<ProductCardSock>> GetAsync();
    Task<ProductCardSock> GetById(int id);
    Task UpdateAsync(ProductCardSock dto);
    Task DeleteAsync(int id);
    Task<IEnumerable<ProductCardBasicDto>> GetProductSockCardTitlesAsync();
    Task<ProductCardSock?> GetByTitleAsync(string title);
}