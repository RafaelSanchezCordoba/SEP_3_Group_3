namespace Shared.Models;

/// <summary>
/// Shopping cart model class
/// </summary>
public class ShoppingCart
{
    public int Id { get; set; }
    public int OwnerId { get; set; }
    public ICollection<Product> Products { get; set; }

    /// <summary>
    /// Shopping cart constructor
    /// </summary>
    /// <param name="ownerId">Id of the owner</param>
    public ShoppingCart( int ownerId)
    {
        OwnerId = ownerId;
        Products = new List<Product>();
    }

    /// <summary>
    /// Add product to the shopping cart
    /// </summary>
    /// <param name="product">The product to add</param>
    public void AddProduct(Product product)
    {
        Products.Add(product);
    }

    /// <summary>
    /// Remove product from the shopping cart
    /// </summary>
    /// <param name="product">The product to remove</param>
    /// <exception cref="Exception">If the product is not in the shopping cart</exception>
    public void RemoveProduct(Product product)
    {
        foreach (var i in Products)
        {
            if (i.Id==product.Id)
                {
                  Products.Remove(i);
                  return;
                }
        }
        throw new Exception("That product is not on the shopping cart");
    }
}