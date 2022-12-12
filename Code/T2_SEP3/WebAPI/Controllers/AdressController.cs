using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;
using Shared.Models;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class AdressController:ControllerBase
{
    private readonly IAddressLogic addressLogic;

    public AdressController(IAddressLogic addressLogic)
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
    public async Task<ActionResult<IEnumerable<Address>>> getUsersAdresses()
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
    [Route("/NonRegAddreses")]
    public async Task<ActionResult<IEnumerable<Address>>> getNonUserAdresses()
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
    [Route("/UserAdress/{id}")]
    public async Task<ActionResult<IEnumerable<Address>>> getByAdressByUserId([FromRoute]int id)
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

