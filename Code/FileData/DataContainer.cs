using Shared.Models;

namespace FileData;

public class DataContainer
{
    public ICollection<Stock> Stocks { get; set; }
    public ICollection<ProductCard> ProductCards { get; set; }
    public ICollection<Product> Products { get; set; }
    public ICollection<Socks> Socks { get; set; }
}