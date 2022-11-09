using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface ISockService
{
    Task<ProductCardSock> Create(CreateSockCardDto dto);
  //  Task<ICollection<ProductCardBasicDto>> GetTitlesAsync();
    Task<ProductCardSock> GetById(int id);

    Task<ICollection<ProductCardSock>> GetAllSockCards();

    Task RemoveProductCardSockById(int id);
}