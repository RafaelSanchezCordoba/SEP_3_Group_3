using Application.DaoInterfaces;
using Grpc.Core;
using Shared.DTOs;
using Shared.Models;

namespace GrpcDataAccess.DAOs;

public class SocksCardGrpcDao : ISockCardDao
{
    static Channel channel = new Channel("localhost:9999", ChannelCredentials.Insecure);
    private SocksCardGrpc.SocksCardGrpcClient stub = new SocksCardGrpc.SocksCardGrpcClient(channel);


    public Task<SocksCard> CreateAsync(SocksCard sockCard)
     {
         var req = new sockCard()
         {
             // Id = sockCard.Id,
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

     public Task<IEnumerable<ProductCardBasicDto>> GetTitlesAsync()
     {
         throw new NotImplementedException();
     }

     public Task<SocksCard> GetById(int id)
     {
         var req = new IntReq
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
         var req = new sockCard()
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
         SocksCard socksCard = new SocksCard(resp.Title, resp.Description,
             resp.Price, resp.Material, resp.Brand,
             resp.Image, resp.Type);
         return Task.CompletedTask;
     }

     public Task DeleteAsync(int id)
     {
         var req = new IntReq()
         {
             Request =id
         };
         var resp = stub.deleteSockCardById(req);
         SocksCard socksCard = new SocksCard(resp.Title, resp.Description,
             resp.Price, resp.Material, resp.Brand,
             resp.Image, resp.Type);
         return Task.CompletedTask;
     }

     public Task<SocksCard?> GetByTitlesAsync(string title)
     {
         var req = new StringReq()
         {
             Request =title
         };
         var resp = stub.getByTitle(req);
         SocksCard socksCard = new SocksCard(resp.Title, resp.Description,
             resp.Price, resp.Material, resp.Brand,
             resp.Image, resp.Type);
         socksCard.Id = resp.Id;
         return Task.FromResult(socksCard);
     }
}