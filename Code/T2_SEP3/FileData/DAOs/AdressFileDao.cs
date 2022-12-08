using Application.DaoInterfaces;
using Shared.Models;

namespace FileData.DAOs;

public class AdressFileDao:IAdressDao

{
    private readonly FileContext context;

    public AdressFileDao(FileContext context)
    {
        this.context = context;
    }

    public Task<Adress> Create(Adress adress)
    {
        int Id = 1;
        if (context.Adresses.Any())
        {
            Id = context.Adresses.Max(u => u.Id);
            Id++;
        }

        adress.Id = Id;
        
        context.Adresses.Add(adress);
        context.SaveChanges();

        return Task.FromResult(adress);
    }

    public Task<IEnumerable<Adress>> getUserAdresses()
    {
        IEnumerable<User> users = context.Users.AsEnumerable();
        List<Adress>result = new List<Adress>();
        foreach (var u in users)
        {
           
            result.Add(u.Adress);
        }

        return Task.FromResult(result.AsEnumerable());
    }

    public Task<IEnumerable<Adress>> getNonUserAdresses()
    {
        IEnumerable<Adress> result = context.Adresses.AsEnumerable();
        
        return Task.FromResult(result);
    }

   
}