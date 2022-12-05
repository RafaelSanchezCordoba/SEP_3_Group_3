using System.ComponentModel.DataAnnotations;

namespace Shared.DTOs;

public class UserRegisterDto
{
    [Required]
    public string Email { get; set; }

    [Required,StringLength(30,MinimumLength = 5)]
    public string Password { get; set; }

    [Compare("Password", ErrorMessage = "password do not match")]
    
    public string ConfirmPassword { get; set; } = string.Empty;
}