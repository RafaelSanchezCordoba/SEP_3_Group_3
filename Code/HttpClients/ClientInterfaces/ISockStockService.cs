using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface ISockStockService
{
    Task<Stock> CreateAsync(CreateSockStockDto dto);

}