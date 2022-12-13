using Application.LogicInterfaces.Trouser;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs.Trousers;
using Shared.Models;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class TrouserController : ControllerBase
{
    private readonly ITrouserLogic trouserLogic;

    public TrouserController(ITrouserLogic trouserLogic)
    {
        this.trouserLogic = trouserLogic;
    }
    
    [HttpPost]
    public async Task<ActionResult<Trouser>> CreateAsync(CreateTrouserDto dto)
    {
        try
        {
            Trouser trouser = await trouserLogic.CreateAsync(dto);
            return Created($"/trouser/{trouser.Id}", trouser);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet]
    public async Task<ActionResult<IEnumerable<Trouser>>> GetAsync()
    {
        try
        {
            var trousers = await trouserLogic.GetAsync();
            return Ok(trousers);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet("{id:int}")]
    public async Task<ActionResult<Trouser>> GetById([FromRoute] int id)
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
}