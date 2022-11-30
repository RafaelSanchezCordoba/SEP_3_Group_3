namespace Shared.Models;

public class CardItem
{
    public int Id { get; set; }
    public int Quantity { get; set; }
    public int ShoppingCartId { get; set; }
    public int ProductId { get; set; }

    public CardItem(int shoppingCartId, int productId)
    {
        Quantity = 1;
        ShoppingCartId = shoppingCartId;
        ProductId = productId;
    }
}