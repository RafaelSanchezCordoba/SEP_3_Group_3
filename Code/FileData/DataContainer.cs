using Shared.Models;

namespace FileData;

public class DataContainer
{
    public ICollection<Stock> Stocks { get; set; }
    public ICollection<ProductCardSock> ProductCardsSocks { get; set; }
    public ICollection<Product> Products { get; set; }
    public ICollection<Socks> Socks { get; set; }
}