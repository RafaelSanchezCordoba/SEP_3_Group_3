using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
using Shared.Models;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class SocksController : ControllerBase
{
    private readonly ISocksLogic socksLogic;

    public SocksController(ISocksLogic socksLogic)
    {
        this.socksLogic = socksLogic;
    }
    
    [HttpPost]
    public async Task<ActionResult<Socks>> CreateAsync(CreateSocksDto dto)
    {
        try
        {
            Socks socks = await socksLogic.CreateAsync(dto);
            return Created($"/socks/{socks.Id}", socks);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet]
    public async Task<ActionResult<IEnumerable<Socks>>> GetAsync()
    {
        try
        {
            var socks = await socksLogic.GetAsync();
            return Ok(socks);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet("{id:int}")]
    public async Task<ActionResult<Socks>> GetById([FromRoute] int id)
    {
        try
        {
            var result = await socksLogic.GetById(id);
            return Ok(result);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpDelete("{id:int}")]
    public async Task<ActionResult> DeleteAsync([FromRoute] int id)
    {
        try
        {
            await socksLogic.DeleteAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}