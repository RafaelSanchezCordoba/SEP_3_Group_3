namespace Shared.Models;

public class Order
{
    public int Id { get; set; }
    public int NumberOfProducts { get; set; }
    public double TotalPrice { get; set; }
    public string Status { get; set; }
    public string CustomerName { get; set; }
    public string CustomerEmail { get; set; }
    public string CustomerPhoneNumber { get; set; }
    public ShoppingCart ShoppingCart { get; set; }
    public Address Shipping { get; set; }

    public Order(int numberOfProducts, double totalPrice, string status, string customerName, string customerEmail, string customerPhoneNumber, ShoppingCart shoppingCart, Address shipping)
    {
        NumberOfProducts = numberOfProducts;
        TotalPrice = totalPrice;
        Status = status;
        CustomerName = customerName;
        CustomerEmail = customerEmail;
        CustomerPhoneNumber = customerPhoneNumber;
        ShoppingCart = shoppingCart;
        Shipping = shipping;
    }
}