namespace Shared.Models;

public class TrouserCard : ProductCard
{
    public TrouserCard(string title, string description, double price, string material, string brand, string image, string type): base(title,description,price,material,brand,image,type)
    {
   
    }

    public TrouserCard(){}
}