using Shared.Models;

namespace Shared.DTOs;

public class SocksCardUpdateDto
{
    public Stock Stock { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    public double Price { get; set; }
    public string Material { get; set; }
    public string Brand { get; set; }
    public string Image { get; set; }
    public int Id { get; }

    public SocksCardUpdateDto(int id)
    {
        Id = id;
    }
}