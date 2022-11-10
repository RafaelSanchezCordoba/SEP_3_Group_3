using Application.DaoInterfaces;
using Shared.Models;

namespace FileData.DAOs;

public class SocksInventoryFileDao:ISocksInventoryDao
{
    private readonly FileContext context;

    public SocksInventoryFileDao(FileContext context)
    {
        this.context = context;
    }

    public Task<Stock> CreateAsync(Stock stock)
    {
        
        int Id = 1;
        if (context.Stocks.Any())
        {
            Id = context.Stocks.Max(u => u.Id);
            Id++;
        }

        ProductCard exists = context.ProductCardSocks.FirstOrDefault(c => c.Id == stock.CardId);
        if (exists==null)
        {
            throw new Exception($"Product with id{stock.CardId} does not exists !!! cannot add Stock");
        }

        stock.Id = Id;
        
        context.Stocks.Add(stock);
        context.SaveChanges();
        return Task.FromResult(stock);
    }

    public Task<IEnumerable<Stock>> GetAsync()
    {
        IEnumerable<Stock> result = context.Stocks.AsEnumerable();
        return Task.FromResult(result);
    }

    public Task<Stock> GetById(int id)
    {
        Stock? existing = context.Stocks.FirstOrDefault(stock => stock.Id == id);
        return Task.FromResult(existing);
    }

    public Task<IEnumerable<Stock>> GetByCardIdAsync(int id)
    {
        IEnumerable<Stock> result = context.Stocks.AsEnumerable().Where(s => s.CardId == id);
        return Task.FromResult(result);
    }

    public Task UpdateAsync(Stock dto)
    {
        throw new NotImplementedException();
    }

    public Task DeleteFromCardAsync(int id)
    {
        IEnumerable<Stock> result = context.Stocks.AsEnumerable().Where(s => s.CardId == id);
        if (result == null)
        {
            throw new Exception($"Socks with ID {id} does not have any stock to delete!!!");
        }
        foreach (var stock in result)
        {
            context.Stocks.Remove(stock);
        }
        context.SaveChanges();

        return Task.CompletedTask;
    }

    public Task DeleteAsync(int id)
    {
        Stock? existing = context.Stocks.FirstOrDefault(stock => stock.Id == id);
        if (existing == null)
        {
            throw new Exception($"Socks Stock with ID {id} does not exist!!!");
        }

        context.Stocks.Remove(existing);
        context.SaveChanges();

        return Task.CompletedTask;
    }
}