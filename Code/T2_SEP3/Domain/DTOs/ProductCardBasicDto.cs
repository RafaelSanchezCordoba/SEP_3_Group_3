namespace Shared.DTOs;

/// <summary>
/// Basic dto for product
/// </summary>
public class ProductCardBasicDto
{
    private string title;

    /// <summary>
    /// Constructor
    /// </summary>
    /// <param name="title">Title of the product</param>
    public ProductCardBasicDto(string title)
    {
        this.title = title;
    }
}