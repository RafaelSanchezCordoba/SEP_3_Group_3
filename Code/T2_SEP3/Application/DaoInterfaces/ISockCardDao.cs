using Shared.DTOs;
using Shared.Models;

namespace Application.DaoInterfaces;

public interface ISockCardDao
{
    Task<SocksCard> CreateAsync(SocksCard productCard);
    Task<IEnumerable<SocksCard>> GetAsync();
    Task<IEnumerable<ProductCardBasicDto>> GetTitlesAsync();
    Task<SocksCard> GetById(int id);

    Task UpdateAsync(SocksCard dto);
    Task DeleteAsync(int id);
    Task<SocksCard?> GetByTitlesAsync(string title);
}