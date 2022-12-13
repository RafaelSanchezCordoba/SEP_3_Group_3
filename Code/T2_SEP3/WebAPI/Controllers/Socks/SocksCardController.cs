using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
using Shared.Models;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class SocksCardsController : ControllerBase
{
    private readonly ISockCardLogic socksLogic;

    public SocksCardsController(ISockCardLogic socksLogic)
    {
        this.socksLogic = socksLogic;
    }

    [HttpPost]
    public async Task<ActionResult<SocksCard>> CreateAsync(CreateSockCardDto dto)
    {
        try
        {
            ProductCard socks = await socksLogic.CreateAsync(dto);
            return Created($"/socksCards/{socks.Id}", socks);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet]
    public async Task<ActionResult<IEnumerable<ProductCardBasicDto>>> GetAsync()
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
    public async Task<ActionResult<SocksCard>> GetById([FromRoute] int id)
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

    [HttpPatch]
    public async Task<ActionResult> UpdateAsync([FromBody] UpdateSocksCardDto dto)
    {
        try
        {
            await socksLogic.UpdateAsync(dto);
            return Ok();
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
    [HttpGet("{title}")]
    public async Task<ActionResult<SocksCard>> GetByTitleAsync([FromRoute] string title)
    {
        try
        {
            SocksCard post = await socksLogic.GetByTitleAsync(title);
            return Ok(post);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}