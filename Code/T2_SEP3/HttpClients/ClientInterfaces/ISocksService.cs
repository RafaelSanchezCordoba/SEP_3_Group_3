using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface ISocksService
{
    Task<SocksCard> Create(CreateSocksCardDto dto);
  //  Task<ICollection<ProductCardBasicDto>> GetTitlesAsync();
    Task<SocksCard> GetById(int id);

    Task<ICollection<SocksCard>> GetAllSockCards();

    Task RemoveProductCardSockById(int id);
}