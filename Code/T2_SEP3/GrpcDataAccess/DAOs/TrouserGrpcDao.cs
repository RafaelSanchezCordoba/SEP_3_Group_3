using Application.DaoInterfaces;
using Grpc.Core;
using Shared.Models;

namespace GrpcDataAccess.DAOs;

public class TrouserGrpcDao : ITrouserDao
{
    static Channel channel = new Channel("localhost:9999", ChannelCredentials.Insecure);
    private TrouserGrpc.TrouserGrpcClient stub = new TrouserGrpc.TrouserGrpcClient(channel);


    public Task<Trouser> CreateAsync(Trouser trouser)
    {
        var req = new trouser()
        {
            Color = trouser.Color, Size = trouser.Size, ScId = trouser.ProductCardId
        };

        try
        {
            var resp =  stub.create(req);
            resp.ToString();
            Trouser card = new Trouser(resp.ScId, resp.Size, resp.Color);
            card.Id = resp.Id;
            return Task.FromResult(card);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }

    public async Task<IEnumerable<Trouser>> GetAsync()
    {
        var req = new trouserEmpty();
        using var call = stub.getAll(req);
        List<Trouser> list = new List<Trouser>();

        while (await call.ResponseStream.MoveNext())
        {
            var resp = call.ResponseStream.Current;
            Trouser trouser = new Trouser(resp.ScId, resp.Size, resp.Color);
            trouser.Id = resp.Id;
            Console.WriteLine(trouser);
            list.Add(trouser);
        }
        Console.WriteLine(list.Count);
        return await Task.FromResult(list.AsEnumerable());
    }

    public Task<Trouser> GetById(int id)
    {
        var req = new trouserIntReq()
        {
            Request = id
        };
        var resp = stub.getById(req);
        Trouser trouser = new Trouser(resp.ScId, resp.Size, resp.Color);
        trouser.Id = resp.Id;
        return Task.FromResult(trouser);
    }

    public Task DeleteAsync(int id)
    {
        var req = new trouserIntReq()
        {
            Request =id
        };
        stub.deleteById(req);
        
        return Task.CompletedTask;
    }
}