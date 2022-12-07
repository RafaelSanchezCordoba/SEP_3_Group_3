using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
using Shared.Models;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class SockStockController:ControllerBase
{
    private readonly ISockStockLogic stockLogic;

    public SockStockController(ISockStockLogic stockLogic)
    {
        this.stockLogic = stockLogic;
    }
    
    [HttpPost]
    public async Task<ActionResult<Stock>> CreateAsync(CreateSockStockDto dto)
    {
        try
        {
            Stock stock = await stockLogic.CreateAsync(dto);
            return Created($"/stock/{stock.Id}", stock);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet]
    public async Task<ActionResult<IEnumerable<Stock>>> GetAsync()
    {
        try
        {
            var stocks = await stockLogic.GetAsync();
            return Ok(stocks);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet("{id:int}")]
    public async Task<ActionResult<Stock>> GetById([FromRoute] int id)
    {
        try
        {
            var result = await stockLogic.GetById(id);
            return Ok(result);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    [HttpGet("Cards/{id:int}")]
    public async Task<ActionResult<Stock>> GetByCardId([FromRoute] int id)
    {
        try
        {
            var result = await stockLogic.GetByCardIdAsync(id);
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
            await stockLogic.DeleteAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    [HttpDelete("Cards/{id:int}")]
    public async Task<ActionResult> DeleteFromCardAsync([FromRoute] int id)
    {
        try
        {
            await stockLogic.DeleteFromCardAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}