namespace Shared.DTOs;

/// <summary>
/// Creational dto for Socks
/// </summary>
public class CreateSocksDto
{
    public int ProductCardId { get; set; }
    public string Size { get; set; }
    public string Color { get; set; }

    /// <summary>
    /// Socks dto constructor
    /// </summary>
    /// <param name="productCardId">Product id of the socks</param>
    /// <param name="size">Size of the socks</param>
    /// <param name="color">Color of the socks</param>
    public CreateSocksDto(int productCardId, string size, string color)
    {
        ProductCardId = productCardId;
        Size = size;
        Color = color;
    }
}