using Shared.DTOs;
using Shared.DTOs.Trousers;
using Shared.Models;

namespace Application.LogicInterfaces.Trouser;

public interface ITrouserCardLogic
{
    Task<TrouserCard> CreateAsync(CreateTrouserCardDto dto);
    Task<IEnumerable<TrouserCard>> GetAsync();
    Task<TrouserCard> GetById(int id);
    Task UpdateAsync(UpdateTrouserCardDto dto);
    Task DeleteAsync(int id);
    Task<IEnumerable<ProductCardBasicDto>> GetProductSockCardTitlesAsync();
    Task<TrouserCard?> GetByTitleAsync(string title);
}