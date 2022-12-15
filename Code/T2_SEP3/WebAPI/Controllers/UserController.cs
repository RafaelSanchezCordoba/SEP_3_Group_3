using System.ComponentModel.DataAnnotations;
using System.IdentityModel.Tokens.Jwt;
using System.Security.Claims;
using System.Text;
using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Microsoft.IdentityModel.Tokens;
using Shared.DTOs;
using Shared.Models;
using JwtRegisteredClaimNames = Microsoft.IdentityModel.JsonWebTokens.JwtRegisteredClaimNames;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class UserController:ControllerBase
{
    private readonly IUserLogic _userLogic;
    private readonly IConfiguration config;

    public UserController(IUserLogic userLogic,IConfiguration config)
    {
        _userLogic = userLogic;
        this.config = config;
    }

    [HttpPatch]
    public async Task<ActionResult<User>> UpdateAsync([FromBody] User user)
    {
        try
        {
            
                var result = await _userLogic.Update(user);
                return Ok(result);
          
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPost]
    public async Task<ActionResult<User>> CreateAsyn(UserRegisterDto dto)
    {
        try
        {
            var responseUser = await _userLogic.Register(new User
            {
                Email = dto.Email
            }, dto.Password);
            return Ok(responseUser);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPost, Route("login")]
    public async Task<ActionResult> Login([FromBody] UserLoginDto dto)
    {
        try
        {
            User user = await _userLogic.ValidateUser(dto.Email, dto.Password);
            string token = GenerateJwt(user);

            return Ok(token);

        }
        catch (Exception e)
        {
            return BadRequest(e.Message);
        }
    }

    private List<Claim> GenerateClaims(User user)
    {
        
        var claims = new[]
        {
            new Claim(JwtRegisteredClaimNames.Sub, config["Jwt:Subject"]),
            new Claim(JwtRegisteredClaimNames.Jti, Guid.NewGuid().ToString()),
            new Claim(JwtRegisteredClaimNames.Iat, DateTime.UtcNow.ToString()),
            new Claim("Authorization", user.Auth),
           new Claim("Email",user.Email),
           new Claim("Id",user.Id.ToString())
        };
        
        return claims.ToList();
    }
    
    private string GenerateJwt(User user)
    {
        List<Claim> claims = GenerateClaims(user);
    
        SymmetricSecurityKey key = new SymmetricSecurityKey(Encoding.UTF8.GetBytes(config["Jwt:Key"]));
        SigningCredentials signIn = new SigningCredentials(key, SecurityAlgorithms.HmacSha512);
    
        JwtHeader header = new JwtHeader(signIn);
    
        JwtPayload payload = new JwtPayload(
            config["Jwt:Issuer"],
            config["Jwt:Audience"],
            claims, 
            null,
            DateTime.UtcNow.AddMinutes(60));
    
        JwtSecurityToken token = new JwtSecurityToken(header, payload);
    
        string serializedToken = new JwtSecurityTokenHandler().WriteToken(token);
        return serializedToken;
    }

    [HttpGet("{email}")]
    public async Task<ActionResult<User>> GetByEmail([FromRoute]string email)
    {
        try
        {
            var result = await _userLogic.GetByEmail(email);
            return Ok(result);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}