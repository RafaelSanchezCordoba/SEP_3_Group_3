using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface ISocksLogic
{
    Task<Socks> CreateAsync(CreateSocksDto dto);
    Task<IEnumerable<Socks>> GetAsync();
    Task<Socks> GetById(int id);
    Task DeleteAsync(int id);
}