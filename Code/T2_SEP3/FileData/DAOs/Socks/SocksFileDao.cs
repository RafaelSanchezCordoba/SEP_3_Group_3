using Application.DaoInterfaces;
using Shared.Models;

namespace FileData.DAOs;

public class SocksFileDao : ISocksDao
{
    private readonly FileContext context;

    public SocksFileDao(FileContext context)
    {
        this.context = context;
    }
    
    public Task<Socks> CreateAsync(Socks socks)
    {
        int Id = 1;
        if (context.Socks.Any())
        {
            Id = context.Socks.Max(u => u.Id);
            Id++;
        }

        socks.Id = Id;
        
        context.Socks.Add(socks);
        context.SaveChanges();

        return Task.FromResult(socks);
    }
    
    public Task<IEnumerable<Socks>>GetAsync()
    {
        IEnumerable<Socks> result = context.Socks.AsEnumerable();
        return Task.FromResult(result);
    }
    
    public Task<Socks?> GetById(int id)
    {
        Socks? existing = context.Socks.FirstOrDefault(socks => socks.Id == id);
        
        if (existing == null)
        {
            throw new Exception($"Socks with id {id} does not exist!");
        }
        return Task.FromResult(existing);
    }
    
    public Task DeleteAsync(int id)
    {
        Socks? existing = context.Socks.FirstOrDefault(socks => socks.Id == id);
        if (existing == null)
        {
            throw new Exception($"Socks with ID {id} does not exist!!!");
        }

        context.Socks.Remove(existing);
        CartItem? deleteCardItem = context.CardItems.FirstOrDefault(cardItem => cardItem.ProductId == id);
        if (deleteCardItem != null) context.CardItems.Remove(deleteCardItem);
        context.SaveChanges();

        return Task.CompletedTask;
    }
}