using Shared.DTOs;
using Shared.DTOs.Trousers;
using Shared.Models;

namespace Application.DaoInterfaces;

public interface ITrouserCardDao
{
    Task<TrouserCard> CreateAsync(TrouserCard trouser);
    Task<IEnumerable<TrouserCard>> GetAsync();
    Task<IEnumerable<ProductCardBasicDto>> GetTitlesAsync();
    Task<TrouserCard> GetById(int id);

    Task UpdateAsync(UpdateTrouserCardDto dto);
    Task DeleteAsync(int id);
    Task<TrouserCard?> GetByTitlesAsync(string title);
}