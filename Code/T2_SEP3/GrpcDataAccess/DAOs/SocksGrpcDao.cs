using Application.DaoInterfaces;
using Grpc.Core;
using Shared.Models;

namespace GrpcDataAccess.DAOs;

public class SocksGrpcDao : ISocksDao
{
    static Channel channel = new Channel("localhost:9999", ChannelCredentials.Insecure);
    private ProductGrpc.ProductGrpcClient stub = new ProductGrpc.ProductGrpcClient(channel);


    public Task<Socks> CreateAsync(Socks socks)
    {
        var req = new product()
        {
            Color = socks.Color, Size = socks.Size, PcId = socks.ProductCardId
        };

        try
        {
            var resp =  stub.createSock(req);
            resp.ToString();
            Socks sock = new Socks(resp.PcId, resp.Size, resp.Color);
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
        var req = new emptyMessageProduct();
        using var call = stub.getAllSocks(req);
        List<Socks> list = new List<Socks>();

        while (await call.ResponseStream.MoveNext())
        {
            var resp = call.ResponseStream.Current;
            Socks sock = new Socks(resp.PcId, resp.Size, resp.Color);
            sock.Id = resp.Id;
            Console.WriteLine(sock);
            list.Add(sock);
        }
        Console.WriteLine(list.Count);
        return await Task.FromResult(list.AsEnumerable());
    }

    public Task<Socks> GetById(int id)
    {
        var req = new intReqProduct()
        {
            Request = id
        };
        var resp = stub.getById(req);
        Socks sock = new Socks(resp.PcId, resp.Size, resp.Color);
        sock.Id = resp.Id;
        return Task.FromResult(sock);
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