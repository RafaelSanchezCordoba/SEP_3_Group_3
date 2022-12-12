using Application.DaoInterfaces;
using Shared.Models;

namespace FileData.DAOs;

public class InventoryFileDao:InterfaceInventoryDao
{
    private readonly FileContext context;

    public InventoryFileDao(FileContext context)
    {
        this.context = context;
    }

    public Task<Inventory> CreateAsync(Inventory inventory)
    {
        
        int Id = 1;
        if (context.Inventories.Any())
        {
            Id = context.Inventories.Max(u => u.Id);
            Id++;
        }

        ProductCard exists = context.SocksCards.FirstOrDefault(c => c.Id == inventory.CardId);
        if (exists==null)
        {
            throw new Exception($"Product with id{inventory.CardId} does not exists !!! cannot add Stock");
        }

        inventory.Id = Id;
        
        context.Inventories.Add(inventory);
        context.SaveChanges();
        return Task.FromResult(inventory);
    }

    public Task<IEnumerable<Inventory>> GetAsync()
    {
        IEnumerable<Inventory> result = context.Inventories.AsEnumerable();
        return Task.FromResult(result);
    }

    public Task<Inventory> GetById(int id)
    {
        Inventory? existing = context.Inventories.FirstOrDefault(stock => stock.Id == id);
        return Task.FromResult(existing);
    }

    public Task<IEnumerable<Inventory>> GetByCardIdAsync(int id)
    {
        IEnumerable<Inventory> result = context.Inventories.AsEnumerable().Where(s => s.CardId == id);
        return Task.FromResult(result);
    }

    public Task UpdateAsync(Inventory inventory)
    {
        Inventory? existing = context.Inventories.FirstOrDefault(card => card.Id == inventory.Id);
        if (existing == null)
        {
            throw new Exception($"Inventory with ID {inventory.Id} does not exist!!!");
        }

        context.Inventories.Remove(existing);
        context.Inventories.Add(inventory);
        context.SaveChanges();
        return Task.CompletedTask;
    }

    public Task DeleteFromCardAsync(int id)
    {
        IEnumerable<Inventory> result = context.Inventories.AsEnumerable().Where(s => s.CardId == id);
        if (result == null)
        {
            throw new Exception($"Socks with ID {id} does not have any stock to delete!!!");
        }
        foreach (var inventory in result)
        {
            context.Inventories.Remove(inventory);
        }
        context.SaveChanges();

        return Task.CompletedTask;
    }

    public Task DeleteAsync(int id)
    {
        Inventory? existing = context.Inventories.FirstOrDefault(stock => stock.Id == id);
        if (existing == null)
        {
            throw new Exception($"Socks Stock with ID {id} does not exist!!!");
        }

        context.Inventories.Remove(existing);
        context.SaveChanges();

        return Task.CompletedTask;
    }

    public Task<Inventory> GetByParameters(int scId, string color, string size)
    {
        Inventory? existing = context.Inventories.FirstOrDefault(i => i.CardId == scId && i.Color.Equals(color) && i.Size.Equals(size) );
        return Task.FromResult(existing);
    }
}