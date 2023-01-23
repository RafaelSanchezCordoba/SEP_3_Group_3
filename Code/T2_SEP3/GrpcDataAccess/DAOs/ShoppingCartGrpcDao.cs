using Application.DaoInterfaces;
using Grpc.Core;
using Shared.Models;

namespace GrpcDataAccess.DAOs;

public class ShoppingCartGrpcDao:IShoppingCartDao
{
    static Channel channel = new Channel("localhost:9999", ChannelCredentials.Insecure);
    private ShoppingCartGrpc.ShoppingCartGrpcClient stub = new ShoppingCartGrpc.ShoppingCartGrpcClient(channel);
    public Task<ShoppingCart> CreateAsync(ShoppingCart shoppingCart)
    {
        
        var req = new IntMessageCart()
        {
            Number = shoppingCart.OwnerId,
            
            
        };

        
        try
        {
            var empty = stub.createCart(req);
            ShoppingCart resp = new ShoppingCart(empty.OwnerId);
            resp.Id = empty.Id;

            return Task.FromResult(resp);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }

    public Task<ShoppingCart> GetById(int id)
    {
        var req = new IntMessageCart()
        {
            Number = id
        };
        var resp = stub.getCartByCartId(req);
        ShoppingCart shoppingCart = new ShoppingCart(resp.OwnerId);
        shoppingCart.Id = resp.Id;
        return Task.FromResult(shoppingCart);
    }

    public async Task<IEnumerable<ShoppingCart>> GetAsync()
    {
        var req = new EmptyCartMessage();
        using var call = stub.getAllCarts(req);
       
        List<ShoppingCart> list = new List<ShoppingCart>();

        while (await call.ResponseStream.MoveNext())
        {
            var resp = call.ResponseStream.Current;
            ShoppingCart shoppingCart = new ShoppingCart(resp.OwnerId);
            shoppingCart.Id = resp.Id;
            list.Add(shoppingCart);
        }
       
        return await Task.FromResult(list.AsEnumerable());
    }

    public Task<ShoppingCart> AddProduct(Product product, int cartId)
    {
        var req = new patchProductMessage()
        {
            CartInMessage = new cartProduct()
            {
                Id = product.Id,
                Size = product.Size,
                Color = product.Color,
                ProductCardId = product.ProductCardId
            },
            CartId = cartId

        };
        try
        {
            var empty = stub.addProductInCart(req);
            ShoppingCart resp = new ShoppingCart(empty.OwnerId);
            resp.Id = empty.Id;

            return Task.FromResult(resp);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
            
    }

    public Task DeleteAsync(int cartId)
    {
        var req = new IntMessageCart()
        {
            Number = cartId
        };
        var resp = stub.deleteByCartId(req);
     
        return Task.CompletedTask;
    }

    public Task<ShoppingCart> DeleteProductAsync(Product product, int id)
    {
        var req = new patchProductMessage()
        {
            CartInMessage = new cartProduct()
            {
                Id = product.Id,
                Size = product.Size,
                Color = product.Color,
                ProductCardId = product.ProductCardId
            },
            CartId = id

        };
        try
        {
            var empty = stub.deleteProductInCart(req);
            ShoppingCart resp = new ShoppingCart(empty.OwnerId);
            resp.Id = empty.Id;

            return Task.FromResult(resp);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }

    public Task<ShoppingCart> GetByCustomerId(int ownerId)
    {
        var req = new IntMessageCart()
        {
            Number = ownerId
        };
        var resp = stub.getCartByUserId(req);
        ShoppingCart shoppingCart = new ShoppingCart(resp.OwnerId);
        shoppingCart.Id = resp.Id;
        return Task.FromResult(shoppingCart);
    }

    public Task<double> GetTotalPriceAsync(int id)
    {
        var req = new IntMessageCart()
        {
            Number = id
        };
        var resp = stub.getTotalPrice(req);
        double totalprice = resp.Number;
       
        return Task.FromResult(totalprice);
    }
}