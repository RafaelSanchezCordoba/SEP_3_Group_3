namespace Shared.DTOs;

public class CreateCartItemDto
{
    public int ShoppingCartId { get; }
    public int ProductId { get; }

    public CreateCartItemDto(int shoppingCartId, int productId)
    {
        ShoppingCartId = shoppingCartId;
        ProductId = productId;
    }
}