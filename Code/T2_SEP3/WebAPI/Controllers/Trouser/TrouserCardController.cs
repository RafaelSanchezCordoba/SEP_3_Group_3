using Application.LogicInterfaces;
using Application.LogicInterfaces.Trouser;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
using Shared.DTOs.Trousers;
using Shared.Models;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class TrouserCardController : ControllerBase
{
    private readonly ITrouserCardLogic trouserLogic;

    public TrouserCardController(ITrouserCardLogic trouserLogic)
    {
        this.trouserLogic = trouserLogic;
    }

    [HttpPost]
    public async Task<ActionResult<TrouserCard>> CreateAsync(CreateTrouserCardDto dto)
    {
        try
        {
            ProductCard trouser = await trouserLogic.CreateAsync(dto);
            return Created($"/trouserCard/{trouser.Id}", trouser);
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
            var socks = await trouserLogic.GetAsync();
            return Ok(socks);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet("{id:int}")]
    public async Task<ActionResult<TrouserCard>> GetById([FromRoute] int id)
    {
        try
        {
            var result = await trouserLogic.GetById(id);
            return Ok(result);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPatch]
    public async Task<ActionResult> UpdateAsync([FromBody] UpdateTrouserCardDto dto)
    {
        try
        {
            await trouserLogic.UpdateAsync(dto);
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
            await trouserLogic.DeleteAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    [HttpGet("{title}")]
    public async Task<ActionResult<TrouserCard>> GetByTitleAsync([FromRoute] string title)
    {
        try
        {
            TrouserCard post = await trouserLogic.GetByTitleAsync(title);
            return Ok(post);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}