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

    public Task<ProductCard> CreateAsync(ProductCard productCard)
    {
        int Id = 1;
        if (context.ProductCards.Any())
        {
            Id = context.ProductCards.Max(u => u.Id);
            Id++;
        }

        productCard.Id = Id;
        
        context.ProductCards.Add(productCard);
        context.SaveChanges();

        return Task.FromResult(productCard);
    }

    public Task<IEnumerable<ProductCard>> GetAsync()
    {
        IEnumerable<ProductCard> result = context.ProductCards.AsEnumerable();
        return Task.FromResult(result);
    }

    public Task<ProductCard?> GetById(int id)
    {
        ProductCard? existing = context.ProductCards.FirstOrDefault(productCard => productCard.Id == id);
        return Task.FromResult(existing);
    }
}