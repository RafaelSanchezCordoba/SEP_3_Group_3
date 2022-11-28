using Shared.Models;

namespace Shared.DTOs;

public class CreateSocksDto
{
    public int ProductCardId { get; set; }
    public string Size { get; set; }
    public string Color { get; set; }

    public CreateSocksDto(int productCardId, string size, string color)
    {
        ProductCardId = productCardId;
        Size = size;
        Color = color;
    }
}