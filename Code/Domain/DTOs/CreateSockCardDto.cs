using Shared.Models;

namespace Shared.DTOs;

public class CreateSockCardDto
{
    
    public string Title { get; }
    public string Description { get; }
    public double Price { get; }
    public string Material { get; }
    public string Brand { get; }
    public string Image { get; }
    public string Type { get; }

   

    public CreateSockCardDto(string title, string description, double price, string material, string brand, string image, string type)
    {
       
        Title = title;
        Description = description;
        Price = price;
        Material = material;
        Brand = brand;
        Image = image;
        Type = type;
    }
}