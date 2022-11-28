namespace Shared.Models;

public class Product
{
    public ProductCard ProductCard { get; set; }
    public int Id { get; set; }
    public string Size { get; set; }
    public string Color { get; set; }

    public Product(ProductCard productCard, string size, string color)
    {
        ProductCard = productCard;
        Size = size;
        Color = color;
    }

    public string getProductImg(ProductCard productCard)
    {
        return productCard.Image;
    }
}