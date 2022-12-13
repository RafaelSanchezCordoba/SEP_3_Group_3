namespace Shared.DTOs;

public class UpdateAdressDto
{
    public string Country { get; set; }
    public string City { get; set; }
    public string Street { get; set; }
    public int OwnerId { get; set; }
    public int PostCode { get; set; }
    public int Number { get; set; }
    public string ExtraInfo { get; set; }
}