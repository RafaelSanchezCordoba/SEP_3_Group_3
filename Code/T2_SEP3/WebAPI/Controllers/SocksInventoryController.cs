using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
using Shared.Models;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class SocksInventoryController:ControllerBase
{
    private readonly ISocksInventoryLogic inventoryLogic;

    public SocksInventoryController(ISocksInventoryLogic stockLogic)
    {
        this.inventoryLogic = stockLogic;
    }
    
    [HttpPost]
    public async Task<ActionResult<Inventory>> CreateAsync(CreateSockInventoryDto dto)
    {
        try
        {
            Inventory inventory = await inventoryLogic.CreateAsync(dto);
            return Created($"/sockInventory/{inventory.Id}", inventory);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet]
    public async Task<ActionResult<IEnumerable<Inventory>>> GetAsync()
    {
        try
        {
            var inventories = await inventoryLogic.GetAsync();
            return Ok(inventories);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet("{id:int}")]
    public async Task<ActionResult<Inventory>> GetById([FromRoute] int id)
    {
        try
        {
            var result = await inventoryLogic.GetById(id);
            return Ok(result);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    [HttpGet("card{id:int}")]
    public async Task<ActionResult<IEnumerable<Inventory>>> GetByCardId([FromRoute] int id)
    {
        try
        {
            var result = await inventoryLogic.GetByCardIdAsync(id);
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
            await inventoryLogic.DeleteAsync(id);
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
            await inventoryLogic.DeleteFromCardAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpPatch]
    public async Task<ActionResult<Inventory>> UpdateAsync([FromBody] Inventory inventory)
    {
        try
        {
            await inventoryLogic.UpdateAsync(inventory);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}