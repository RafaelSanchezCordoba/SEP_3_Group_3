namespace Shared.Models;

public class SocksCard:ProductCard
{
    public SocksCard(string title, string description, double price, string material, string brand, string image, string type): base(title,description,price,material,brand,image,type)
    {
   
    }
    public SocksCard(int id,string title, string description, double price, string material, string brand, string image, string type): base(id,title,description,price,material,brand,image,type)
    {
   
    }
    
}