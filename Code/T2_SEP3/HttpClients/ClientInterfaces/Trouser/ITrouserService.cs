using Shared.DTOs.Trousers;

namespace HttpClients.ClientInterfaces.Trouser;

public interface ITrouserService
{
    Task<Shared.Models.Trouser> CreateAsync(CreateTrouserDto dto);
    Task<Shared.Models.Trouser> GetByIdAsync(int id);
    Task RemoveSocks(int id);
}