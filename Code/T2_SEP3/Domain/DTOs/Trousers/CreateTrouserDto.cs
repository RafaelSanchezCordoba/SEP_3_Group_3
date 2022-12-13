namespace Shared.DTOs.Trousers;

public class CreateTrouserDto
{
    public int ProductCardId { get; set; }
    public string Size { get; set; }
    public string Color { get; set; }

    public CreateTrouserDto(int productCardId, string size, string color)
    {
        ProductCardId = productCardId;
        Size = size;
        Color = color;
    }
}