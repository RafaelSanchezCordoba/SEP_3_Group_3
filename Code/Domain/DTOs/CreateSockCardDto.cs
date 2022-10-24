using Shared.Models;

namespace Shared.DTOs;

public class CreateSockCardDto
{
    public Stock Stock { get; }
    public string Title { get; }
    public string Description { get; }
    public double Price { get; }
    public string Material { get; }
    public string Brand { get; }
    public string Image { get; }

   

    public CreateSockCardDto(Stock stock, string title, string description, double price, string material, string brand, string image)
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