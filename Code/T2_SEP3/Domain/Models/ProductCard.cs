namespace Shared.Models;

public class ProductCard
{
    public string Title { get; set; }
    public string Description { get; set; }
    public double Price { get; set; }
    public string Material { get; set; }
    public string Brand { get; set; }
    public string Image { get; set; }
    public string Type { get; set; }
    public int Id { get; set; }
    
    protected ProductCard(string title, string description, double price, string material, string brand, string image, string type)
    {
        Title = title;
        Description = description;
        Price = price;
        Material = material;
        Brand = brand;
        Image = image;
        Type = type;
    }

    public ProductCard()
    {

    }
}