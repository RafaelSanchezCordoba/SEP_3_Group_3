using Shared.DTOs.Trousers;
using Shared.Models;

namespace HttpClients.ClientInterfaces.Trouser;

public interface ITrouserCardService
{
    Task<TrouserCard> Create(CreateTrouserCardDto dto);
    Task<TrouserCard> GetById(int id);
    Task<ICollection<TrouserCard>> GetAllTrouserCards();
    Task RemoveById(int id);
    Task UpdateAsync(UpdateTrouserCardDto cardUpdateDto);
}