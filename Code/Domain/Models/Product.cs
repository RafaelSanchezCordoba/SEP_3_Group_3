namespace Shared.Models;

public class Product
{
    private ProductCard ProductCard { get; set; }
    private long Id { get; set; }
    private string Size { get; set; }
    private string Color { get; set; }

    public Product(ProductCard productCard, string size, string color)
    {
        ProductCard = productCard;
        Size = size;
        Color = color;
    }
}