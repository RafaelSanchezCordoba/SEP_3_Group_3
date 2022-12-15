using Application.DaoInterfaces;
using Grpc.Core;
using Shared.DTOs;
using Shared.DTOs.Trousers;
using Shared.Models;

namespace GrpcDataAccess.DAOs;

public class TrouserCardGrpcDao : ITrouserCardDao
{
    static Channel channel = new Channel("localhost:9999", ChannelCredentials.Insecure);
    private TrouserCardGrpc.TrouserCardGrpcClient stub = new TrouserCardGrpc.TrouserCardGrpcClient(channel);
    
    public Task<TrouserCard> CreateAsync(TrouserCard trouser)
    {
        var req = new trouserCard
        {
            Brand = trouser.Brand, Title = trouser.Title, Description = trouser.Description, Image = trouser.Image,
            Price = trouser.Price, Material = trouser.Material, Type = trouser.Type
        };
        
        try
        {
            var resp =  stub.addTrouserCard(req);
            resp.ToString();
            TrouserCard trouserCard = new TrouserCard(resp.Title, resp.Description,
                resp.Price, resp.Material, resp.Brand,
                resp.Image, resp.Type);
            trouser.Id = resp.Id;
            return Task.FromResult(trouser);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }

    public async Task<IEnumerable<TrouserCard>> GetAsync()
    {
        var req = new trouserCardEmpty();
        using var call = stub.getAllSockCards(req);
        List<TrouserCard> list = new List<TrouserCard>();

        while (await call.ResponseStream.MoveNext())
        {
            var resp = call.ResponseStream.Current;
            TrouserCard trouserCard = new TrouserCard(resp.Title, resp.Description,
                resp.Price, resp.Material, resp.Brand,
                resp.Image, resp.Type);
            trouserCard.Id = resp.Id;
            Console.WriteLine(trouserCard.Material);
            list.Add(trouserCard);
        }
        Console.WriteLine(list.Count);
        return await Task.FromResult(list.AsEnumerable());    }

    public Task<IEnumerable<ProductCardBasicDto>> GetTitlesAsync()
    {
        throw new NotImplementedException();
    }

    public Task<TrouserCard> GetById(int id)
    {
        var req = new trouserCardIntReq()
        {
            Request = id
        };
        var resp = stub.getById(req);
        TrouserCard trouserCard = new TrouserCard(resp.Title, resp.Description,
            resp.Price, resp.Material, resp.Brand,
            resp.Image, resp.Type);
        trouserCard.Id = resp.Id;
        return Task.FromResult(trouserCard);
    }

    public Task UpdateAsync(UpdateTrouserCardDto dto)
    {
        var req = new trouserCard()
        {
            Id = dto.Id
            ,Description = dto.Description
            ,Brand = dto.Brand
            ,Image = dto.Image
            ,Material = dto.Material
            ,Price = dto.Price
            ,Title = dto.Title
            ,Type = dto.Title
        };
        var resp = stub.updateSockCard(req);
        TrouserCard trouserCard = new TrouserCard(resp.Title, resp.Description,
            resp.Price, resp.Material, resp.Brand,
            resp.Image, resp.Type);
        return Task.CompletedTask;
    }

    public Task DeleteAsync(int id)
    {
        var req = new trouserCardIntReq()
        {
            Request =id
        };
        var resp = stub.deleteSockCardById(req);
        TrouserCard trouserCard = new TrouserCard(resp.Title, resp.Description,
            resp.Price, resp.Material, resp.Brand,
            resp.Image, resp.Type);
        return Task.CompletedTask;    }

    public Task<TrouserCard?> GetByTitlesAsync(string title)
    {
        var req = new trouserCardStringReq()
        {
            Request =title
        };
        var resp = stub.getByTitle(req);
        TrouserCard trouserCard = new TrouserCard(resp.Title, resp.Description,
            resp.Price, resp.Material, resp.Brand,
            resp.Image, resp.Type);
        trouserCard.Id = resp.Id;
        return Task.FromResult(trouserCard);    }
}