using Shared.Models;
namespace Application.DaoInterfaces;

public interface ITrouserDao
{
    Task<Trouser> CreateAsync(Trouser trouser);
    Task<IEnumerable<Trouser>> GetAsync();
    Task<Trouser> GetById(int id);
    Task DeleteAsync(int id);
}