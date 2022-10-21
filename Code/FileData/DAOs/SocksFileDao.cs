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
        long Id = 1;
        if (context.ProductCards.Any())
        {
            Id = context.ProductCards.Max(u => u.Id);
        }

        productCard.Id = Id;
        
        context.ProductCards.Add(productCard);
        context.SaveChanges();

        return Task.FromResult(productCard);
    }
}