using Application.DaoInterfaces;
using Application.Logic;
using Grpc.Core;
using Shared.Models;

namespace GrpcDataAccess.DAOs;

public class SockInventoryGrpcDao:ISocksInventoryDao
{
    static Channel channel = new Channel("localhost:9999", ChannelCredentials.Insecure);
    private SocksInventoryGrpc.SocksInventoryGrpcClient stub = new SocksInventoryGrpc.SocksInventoryGrpcClient(channel);

    public Task<Inventory> CreateAsync(Inventory inventory)
    {
        var req = new inventory()
        {
            Id = inventory.Id,
            CardId = inventory.CardId,
            Color = inventory.Color,
            Quantity = (int)inventory.Quantity,
            Size = inventory.Size

        };

        
        try
        {
            var empty = stub.create(req);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }

        return Task.FromResult(inventory);
    }

    public async Task<IEnumerable<Inventory>> GetAsync()
    {
        var req = new EmptyInventoryMessage();
        using var call = stub.getAll(req);
       
        List<Inventory> list = new List<Inventory>();

        while (await call.ResponseStream.MoveNext())
        {
            var resp = call.ResponseStream.Current;
            Inventory inventory = new Inventory(resp.CardId,resp.Color,resp.Size,resp.Quantity);
            inventory.Id = resp.Id;
            
            list.Add(inventory);
        }
        Console.WriteLine(list.Count);
        return await Task.FromResult(list.AsEnumerable());

    }

    public Task<Inventory> GetById(int id)
    {
        var req = new IntReqInventory()
        {
            Request = id
        };
        var resp = stub.getById(req);
        Inventory inventory = new Inventory(resp.CardId,resp.Color,resp.Size,resp.Quantity);
        inventory.Id = resp.Id;
        return Task.FromResult(inventory);
    }

    public async Task<IEnumerable<Inventory>> GetByCardIdAsync(int id)
    {
        var req = new IntReqInventory()
        {
            Request = id
        };
        using var call = stub.getByCardId(req);
       
        List<Inventory> list = new List<Inventory>();

        while (await call.ResponseStream.MoveNext())
        {
            var resp = call.ResponseStream.Current;
            Inventory inventory = new Inventory(resp.CardId,resp.Color,resp.Size,resp.Quantity);
            inventory.Id = resp.Id;
            
            list.Add(inventory);
        }
        Console.WriteLine(list.Count);
        return await Task.FromResult(list.AsEnumerable());
    }

    public Task UpdateAsync(Inventory dto)
    {
        var req = new inventory()
        {
            Id = dto.Id,
            CardId = dto.CardId,
            Color = dto.Color,
            Quantity = (int)dto.Quantity,
            Size = dto.Size
        };
        var resp = stub.updateInventory(req);
        return Task.CompletedTask;
    }

    public Task DeleteFromCardAsync(int id)
    {
        var req = new IntReqInventory
        {
            Request =id
        };
        var resp = stub.deleteByCardId(req);
     
        return Task.CompletedTask;
    }

    public Task DeleteAsync(int id)
    {
        var req = new IntReqInventory
        {
            Request =id
        };
        var resp = stub.deleteById(req);
     
        return Task.CompletedTask;
    }
}