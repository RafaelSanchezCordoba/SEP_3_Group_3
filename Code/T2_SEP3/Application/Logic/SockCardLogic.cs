using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

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
        ValidateSocks(socksCard);
        SocksCard created = await socksDao.CreateAsync(socksCard);
        return created;
    }

    public Task<IEnumerable<SocksCard>> GetAsync()
    {
        return socksDao.GetAsync();
    }

    public Task<SocksCard> GetById(int id)
    {
        return socksDao.GetById(id);
    }

    public async Task UpdateAsync(SocksCard dto)
    {
        SocksCard? existing = await socksDao.GetById(dto.Id);

        if (existing == null)
        {
            throw new Exception($"Socks with ID {dto.Id} not found!!!");
        }
        
        string titleToUse = dto.Title ?? existing.Title;
        string descriptionToUse = dto.Description ?? existing.Description;
        string materialToUse = dto.Material ?? existing.Material;
        string brandToUse = dto.Brand ?? existing.Brand;
        string imageToUse = dto.Image ?? existing.Image;
        string typeToUse = dto.Type ?? existing.Type;

        SocksCard updated = new SocksCard(titleToUse, descriptionToUse, dto.Price, materialToUse, brandToUse, imageToUse,typeToUse)
        {
            Id = existing.Id
        };
        
        ValidateSocks(updated);
        await socksDao.UpdateAsync((SocksCard)updated);
    }

    public async Task DeleteAsync(int id)
    {
        ProductCard? productCard = await socksDao.GetById(id);
        if (productCard == null)
        {
            throw new Exception($"Socks with ID {id} was not found!!!");
        }

        await socksDao.DeleteAsync(id);
    }

    public async Task<IEnumerable<ProductCardBasicDto>> GetProductSockCardTitlesAsync()
    {
        return await socksDao.GetTitlesAsync();
    }

    public async Task<SocksCard?> GetByTitleAsync(string title)
    {
        return await socksDao.GetByTitlesAsync(title);
    }

    private void ValidateSocks(ProductCard dto)
    {
        if (string.IsNullOrEmpty(dto.Title)) throw new Exception("The title can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Description)) throw new Exception("The description can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Material)) throw new Exception("The material can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Brand)) throw new Exception("The brand can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Image)) throw new Exception("The image can not be empty!!!");
        if (dto.Price == 0) throw new Exception("The price can not be 0!!!");
        
    }
}