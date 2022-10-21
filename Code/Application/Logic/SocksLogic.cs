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

    public async Task<ProductCard> CreateAsync(CreateSockCardDto dto)
    {
        ProductCard socksCard = new ProductCard(dto.Stock, dto.Title, dto.Description, dto.Price, dto.Material, dto.Brand, dto.Image);
        ValidateSocks(socksCard);
        ProductCard created = await socksDao.CreateAsync(socksCard);
        return created;
    }

    public Task<IEnumerable<ProductCard>> GetAsync()
    {
        return socksDao.GetAsync();
    }

    public Task<ProductCard> GetById(int id)
    {
        return socksDao.GetById(id);
    }

    private void ValidateSocks(ProductCard dto)
    {
        if (string.IsNullOrEmpty(dto.Title)) throw new Exception("The title can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Description)) throw new Exception("The description can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Material)) throw new Exception("The material can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Brand)) throw new Exception("The brand can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Image)) throw new Exception("The image can not be empty!!!");
        if (dto.Price == 0) throw new Exception("The price can not be 0!!!");
        if (string.IsNullOrEmpty(dto.Stock.Color)) throw new Exception("The color can not be empty!!!");
    }
}