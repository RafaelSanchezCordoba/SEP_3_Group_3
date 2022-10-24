namespace Shared.Models;

public class Stock
{
    public Stock()
    {
        Color = "none";
        Size = "none";
        Quantity = 0;
    }

    public string Color { get; set; }
    public string Size { get; set; }
    public long Quantity { get; set; }
}