namespace Shared.DTOs;

public class CreateShoppingCartDto
{
    
    public int OwnerId { get;}
    
    public CreateShoppingCartDto(int ownerId)
    {
        OwnerId = ownerId;
    }

  
}