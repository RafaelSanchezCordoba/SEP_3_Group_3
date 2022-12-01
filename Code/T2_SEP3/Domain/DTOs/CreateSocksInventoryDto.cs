namespace Shared.DTOs;

<<<<<<<< HEAD:Code/T2_SEP3/Domain/DTOs/CreateSocksInventoryDto.cs
public class CreateSocksInventoryDto
========
public class CreateSockInventoryDto
>>>>>>>> new-master:Code/T2_SEP3/Domain/DTOs/CreateSockInventoryDto.cs
{
    public int CardId { get;}

    public string Color { get; }

    public string Size { get; }

    public long Quantity { get; set; }

<<<<<<<< HEAD:Code/T2_SEP3/Domain/DTOs/CreateSocksInventoryDto.cs
    public CreateSocksInventoryDto(int cardId, string color, string size, long quantity)
========
    public CreateSockInventoryDto(int cardId, string color, string size, long quantity)
>>>>>>>> new-master:Code/T2_SEP3/Domain/DTOs/CreateSockInventoryDto.cs
    {
        this.CardId = cardId;
        this.Color = color;
        this.Size = size;
        this.Quantity = quantity;
    }
    
}