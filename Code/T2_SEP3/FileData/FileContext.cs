using System.Text.Json;
using Shared.Models;

namespace FileData;

public class FileContext
{
    private const string filePath = "data.json";
    private DataContainer? dataContainer;

    public ICollection<Inventory> Inventories
    {
        get
        {
            LoadData();
            return dataContainer!.Inventories;
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
    public ICollection<SocksCard> SocksCards
    {
        get
        {
            LoadData();
            return dataContainer!.SocksCards;
        }
    }

    public ICollection<User> Users
    {
        get
        {
            LoadData();
            return dataContainer!.Users;
        }
    }

    private void LoadData()
    {
        if (dataContainer != null) return;
    
        if (!File.Exists(filePath))
        {
            dataContainer = new ()
            {
                Inventories = new List<Inventory>(),
                SocksCards = new List<SocksCard>(),
                Socks = new List<Socks>(),
                Users = new List<User>()
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