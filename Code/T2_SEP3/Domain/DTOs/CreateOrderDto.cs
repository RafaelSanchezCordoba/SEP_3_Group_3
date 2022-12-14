using Shared.Models;

namespace Shared.DTOs;

public class CreateOrderDto
{
    public int NumberOfProducts { get; set; }
    public double TotalPrice { get; set; }
    public string Status { get; set; }
    public string CustomerName { get; set; }
    public string CustomerEmail { get; set; }
    public string CustomerPhoneNumber { get; set; }
    public ShoppingCart ShoppingCart { get; set; }
    public Address Shipping { get; set; }
    
    public CreateOrderDto( int numberOfProducts,string status, string customerName, string customerEmail, string customerPhoneNumber, ShoppingCart shoppingCart, Address shipping)
    {
        NumberOfProducts = numberOfProducts;
        Status = status;
        CustomerName = customerName;
        CustomerEmail = customerEmail;
        CustomerPhoneNumber = customerPhoneNumber;
        ShoppingCart = shoppingCart;
        Shipping = shipping;
    }
}