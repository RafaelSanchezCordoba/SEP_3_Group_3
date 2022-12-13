namespace Shared.DTOs;

/// <summary>
/// Creational dto for cart item
/// </summary>
public class CreateCartItemDto
{
    public int ShoppingCartId { get; }
    public int ProductId { get; }

    /// <summary>
    /// Cart item dto constructor
    /// </summary>
    /// <param name="shoppingCartId">Id of the shopping cart</param>
    /// <param name="productId">Id of the product</param>
    public CreateCartItemDto(int shoppingCartId, int productId)
    {
        ShoppingCartId = shoppingCartId;
        ProductId = productId;
    }
}