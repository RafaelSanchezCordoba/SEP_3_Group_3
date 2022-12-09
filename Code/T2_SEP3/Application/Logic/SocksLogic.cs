using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

public class SocksLogic : ISocksLogic
{
    private readonly ISocksDao socksDao;

    public SocksLogic(ISocksDao socksDao)
    {
        this.socksDao = socksDao;
    }

    public async Task<Socks> CreateAsync(CreateSocksDto dto)
    {
        Socks socks = new Socks(dto.ProductCardId, dto.Size, dto.Color);
        ValidateSocks(socks);
        Socks created = await socksDao.CreateAsync(socks);
        return created;
    }

    public async Task<IEnumerable<Socks>> GetAsync()
    {
        return await socksDao.GetAsync() ?? throw new Exception("Socks were not found!!!");
    }

    public async Task<Socks> GetById(int id)
    {
        ValidateSocksById(id);
        return await socksDao.GetById(id) ?? throw new Exception($"Socks with id: {id} was not found!!!");
    }
    
    public  Task DeleteAsync(int id)
    {
        ValidateSocksById(id);
        return socksDao.DeleteAsync(id) ?? throw new Exception($"Socks with ID {id} was not found!!!");
    }
    

    public void ValidateSocks(Socks dto)
    {
        if (string.IsNullOrEmpty(dto.Size)) throw new Exception("Size can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Color)) throw new Exception("Color can not be empty!!!");
        if (dto.ProductCardId <= 0) throw new Exception("ProductCard id must be > 0!!!");
    }

    public void ValidateSocksById(int id)
    {
        if (id <= 0) throw new Exception("Id must be > 0!!!");
    }
}