using Application.LogicInterfaces;
using Grpc.Core;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
using Shared.Models;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class UserController:ControllerBase
{
    private readonly IUserLogic _userLogic;

    public UserController(IUserLogic userLogic)
    {
        _userLogic = userLogic;
    }

    [HttpPost]
    public async Task<ActionResult<User>> createAsync(UserRegisterDto dto)
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

   
}