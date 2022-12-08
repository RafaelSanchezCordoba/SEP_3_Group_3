namespace Shared.DTOs;

public class UpdateUserDto
{ public int Id { get; set; }
     public string Password { get; set; }
    public string Name { get; set; }
    public string PhoneNumber { get; set; }

    public UpdateUserDto(int id)
    {
        Id = id;
    }
}