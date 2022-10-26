namespace Shared.Models;

public class ProductCard
{
    private Stock Stock { get; set; }
    private string Description { get; set; }
    private double Price { get; set; }
    private string Material { get; set; }
    private string Brand { get; set; }
    private string Image { get; set; }
    private long Id { get; set; }

    public ProductCard(Stock stock, string description, double price, string material, string brand, string image)
    {
        Stock = stock;
        Description = description;
        Price = price;
        Material = material;
        Brand = brand;
        Image = image;
    }
}