using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface ISockCardLogic
{
    Task<SocksCard> CreateAsync(CreateSockCardDto dto);
    Task<IEnumerable<SocksCard>> GetAsync();
    Task<SocksCard> GetById(int id);
    Task UpdateAsync(SocksCard dto);
    Task DeleteAsync(int id);
    Task<IEnumerable<ProductCardBasicDto>> GetProductSockCardTitlesAsync();
    Task<SocksCard?> GetByTitleAsync(string title);
}