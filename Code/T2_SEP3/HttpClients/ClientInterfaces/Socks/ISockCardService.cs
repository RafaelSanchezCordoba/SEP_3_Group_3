using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface ISockCardService
{
    Task<SocksCard> Create(CreateSockCardDto dto);
    Task<SocksCard> GetById(int id);
    Task<ICollection<SocksCard>> GetAllSockCards();
    Task RemoveById(int id);
    Task UpdateAsync(UpdateSocksCardDto cardUpdateDto);
}