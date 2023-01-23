using Application.DaoInterfaces;
using Grpc.Core;
using Shared.DTOs;
using Shared.DTOs.Trousers;
using Shared.Models;

namespace GrpcDataAccess.DAOs;

public class TrouserCardGrpcDao : ITrouserCardDao
{
    static Channel channel = new Channel("localhost:9999", ChannelCredentials.Insecure);
    private ProductCardGrpc.ProductCardGrpcClient stub = new ProductCardGrpc.ProductCardGrpcClient(channel);

    public Task<TrouserCard> CreateAsync(TrouserCard trouser)
    {
        var req = new productCard
        {
             Id = trouser.Id,
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
            trouserCard.Id = resp.Id;
            return Task.FromResult(trouserCard);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }

    public async Task<IEnumerable<TrouserCard>> GetAsync()
    {
        var req = new Empty();
        using var call = stub.getAllTrouserCards(req);
        List<TrouserCard> list = new List<TrouserCard>();

        while (await call.ResponseStream.MoveNext())
        {
            var resp = call.ResponseStream.Current;
            TrouserCard card = new TrouserCard(resp.Title, resp.Description,
                resp.Price, resp.Material, resp.Brand,
                resp.Image, resp.Type);
            card.Id = resp.Id;
            list.Add(card);
        }
        Console.WriteLine(list.Count);
        return await Task.FromResult(list.AsEnumerable());
    }

    public async Task<IEnumerable<ProductCardBasicDto>> GetTitlesAsync()
    {
        var req = new Empty();
        using var call = stub.getAllTrouserCards(req);
        List<ProductCardBasicDto> list = new List<ProductCardBasicDto>();

        while (await call.ResponseStream.MoveNext())
        {
            var resp = call.ResponseStream.Current;
            ProductCardBasicDto dto = new ProductCardBasicDto(resp.Title);
            list.Add(dto);
        }
        Console.WriteLine(list.Count);
        return await Task.FromResult(list.AsEnumerable());

    }

    public Task<TrouserCard> GetById(int id)
    {
        var req = new IntReqCard()
        {
            Request = id
        };
        var resp = stub.getById(req);
        TrouserCard card = new TrouserCard(resp.Title, resp.Description,
            resp.Price, resp.Material, resp.Brand,
            resp.Image, resp.Type);
        card.Id = resp.Id;
        return Task.FromResult(card);
    }

    public Task UpdateAsync(UpdateTrouserCardDto dto)
    {
        var req = new productCard()
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
        var resp = stub.updateCard(req);
        return Task.CompletedTask;
    }

    public Task DeleteAsync(int id)
    {
        var req = new IntReqCard()
        {
            Request =id
        };
        var resp = stub.deleteProductCardById(req);
        return Task.CompletedTask;
    }

    public Task<TrouserCard?> GetByTitlesAsync(string title)
    {
        var req = new StringReqCard()
        {
            Request =title
        };
        var resp = stub.getByTitleSockCard(req);
        TrouserCard trouserCard = new TrouserCard(resp.Title, resp.Description,
            resp.Price, resp.Material, resp.Brand,
            resp.Image, resp.Type);
        trouserCard.Id = resp.Id;
        return Task.FromResult(trouserCard);
    }
}