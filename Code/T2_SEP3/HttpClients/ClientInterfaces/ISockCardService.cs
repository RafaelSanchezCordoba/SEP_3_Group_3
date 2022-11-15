using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface ISockCardService
{
    Task<SocksCard> Create(CreateSockCardDto dto);
  //  Task<ICollection<ProductCardBasicDto>> GetTitlesAsync();
    Task<SocksCard> GetById(int id);

    Task<ICollection<SocksCard>> GetAllSockCards();

    Task RemoveProductCardSockById(int id);
    Task UpdateAsync(SocksCard card);
}