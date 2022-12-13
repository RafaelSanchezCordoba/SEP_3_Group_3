namespace Shared.Models;

/// <summary>
/// Socks model class that implements the inheritance Product
/// </summary>
public class Socks : Product
{
    /// <summary>
    /// Socks constructor base on the inheritance
    /// </summary>
    /// <param name="productCardId">Id of the product card</param>
    /// <param name="size">Size of the socks</param>
    /// <param name="color">Color of the socks</param>
    public Socks(int productCardId, string size, string color) : base(productCardId, size, color)
    {
    }
}