using System.Data.Common;
using Application.DaoInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace FileData.DAOs;

public class SocksFileDao : ISocksDao
{
    private readonly FileContext context;

    public SocksFileDao(FileContext context)
    {
        this.context = context;
    }

    public Task<ProductCardSock> CreateAsync(ProductCardSock productCard)
    {
        int Id = 1;
        if (context.ProductCardSocks.Any())
        {
            Id = context.ProductCardSocks.Max(u => u.Id);
            Id++;
        }

        productCard.Id = Id;
        
        context.ProductCardSocks.Add(productCard);
        context.SaveChanges();

        return Task.FromResult(productCard);
    }

    public Task<IEnumerable<ProductCardSock>>GetAsync()
    {
        IEnumerable<ProductCardSock> result = context.ProductCardSocks.AsEnumerable();
        return Task.FromResult(result);
    }

    public async Task<IEnumerable<ProductCardBasicDto>> GetTitlesAsync()
    {
        List<ProductCardSock> result = context.ProductCardSocks.AsEnumerable().ToList();
        List<ProductCardBasicDto> resultTitle = new List<ProductCardBasicDto>();
        for (int i = 0; i < result.Count; i++)
        {
            resultTitle.Add(new ProductCardBasicDto(result[i].Title));
        }

        return resultTitle.AsEnumerable();
    }

    public Task<ProductCardSock?> GetById(int id)
    {
        ProductCardSock? existing = context.ProductCardSocks.FirstOrDefault(productCard => productCard.Id == id);
        
        if (existing == null)
        {
            throw new Exception($"CardSock with id {id} does not exist!");
        }
        return Task.FromResult(existing);
    }

   

    public Task UpdateAsync(ProductCardSock dto)
    {
        ProductCardSock? existing = context.ProductCardSocks.FirstOrDefault(card => card.Id == dto.Id);
        if (existing == null)
        {
            throw new Exception($"Socks with ID {dto.Id} does not exist!!!");
        }

        context.ProductCardSocks.Remove(existing);
        context.ProductCardSocks.Add(dto);
        context.SaveChanges();
        return Task.CompletedTask;
    }

    public Task DeleteAsync(int id)
    {
        ProductCardSock? existing = context.ProductCardSocks.FirstOrDefault(card => card.Id == id);
        if (existing == null)
        {
            throw new Exception($"Socks with ID {id} does not exist!!!");
        }

        context.ProductCardSocks.Remove(existing);
        context.SaveChanges();

        return Task.CompletedTask;
    }

    public Task<ProductCardSock?> GetByTitlesAsync(string title)
    {
        ProductCardSock? existing= context.ProductCardSocks.FirstOrDefault(s=>s.Title.Equals(title));
        return Task.FromResult(existing);
    }
}