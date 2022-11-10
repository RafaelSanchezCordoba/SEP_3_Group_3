namespace Shared.Models;

public class Socks
{
    private SocksCard SocksCard { get; set; }
    private int Id { get; set; }
    private string Size { get; set; }
    private string Color { get; set; }

    public Socks(SocksCard socksCard, string size, string color)
    {
        SocksCard = socksCard;
        Size = size;
        Color = color;
    }
}