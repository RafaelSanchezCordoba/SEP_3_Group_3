namespace Shared.Models;

public class Inventory
{
    public Inventory()
    {
        Color = "none";
        Size = "none";
        Quantity = 0;
    }

    public Inventory(int cardId, string color, string size, long quantity)
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