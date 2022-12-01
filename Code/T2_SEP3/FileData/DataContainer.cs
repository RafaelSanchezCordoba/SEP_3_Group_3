using Shared.Models;

namespace FileData;

public class DataContainer
{
    public ICollection<Inventory> Inventories { get; set; }
    public ICollection<ShoppingCart> ShoppingCarts { get; set; }
    public ICollection<SocksCard> SocksCards { get; set; }
    public ICollection<Socks> Socks { get; set; }
    public ICollection<CardItem> CardItems { get; set; }
}