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
<<<<<<< HEAD
    public string ExtraInfo { get; set; }
  
=======
    public string ExtraInfo{ get; set; }

    public Adress(int id, int userId, string country, string city, int postCode, string street, int number, string extraInfo)
    {
        Id = id;
        UserId = userId;
        Country = country;
        City = city;
        PostCode = postCode;
        Street = street;
        Number = number;
        ExtraInfo = extraInfo;
    }
>>>>>>> origin/OrderWebAPI
}