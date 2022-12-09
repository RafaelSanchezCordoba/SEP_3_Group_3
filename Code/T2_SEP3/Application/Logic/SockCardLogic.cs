using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;
using Exception = System.Exception;

namespace Application.Logic;

public class SockCardLogic : ISockCardLogic
{
    private readonly ISockCardDao socksDao;

    public SockCardLogic(ISockCardDao socksDao)
    {
        this.socksDao = socksDao;
    }

    public async Task<SocksCard> CreateAsync(CreateSockCardDto dto)
    {
        SocksCard socksCard = new SocksCard( dto.Title, dto.Description, dto.Price, dto.Material, dto.Brand, dto.Image, dto.Type);
        ValidateSocksCard(socksCard);
        SocksCard created = await socksDao.CreateAsync(socksCard);
        return created;
    }

    public async Task<IEnumerable<SocksCard>> GetAsync()
    {
        return await socksDao.GetAsync() ?? throw new Exception("SocksCards were not found!!!");
    }

    public Task<SocksCard> GetById(int id)
    {
        ValidateSockCardById(id);
        return socksDao.GetById(id) ??  throw new Exception($"Socks with ID {id} was not found!!!");
    }

    public  Task UpdateAsync(UpdateSocksCardDto dto)
    {
        ValidateSockCardUpdate(dto);
        socksDao.UpdateAsync(dto);
        return socksDao.UpdateAsync(dto) ?? throw new Exception("SocksCard was not found!!!");
    }

    public  Task DeleteAsync(int id)
    {
        ValidateSockCardById(id);
        return socksDao.DeleteAsync(id) ?? throw new Exception($"Socks with ID {id} was not found!!!");
    }

    public async Task<IEnumerable<ProductCardBasicDto>> GetProductSockCardTitlesAsync()
    {
        return await socksDao.GetTitlesAsync() ?? throw new Exception("SocksCards were not found!!!");
    }

    public Task<SocksCard?> GetByTitleAsync(string title)
    {
        ValidateSockCardByTitle(title);
        return socksDao.GetByTitlesAsync(title) ?? throw new Exception($"SockCard with title: {title} does not exist!!!");
    }

    private void ValidateSocksCard(ProductCard dto)
    {
        if (string.IsNullOrEmpty(dto.Title)) throw new Exception("The title can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Description)) throw new Exception("The description can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Material)) throw new Exception("The material can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Brand)) throw new Exception("The brand can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Image)) throw new Exception("The image can not be empty!!!");
        if (dto.Price == 0) throw new Exception("The price can not be 0!!!");
        if (dto.Price < 0) throw new Exception("The price can not be negative!!!");
    }

    private void ValidateSockCardById(int id)
    {
        if (id <= 0) throw new Exception("Id must be > 0!!!");
    }

    private void ValidateSockCardByTitle(string title)
    {
        if (string.IsNullOrEmpty(title)) throw new Exception("Title can not be empty!!!");
    }

    private void ValidateSockCardUpdate(UpdateSocksCardDto dto)
    {
        if (string.IsNullOrEmpty(dto.Title)) throw new Exception("The title can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Description)) throw new Exception("The description can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Material)) throw new Exception("The material can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Brand)) throw new Exception("The brand can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Image)) throw new Exception("The image can not be empty!!!");
        if (dto.Price == 0) throw new Exception("The price can not be 0!!!");
        if (dto.Price < 0) throw new Exception("The price can not be negative!!!");
    }
}