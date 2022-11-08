namespace Shared.Models;

public class Stock
{
    public Stock()
    {
        Color = "none";
        Size = "none";
        Quantity = 0;
    }

    public Stock(int cardId, string color, string size, long quantity)
    {
        CardId = cardId;
        Color = color;
        Size = size;
        Quantity = quantity;
    }

    public int CardId { get; set; }
    public string Color { get; set; }
    public string Size { get; set; }
    public long Quantity { get; set; }

    public int Id { get; set; }
}