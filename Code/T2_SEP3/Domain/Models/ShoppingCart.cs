namespace Shared.Models;

public class ShoppingCart
{
    public int Id { get; set; }
    public int? OwnerId { get; set; }
    private ICollection<Product> products;

    public ShoppingCart( int? ownerId)
    {
        if (ownerId != null)
        {
            OwnerId = ownerId;
        }

      
        products = new List<Product>();
    }

    public void addProduct(Product product)
    {
        products.Add(product);
    }
}