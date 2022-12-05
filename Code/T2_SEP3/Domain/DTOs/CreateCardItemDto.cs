namespace Shared.DTOs;

public class CreateCardItemDto
{
    public int ShoppingCartId { get; }
    public int ProductId { get; }

    public CreateCardItemDto(int shoppingCartId, int productId)
    {
        ShoppingCartId = shoppingCartId;
        ProductId = productId;
    }
}