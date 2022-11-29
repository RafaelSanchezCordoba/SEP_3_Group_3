using System.Data.Common;
using Application.DaoInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace FileData.DAOs;

public class SockCardsFileDao : ISockCardDao
{
    private readonly FileContext context;

    public SockCardsFileDao(FileContext context)
    {
        this.context = context;
    }

    public Task<SocksCard> CreateAsync(SocksCard productCard)
    {
        int Id = 1;
        if (context.SocksCards.Any())
        {
            Id = context.SocksCards.Max(u => u.Id);
            Id++;
        }

        productCard.Id = Id;
        
        context.SocksCards.Add(productCard);
        context.SaveChanges();

        return Task.FromResult(productCard);
    }

    public Task<IEnumerable<SocksCard>>GetAsync()
    {
        IEnumerable<SocksCard> result = context.SocksCards.AsEnumerable();
        return Task.FromResult(result);
    }

    public async Task<IEnumerable<ProductCardBasicDto>> GetTitlesAsync()
    {
        List<SocksCard> result = context.SocksCards.AsEnumerable().ToList();
        List<ProductCardBasicDto> resultTitle = new List<ProductCardBasicDto>();
        for (int i = 0; i < result.Count; i++)
        {
            resultTitle.Add(new ProductCardBasicDto(result[i].Title));
        }

        return resultTitle.AsEnumerable();
    }

    public Task<SocksCard?> GetById(int id)
    {
        SocksCard? existing = context.SocksCards.FirstOrDefault(productCard => productCard.Id == id);
        
        if (existing == null)
        {
            throw new Exception($"CardSock with id {id} does not exist!");
        }
        return Task.FromResult(existing);
    }

   

    public Task UpdateAsync(SocksCard dto)
    {
        SocksCard? existing = context.SocksCards.FirstOrDefault(card => card.Id == dto.Id);
        if (existing == null)
        {
            throw new Exception($"Socks with ID {dto.Id} does not exist!!!");
        }

        context.SocksCards.Remove(existing);
        context.SocksCards.Add(dto);
        context.SaveChanges();
        return Task.CompletedTask;
    }

    

    public Task DeleteAsync(int id)
    {
        SocksCard? existing = context.SocksCards.FirstOrDefault(card => card.Id == id);
        if (existing == null)
        {
            throw new Exception($"Socks with ID {id} does not exist!!!");
        }

        context.SocksCards.Remove(existing);
        context.SaveChanges();

        return Task.CompletedTask;
    }

    public Task<SocksCard?> GetByTitlesAsync(string title)
    {
        SocksCard? existing= context.SocksCards.FirstOrDefault(s=>s.Title.Equals(title));
        return Task.FromResult(existing);
    }
}