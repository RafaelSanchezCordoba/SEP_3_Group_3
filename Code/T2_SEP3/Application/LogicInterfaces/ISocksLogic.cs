using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface ISocksLogic
{
    Task<Socks> CreateAsync(CreateSocks dto);
    Task<IEnumerable<Socks>> GetAsync();
    Task<Socks> GetById(int id);
}