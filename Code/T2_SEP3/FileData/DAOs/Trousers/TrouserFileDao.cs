using Application.DaoInterfaces;
using Shared.Models;

namespace FileData.DAOs.Trousers;

public class TrouserFileDao : ITrouserDao
{
    private readonly FileContext context;

    public TrouserFileDao(FileContext context)
    {
        this.context = context;
    }
    
    public Task<Trouser> CreateAsync(Trouser socks)
    {
        int Id = 1;
        if (context.Trousers.Any())
        {
            Id = context.Trousers.Max(u => u.Id);
            Id++;
        }

        socks.Id = Id;
        
        context.Trousers.Add(socks);
        context.SaveChanges();

        return Task.FromResult(socks);
    }
    
    public Task<IEnumerable<Trouser>>GetAsync()
    {
        IEnumerable<Trouser> result = context.Trousers.AsEnumerable();
        return Task.FromResult(result);
    }
    
    public Task<Trouser?> GetById(int id)
    {
        Trouser? existing = context.Trousers.FirstOrDefault(socks => socks.Id == id);
        
        if (existing == null)
        {
            throw new Exception($"Trouser with id {id} does not exist!");
        }
        return Task.FromResult(existing);
    }
    
    public Task DeleteAsync(int id)
    {
        Trouser? existing = context.Trousers.FirstOrDefault(socks => socks.Id == id);
        if (existing == null)
        {
            throw new Exception($"Socks with ID {id} does not exist!!!");
        }

        context.Trousers.Remove(existing);
        CartItem? deleteCardItem = context.CardItems.FirstOrDefault(cardItem => cardItem.ProductId == id);
        if (deleteCardItem != null) context.CardItems.Remove(deleteCardItem);
        context.SaveChanges();

        return Task.CompletedTask;
    }
}