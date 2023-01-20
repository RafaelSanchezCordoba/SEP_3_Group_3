using Application.DaoInterfaces;
using Grpc.Core;
using Shared.Models;

namespace GrpcDataAccess.DAOs;

public class TrouserGrpcDao : ITrouserDao
{
    static Channel channel = new Channel("localhost:9999", ChannelCredentials.Insecure);
    private ProductGrpc.ProductGrpcClient stub = new ProductGrpc.ProductGrpcClient(channel);

    public Task<Trouser> CreateAsync(Trouser trouser)
    {
        var req = new product()
        {
            Color = trouser.Color, Size = trouser.Size, PcId = trouser.ProductCardId
        };

        try
        {
            var resp =  stub.createTrouser(req);
            Trouser newTrouser = new Trouser(resp.PcId, resp.Size, resp.Color);
            newTrouser.Id = resp.Id;
            return Task.FromResult(newTrouser);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }

    public async Task<IEnumerable<Trouser>> GetAsync()
    {
        var req = new emptyMessageProduct();
        using var call = stub.getAllTrousers(req);
        List<Trouser> list = new List<Trouser>();

        while (await call.ResponseStream.MoveNext())
        {
            var resp = call.ResponseStream.Current;
            Trouser trouser = new Trouser(resp.PcId, resp.Size, resp.Color);
            trouser.Id = resp.Id;
            Console.WriteLine(trouser);
            list.Add(trouser);
        }
        Console.WriteLine(list.Count);
        return await Task.FromResult(list.AsEnumerable());

    }

    public Task<Trouser> GetById(int id)
    {
        var req = new intReqProduct()
        {
            Request = id
        };
        var resp = stub.getById(req);
       Trouser trouser = new Trouser(resp.PcId, resp.Size, resp.Color);
        trouser.Id = resp.Id;
        return Task.FromResult(trouser);
    }

    public Task DeleteAsync(int id)
    {
        var req = new intReqProduct()
        {
            Request =id
        };
        stub.deleteById(req);
        
        return Task.CompletedTask;
    }
}