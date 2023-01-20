using System.Threading.Channels;
using Application.DaoInterfaces;
using Grpc.Core;
using Shared.DTOs;
using Shared.Models;
using Channel = Grpc.Core.Channel;

namespace GrpcDataAccess.DAOs;

public class SocksCardGrpcDao : ISockCardDao
{ 
    static Channel channel = new Channel("localhost:9999", ChannelCredentials.Insecure);
    private ProductCardGrpc.ProductCardGrpcClient stub = new ProductCardGrpc.ProductCardGrpcClient(channel);
    
    public Task<SocksCard> CreateAsync(SocksCard sockCard)
     {
         var req = new productCard
         { 
             Id = sockCard.Id,
             Brand = sockCard.Brand, Title = sockCard.Title, Description = sockCard.Description, Image = sockCard.Image,
             Price = sockCard.Price, Material = sockCard.Material, Type = sockCard.Type
         };

          try
          {
              var resp =  stub.addSockCard(req);
              resp.ToString();
              SocksCard socksCard = new SocksCard(resp.Title, resp.Description,
                  resp.Price, resp.Material, resp.Brand,
                  resp.Image, resp.Type);
              socksCard.Id = resp.Id;
              return Task.FromResult(socksCard);
          }
          catch (Exception e)
          {
              Console.WriteLine(e);
              throw;
          }
     }
    
     public async Task<IEnumerable<SocksCard>> GetAsync()
     {
         var req = new Empty();
         using var call = stub.getAllSockCards(req);
         List<SocksCard> list = new List<SocksCard>();

         while (await call.ResponseStream.MoveNext())
         {
             var resp = call.ResponseStream.Current;
             SocksCard socksCard = new SocksCard(resp.Title, resp.Description,
                 resp.Price, resp.Material, resp.Brand,
                 resp.Image, resp.Type);
             socksCard.Id = resp.Id;
             Console.WriteLine(socksCard.Material);
             list.Add(socksCard);
         }
         Console.WriteLine(list.Count);
         return await Task.FromResult(list.AsEnumerable());

     }

     public async Task<IEnumerable<ProductCardBasicDto>> GetTitlesAsync()
     {
         var req = new Empty();
         using var call = stub.getAllSockCards(req);
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

     public Task<SocksCard> GetById(int id)
     {
         var req = new IntReqCard()
         {
             Request = id
         };
         var resp = stub.getById(req);
         SocksCard socksCard = new SocksCard(resp.Title, resp.Description,
             resp.Price, resp.Material, resp.Brand,
             resp.Image, resp.Type);
         socksCard.Id = resp.Id;
         return Task.FromResult(socksCard);
     }
     
     public Task UpdateAsync(UpdateSocksCardDto dto)
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

     public Task<SocksCard> GetByTitlesAsync(string title)
     {
         var req = new StringReqCard()
         {
             Request =title
         };
         var resp = stub.getByTitleSockCard(req);
         SocksCard socksCard = new SocksCard(resp.Title, resp.Description,
             resp.Price, resp.Material, resp.Brand,
             resp.Image, resp.Type);
         socksCard.Id = resp.Id;
         return Task.FromResult(socksCard);
     }
}