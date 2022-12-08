namespace Shared.Models;

public class Adress
{
    public int Id { get; set; }
    public int UserId { get; set; }
    public string Country { get; set; }
    public string City { get; set; }
    public int PostCode { get; set; }
    public string Street { get; set; }
    public int Number { get; set; }
    public string ExtraInfo { get; set; }
  
}