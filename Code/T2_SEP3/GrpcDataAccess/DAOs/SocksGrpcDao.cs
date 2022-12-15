using Application.DaoInterfaces;
using Grpc.Core;
using Shared.Models;

namespace GrpcDataAccess.DAOs;

public class SocksGrpcDao : ISocksDao
{
    static Channel channel = new Channel("localhost:9999", ChannelCredentials.Insecure);
    private SocksGrpc.SocksGrpcClient stub = new SocksGrpc.SocksGrpcClient(channel);


    public Task<Socks> CreateAsync(Socks socks)
    {
        var req = new sock()
        {
            Color = socks.Color, Size = socks.Size, ScId = socks.ProductCardId
        };

        try
        {
            var resp =  stub.create(req);
            resp.ToString();
            Socks sock = new Socks(resp.ScId, resp.Size, resp.Color);
            sock.Id = resp.Id;
            return Task.FromResult(sock);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }

    public async Task<IEnumerable<Socks>> GetAsync()
    {
        var req = new EmptySocksMessage();
        using var call = stub.getAll(req);
        List<Socks> list = new List<Socks>();

        while (await call.ResponseStream.MoveNext())
        {
            var resp = call.ResponseStream.Current;
            Socks sock = new Socks(resp.ScId, resp.Size, resp.Color);
            sock.Id = resp.Id;
            Console.WriteLine(sock);
            list.Add(sock);
        }
        Console.WriteLine(list.Count);
        return await Task.FromResult(list.AsEnumerable());
    }

    public Task<Socks> GetById(int id)
    {
        var req = new IntReqSock()
        {
            Request = id
        };
        var resp = stub.getById(req);
        Socks sock = new Socks(resp.ScId, resp.Size, resp.Color);
        sock.Id = resp.Id;
        return Task.FromResult(sock);
    }

    public Task DeleteAsync(int id)
    {
        var req = new IntReqSock()
        {
            Request =id
        };
        stub.deleteById(req);
        
        return Task.CompletedTask;
    }
}