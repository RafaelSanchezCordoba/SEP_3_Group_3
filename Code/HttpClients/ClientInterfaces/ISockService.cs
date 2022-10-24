using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface ISockService
{
    Task<ProductCard> Create(CreateSockCardDto dto);
}