using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
using Shared.Models;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class AddressController:ControllerBase
{
    private readonly IAddressLogic addressLogic;

    public AddressController(IAddressLogic addressLogic)
    {
        this.addressLogic = addressLogic;
    }
    
    
    [HttpGet("{id:int}")]
    public async Task<ActionResult<Address>> GetById([FromRoute] int id)
    {
        try
        {
            var result = await addressLogic.GetById(id);
            return Ok(result);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPost]
    public async Task<ActionResult> CreateAsync(Address address)
    {
        try
        {
            Address result = await addressLogic.CreateAsync(address);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        } 
    }

    [HttpGet]
    public async Task<ActionResult<IEnumerable<Address>>> GetUsersAddresses()
    {
        try
        {
            var adresses = await  addressLogic.GetUserAddresses();
            return Ok(adresses);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    [HttpGet]
    [Route("/NonRegAddresses")]
    public async Task<ActionResult<IEnumerable<Address>>> GetNonUserAddresses()
    {
        try
        {
            var adresses = await addressLogic.GetNonUserAddresses();
            return Ok(adresses);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet]
    [Route("/UserAddress/{id}")]
    public async Task<ActionResult<IEnumerable<Address>>> GetByUserId([FromRoute]int id)
    {
        try
        {
            var adresses = await addressLogic.GetByUserId( id);
            return Ok(adresses);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpPatch]
    public async Task<ActionResult> UpdateAsync([FromBody] UpdateAdressDto dto)
    {
        try
        {
            await addressLogic.UpdateAsync(dto);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }


}

