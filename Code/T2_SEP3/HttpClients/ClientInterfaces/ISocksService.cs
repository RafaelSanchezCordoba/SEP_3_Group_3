using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface ISocksService
{
    Task<Socks> CreateAsync(CreateSocks dto);
    Task<Socks> getByIdAsync(int id);
}