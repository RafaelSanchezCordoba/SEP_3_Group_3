using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface ISocksService
{
    Task<Socks> CreateAsync(CreateSocksDto dto);
    Task<Socks> getByIdAsync(int id);
    Task RemoveSocks(int id);
}