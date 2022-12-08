using System.Text.Json;
using Shared.Models;

namespace FileData;

public class FileContext
{
    private const string filePath = "data.json";
    private DataContainer? dataContainer;


    public ICollection<Adress> Adresses
    {
        get
        {
            LoadData();
            return dataContainer!.Adresses;
        }
    }

    public ICollection<Inventory> Inventories
    {
        get
        {
            LoadData();
            return dataContainer!.Inventories;
        }
    }
    public ICollection<ShoppingCart> ShoppingCarts
    {
        get
        {
            LoadData();
            return dataContainer!.ShoppingCarts;
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

    public ICollection<CardItem> CardItems
        {
        get
        {
            LoadData();
            return dataContainer!.CardItems;
        }
    }
    
    public ICollection<Order>  Orders
    {
        get
        {
            LoadData();
            return dataContainer!.Orders;
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

                Users = new List<User>(),
                ShoppingCarts = new List<ShoppingCart>(),
                CardItems = new List<CardItem>(),
<<<<<<< HEAD
                Adresses = new List<Adress>()
=======
                Orders = new List<Order>()
>>>>>>> origin/OrderWebAPI

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
