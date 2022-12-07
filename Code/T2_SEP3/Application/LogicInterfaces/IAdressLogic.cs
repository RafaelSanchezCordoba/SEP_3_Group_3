using Shared.Models;

namespace Application.LogicInterfaces;

public interface IAdressLogic
{
    Task<Adress> CreateAsync(Adress adress);

    Task<IEnumerable<Adress>> getUserAdresses();

    Task<IEnumerable<Adress>> getNonUserAdresses();

    Task<Adress> getByUserId(int id);
    
}