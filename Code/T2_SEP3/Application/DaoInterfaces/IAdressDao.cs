using Shared.Models;

namespace Application.DaoInterfaces;

public interface IAdressDao
{
    public Task<Adress> Create(Adress adress);
    
    Task<IEnumerable<Adress>> getUserAdresses();

    Task<IEnumerable<Adress>> getNonUserAdresses();


    Task<Adress> getById(int id);
    Task UpdateAsync(Adress updated);
}