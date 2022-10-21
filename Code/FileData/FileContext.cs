using System.Text.Json;
using Shared.Models;

namespace FileData;

public class FileContext
{
    private const string filePath = "data.json";
    private DataContainer? dataContainer;

    public ICollection<Stock> Stocks
    {
        get
        {
            LoadData();
            return dataContainer!.Stocks;
        }
    }
    
    public ICollection<Product> Products
    {
        get
        {
            LoadData();
            return dataContainer!.Products;
        }
    }
    public ICollection<Socks> Socks
    {
        get
        {
            LoadData();
            return dataContainer!.Socks;
        }
    }
    public ICollection<ProductCard> ProductCards
    {
        get
        {
            LoadData();
            return dataContainer!.ProductCards;
        }
    }
    private void LoadData()
    {
        if (dataContainer != null) return;
    
        if (!File.Exists(filePath))
        {
            dataContainer = new ()
            {
                Stocks = new List<Stock>(),
                Products = new List<Product>(),
                ProductCards = new List<ProductCard>(),
                Socks = new List<Socks>()
            };
            return;
        }
        string content = File.ReadAllText(filePath);
        dataContainer = JsonSerializer.Deserialize<DataContainer>(content);
    }
    
    public void SaveChanges()
    {
        string serialized = JsonSerializer.Serialize(dataContainer, new JsonSerializerOptions
        {
            WriteIndented = true
        });
        File.WriteAllText(filePath, serialized);
        dataContainer = null;
    }
}