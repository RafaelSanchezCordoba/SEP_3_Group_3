using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
using Shared.Models;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class ShoppingCartController:ControllerBase
{
    private readonly IShoppingCartLogic shoppingcartLogic;

    public ShoppingCartController(IShoppingCartLogic shoppingCartLogic)
    {
        shoppingcartLogic = shoppingCartLogic;
    }
    
    [HttpPost]
    public async Task<ActionResult<ShoppingCart>> CreateAsync(CreateShoppingCartDto dto)
    {
        try
        {
            ShoppingCart shoppingCart = await shoppingcartLogic.CreateAsync(dto);
            return Created($"/shoppingCarts/{shoppingCart.Id}", shoppingCart);
        }
        catch (Exception e)
        {
            
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPatch("{shoppingCartId:int}")]
    public async Task<ActionResult<ShoppingCart>> AddProductAsync([FromBody]Product product,[FromRoute]int shoppingCartId)
    {
        try
        {
            ShoppingCart pc=  await shoppingcartLogic.AddProduct(product,shoppingCartId);
            return Ok(pc);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }
    
    
}