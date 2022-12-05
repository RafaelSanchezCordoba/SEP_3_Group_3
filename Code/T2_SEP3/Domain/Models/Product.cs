namespace Shared.Models;

public class Product
{
    public int ProductCardId { get; set; }
    public int Id { get; set; }
    public string Size { get; set; }
    public string Color { get; set; }

    public Product(int productCardId, string size, string color)
    {
        ProductCardId = productCardId;
        Size = size;
        Color = color;
    }
}