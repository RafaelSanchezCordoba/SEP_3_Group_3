using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface ISocksLogic
{
    Task<SocksCard> CreateAsync(CreateSocksCardDto dto);
    Task<IEnumerable<SocksCard>> GetAsync();
    Task<SocksCard> GetById(int id);
    Task UpdateAsync(SocksCard dto);
    Task DeleteAsync(int id);
    Task<IEnumerable<ProductCardBasicDto>> GetProductSockCardTitlesAsync();
    Task<SocksCard?> GetByTitleAsync(string title);
}