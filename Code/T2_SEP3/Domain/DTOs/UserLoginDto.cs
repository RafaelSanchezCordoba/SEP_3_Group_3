using System.ComponentModel.DataAnnotations;

namespace Shared.DTOs;

public class UserLoginDto
{
    [Required]
    public string Email { get; set; } = string.Empty;

    [Required, StringLength(30, MinimumLength = 5)]
    public string Password { get; set; } = string.Empty;
}