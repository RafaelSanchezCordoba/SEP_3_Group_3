using Shared.DTOs;
using Shared.Models;

namespace Application.DaoInterfaces;

public interface ISocksDao
{
    Task<Socks> CreateAsync(Socks socks);
    Task<IEnumerable<Socks>> GetAsync();
    Task<Socks> GetById(int id);
}