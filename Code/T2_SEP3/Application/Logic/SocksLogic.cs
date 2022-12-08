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
        ValidateSocks(dto);
        Socks created = await socksDao.CreateAsync(socks);
        return created;
    }

    public Task<IEnumerable<Socks>> GetAsync()
    {
        return socksDao.GetAsync();
    }
    
    private void ValidateSocks(CreateSocksDto dto)
    {
        if (string.IsNullOrEmpty(dto.Color)) throw new Exception("Please Select a Color!!!");
        if (string.IsNullOrEmpty(dto.Size)) throw new Exception("Please Select a Size!!!");
    }

    public Task<Socks> GetById(int id)
    {
        return socksDao.GetById(id);
    }
}