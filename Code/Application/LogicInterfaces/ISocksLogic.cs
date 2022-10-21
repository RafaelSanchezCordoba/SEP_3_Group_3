using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface ISocksLogic
{
    Task<ProductCard> CreateAsync(CreateSockCardDto dto);
    Task<IEnumerable<ProductCard>> GetAsync();
    Task<ProductCard> GetById(int id);
    Task UpdateAsync(SocksCardUpdateDto dto);
    Task DeleteAsync(int id);
}