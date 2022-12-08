using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.Models;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class AdressController:ControllerBase
{
    private readonly IAdressLogic adressLogic;

    public AdressController(IAdressLogic adressLogic)
    {
        this.adressLogic = adressLogic;
    }

    [HttpPost]
    public async Task<ActionResult> CreateAsync(Adress adress)
    {
        try
        {
            Adress result = await adressLogic.CreateAsync(adress);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        } 
    }

    [HttpGet]
    public async Task<ActionResult<IEnumerable<Adress>>> getUsersAdresses()
    {
        try
        {
            var adresses = await  adressLogic.getUserAdresses();
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
    public async Task<ActionResult<IEnumerable<Adress>>> getNonUserAdresses()
    {
        try
        {
            var adresses = await adressLogic.getNonUserAdresses();
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
    public async Task<ActionResult<IEnumerable<Adress>>> getByAdressByUserId([FromRoute]int id)
    {
        try
        {
            var adresses = await adressLogic.getByUserId( id);
            return Ok(adresses);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }


}
