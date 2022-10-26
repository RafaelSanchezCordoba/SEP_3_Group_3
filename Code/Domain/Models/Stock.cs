namespace Shared.Models;

public class Stock
{
    private string Color { get; set; }
    private string Size { get; set; }
    private long Quantity { get; set; }

    public Stock(string color, string size, long quantity)
    {
        Color = color;
        Size = size;
        Quantity = quantity;
    }
}