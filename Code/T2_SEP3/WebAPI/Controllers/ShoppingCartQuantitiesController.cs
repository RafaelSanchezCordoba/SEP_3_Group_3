using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
using Shared.Models;

namespace WebAPI.Controllers;
[ApiController]
[Route("[controller]")]
public class ShoppingCartQuantitiesController:ControllerBase
{
    private readonly ICartItemLogic cartItemLogic;

    public ShoppingCartQuantitiesController(ICartItemLogic cartItemLogic)
    {
        this.cartItemLogic = cartItemLogic;
    }
    
    [HttpPost]
    public async Task<ActionResult<CartItem>> CreateAsync(CreateCartItemDto dto)
    {
        try
        {
            CartItem cartItem = await cartItemLogic.CreateAsync(dto);
            return Created($"/ShoppingCartQuantities/{cartItem.Id}", cartItem);
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
            CartItem cardItem = await cartItemLogic.UpdateQuantityAsync(Id, newQuantity);
            return Ok(cardItem);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }
    [HttpGet]
    public async Task<ActionResult<IEnumerable<CartItem>>> GetAsync()
    {
        try
        {
            var socks = await cartItemLogic.GetAsync();
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
            var result = await cartItemLogic.GetByIdAsync(id);
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
            var result = await cartItemLogic.GetQuantityById(id);
            return Ok(result);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    [HttpGet("/ShoppingCartQuantities/IDs")]
    public async Task<ActionResult<ShoppingCart>> GetByIdsAsync([FromQuery] int product_id,
        [FromQuery] int shoppingCard_id)
    {
        try
        {
            var result = await cartItemLogic.GetByIdsAsync(product_id,shoppingCard_id);
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
            await cartItemLogic.DeleteAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}