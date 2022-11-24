using Shared.Models;

namespace Shared.DTOs;

public class CreateSocks
{
    public ProductCard ProductCard { get; }
    public string Size { get; }
    public string Color { get; }

    public CreateSocks(ProductCard productCard, string size, string color)
    {
        ProductCard = productCard;
        Size = size;
        Color = color;
    }
}