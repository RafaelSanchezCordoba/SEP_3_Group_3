using Shared.Models;

namespace FileData;

public class DataContainer
{
    public ICollection<Inventory> Inventories { get; set; }
    public ICollection<ShoppingCart> ShoppingCarts { get; set; }
    public ICollection<SocksCard> SocksCards { get; set; }
    public ICollection<Socks> Socks { get; set; }
    public ICollection<User> Users { get; set; }
    public ICollection<Address> Adresses { get; set; }
    public ICollection<CartItem> CardItems { get; set; }
    public ICollection<Order> Orders { get; set; }
    public ICollection<TrouserCard> TrouserCards { get; set; }
    public ICollection<Trouser> Trousers { get; set; }

}