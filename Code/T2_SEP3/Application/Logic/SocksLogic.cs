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

    public async Task<Socks> CreateAsync(CreateSocks dto)
    {
        Socks socks = new Socks(dto.ProductCard, dto.Size, dto.Color);
        Socks created = await socksDao.CreateAsync(socks);
        return created;
    }

    public Task<IEnumerable<Socks>> GetAsync()
    {
        return socksDao.GetAsync();
    }

    public Task<Socks> GetById(int id)
    {
        return socksDao.GetById(id);
    }
}