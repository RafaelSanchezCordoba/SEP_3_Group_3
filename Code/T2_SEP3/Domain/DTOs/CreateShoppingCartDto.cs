namespace Shared.DTOs;

/// <summary>
/// Creational dto for shopping cart taking the id of the owner
/// </summary>
public class CreateShoppingCartDto
{
    public int OwnerId { get;}
    
    /// <summary>
    /// Shopping cart dto constructor
    /// </summary>
    /// <param name="ownerId">Id of the owner</param>
    public CreateShoppingCartDto(int ownerId)
    {
        OwnerId = ownerId;
    }
}