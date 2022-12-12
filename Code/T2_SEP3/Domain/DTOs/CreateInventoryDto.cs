namespace Shared.DTOs;



public class CreateInventoryDto
{
    public int CardId { get;}

    public string Color { get; }

    public string Size { get; }

    public long Quantity { get; set; }
    
    public CreateInventoryDto(int cardId, string color, string size, long quantity)
    {
        this.CardId = cardId;
        this.Color = color;
        this.Size = size;
        this.Quantity = quantity;
    }
}