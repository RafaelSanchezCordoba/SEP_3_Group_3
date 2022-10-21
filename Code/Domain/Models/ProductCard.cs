namespace Shared.Models;

public class ProductCard
{
    //We need to add a title to the product card.
    public Stock Stock { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    public double Price { get; set; }
    public string Material { get; set; }
    public string Brand { get; set; }
    public string Image { get; set; }
    public int Id { get; set; }

    public ProductCard(Stock stock, string title, string description, double price, string material, string brand, string image)
    {
        Stock = stock;
        Title = title;
        Description = description;
        Price = price;
        Material = material;
        Brand = brand;
        Image = image;
    }
}