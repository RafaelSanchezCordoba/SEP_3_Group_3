using Application.DaoInterfaces;
using Grpc.Core;
using Shared.DTOs;
using Shared.Models;
using Empty = Google.Protobuf.WellKnownTypes.Empty;

namespace GrpcDataAccess.DAOs;

public class SockCardsGrpcDao: ISockCardDao
{
    static Channel channel = new Channel("localhost:9999", ChannelCredentials.Insecure);
    private SockCardGrpc.SockCardGrpcClient stub = new SockCardGrpc.SockCardGrpcClient(channel);
    
     public Task<SocksCard> CreateAsync(SocksCard sockCard)
     {
          var req = new sockCard
         {
             Id = sockCard.Id,
             Brand = sockCard.Brand, Title = sockCard.Title, Description = sockCard.Description, Image = sockCard.Image,
             Price = sockCard.Price, Material = sockCard.Material, Type = sockCard.Type
         };

          try
          {
              var empty =  stub.addSockCard(req);
              empty.ToString();
          }
          catch (Exception e)
          {
              Console.WriteLine(e);
              throw;
          }

          return Task.FromResult(sockCard);
        
     }

     public Task<IEnumerable<SocksCard>> GetAsync()
     {
         throw new NotImplementedException();
     }

     public Task<IEnumerable<ProductCardBasicDto>> GetTitlesAsync()
     {
         throw new NotImplementedException();
     }

     public Task<SocksCard> GetById(int id)
     {
         throw new NotImplementedException();
     }

     public Task UpdateAsync(SocksCard dto)
     {
         throw new NotImplementedException();
     }

     public Task DeleteAsync(int id)
     {
         throw new NotImplementedException();
     }

     public Task<SocksCard?> GetByTitlesAsync(string title)
     {
         throw new NotImplementedException();
     }
}