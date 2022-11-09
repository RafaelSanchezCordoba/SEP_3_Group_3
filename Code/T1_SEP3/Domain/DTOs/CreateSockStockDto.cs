namespace Shared.DTOs;

public class CreateSockStockDto
{
    public int CardId { get;}

    public string Color { get; }

    public string Size { get; }

    public long Quantity { get; set; }

    public CreateSockStockDto(int cardId, string color, string size, long quantity)
    {
        this.CardId = cardId;
        this.Color = color;
        this.Size = size;
        this.Quantity = quantity;
    }
    
}