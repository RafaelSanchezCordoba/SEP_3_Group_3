namespace Shared.Models;

/// <summary>
/// Control the amount of the same product in the shopping cart
/// </summary>
public class CartItem
{
    public int Id { get; set; }
    public int Quantity { get; set; }
    public int ShoppingCartId { get; set; }
    public int ProductId { get; set; }

    /// <summary>
    /// Cart item constructor that set the quantity to 1
    /// </summary>
    /// <param name="shoppingCartId">Id of the shopping cart</param>
    /// <param name="productId">Id of the product</param>
    public CartItem(int shoppingCartId, int productId)
    {
        Quantity = 1;
        ShoppingCartId = shoppingCartId;
        ProductId = productId;
    }
}