using Shared.DTOs.Trousers;
using Shared.Models;

namespace Application.LogicInterfaces.Trouser;


public interface ITrouserLogic
{
    Task<Shared.Models.Trouser> CreateAsync(CreateTrouserDto dto);
    Task<IEnumerable<Shared.Models.Trouser>> GetAsync();
    Task<Shared.Models.Trouser> GetById(int id);
    Task DeleteAsync(int id);
}