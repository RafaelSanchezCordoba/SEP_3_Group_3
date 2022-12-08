using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
using Shared.Models;

namespace WebAPI.Controllers;

[ApiController]
[Route("[Controller]")]

public class OrderController:ControllerBase
{
    private readonly IOrderLogic orderLogic;

    public OrderController(IOrderLogic orderLogic)
    {
        this.orderLogic = orderLogic;
    }
    
    [HttpPost]
    public async Task<ActionResult<Order>> CreateAsync(CreateOrderDto order)
    {
        try
        {
            Order created = await orderLogic.CreateAsync(order);
            return Created($"/order/{created.Id}", created);
        }
        catch (Exception e)
        {
            
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}