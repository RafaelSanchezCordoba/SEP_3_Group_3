using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
using Shared.Models;

namespace WebAPI.Controllers;
[ApiController]
[Route("[controller]")]
public class ShoppingCartQuantitiesController:ControllerBase
{
    private readonly ICardItemLogic cardItemLogic;

    public ShoppingCartQuantitiesController(ICardItemLogic cardItemLogic)
    {
        this.cardItemLogic = cardItemLogic;
    }
    
    [HttpPost]
    public async Task<ActionResult<CardItem>> CreateAsync(CreateCardItemDto dto)
    {
        try
        {
            CardItem cardItem = await cardItemLogic.CreateAsync(dto);
            return Created($"/ShoppingCartQuantities/{cardItem.Id}", cardItem);
        }
        catch (Exception e)
        {

            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPatch("{Id:int}")]
    public async Task<ActionResult<ShoppingCart>> IncreaseQuantityAsync([FromRoute] int Id, [FromBody] int newQuantity)
    {
        try
        {
            CardItem cardItem = await cardItemLogic.UpdateQuantityAsync(Id, newQuantity);
            return Ok(cardItem);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }

    [HttpGet]
    public async Task<ActionResult<IEnumerable<CardItem>>> GetAsync()
    {
        try
        {
            var socks = await cardItemLogic.GetAsync();
            return Ok(socks);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    [HttpGet("{id:int}")]
    public async Task<ActionResult<ShoppingCart>> GetByIdAsync([FromRoute] int id)
    {
        try
        {
            var result = await cardItemLogic.GetByIdAsync(id);
            return Ok(result);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    [HttpGet("/Quantity/{id:int}")]
    public async Task<ActionResult<ShoppingCart>> GetById([FromRoute] int id)
    {
        try
        {
            var result = await cardItemLogic.GetQuantityById(id);
            return Ok(result);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}