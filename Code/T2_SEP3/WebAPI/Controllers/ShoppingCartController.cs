using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
using Shared.Models;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class ShoppingCartController : ControllerBase
{
    private readonly IShoppingCartLogic shoppingcartLogic;
    private readonly ICardItemLogic cardItemLogic;

    public ShoppingCartController(IShoppingCartLogic shoppingCartLogic, ICardItemLogic cardItemLogic)
    {
        this.shoppingcartLogic = shoppingCartLogic;
        this.cardItemLogic = cardItemLogic;
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

    [HttpGet]
    public async Task<ActionResult<IEnumerable<ShoppingCart>>> GetAsync()
    {
        try
        {
            var socks = await shoppingcartLogic.GetAsync();
            return Ok(socks);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet("{id:int}")]
    public async Task<ActionResult<ShoppingCart>> GetById([FromRoute] int id)
    {
        try
        {
            var result = await shoppingcartLogic.GetById(id);
            return Ok(result);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPost("{shoppingCartId:int}")]
    public async Task<ActionResult<ShoppingCart>> AddProductAsync([FromBody] Product product,
        [FromRoute] int shoppingCartId)
    {
        try
        {
            ShoppingCart pc = await shoppingcartLogic.AddProduct(product, shoppingCartId);
            cardItemLogic.CreateAsync(new CardItem(shoppingCartId, product.Id));
            return Ok(pc);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }

    [HttpPatch("{cardItemIncrease:int}")]
    public async Task<ActionResult<ShoppingCart>> IncreaseQuantityAsync([FromRoute] int cardItemId)
    {
        try
        {
            CardItem cardItem = await cardItemLogic.IncreaseQuantityAsync(cardItemId);
            return Ok(cardItem);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }
    
    [HttpPatch("{cardItemDecrease:int}")]
    public async Task<ActionResult<ShoppingCart>> DecreaseQuantityAsync([FromRoute] int cardItemId)
    {
        try
        {
            CardItem cardItem = await cardItemLogic.DecreaseQuantityAsync(cardItemId);
            return Ok(cardItem);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }
}