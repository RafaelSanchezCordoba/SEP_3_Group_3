namespace Shared.Models;

public class ShoppingCart
{
    public int Id { get; set; }
    public int OwnerId { get; set; }
    public ICollection<Product> Products { get; set; }

    public ShoppingCart( int ownerId)
    {
        OwnerId = ownerId;
        Products = new List<Product>();
    }

    public void addProduct(Product product)
    {
        Products.Add(product);
    }
}