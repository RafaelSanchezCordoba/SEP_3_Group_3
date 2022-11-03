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

    public async Task<ProductCardSock> CreateAsync(CreateSockCardDto dto)
    {
        ProductCardSock socksCard = new ProductCardSock( dto.Title, dto.Description, dto.Price, dto.Material, dto.Brand, dto.Image);
        ValidateSocks(socksCard);
        ProductCardSock created = await socksDao.CreateAsync(socksCard);
        return created;
    }

    public Task<IEnumerable<ProductCardSock>> GetAsync()
    {
        return socksDao.GetAsync();
    }

    public Task<ProductCardSock> GetById(int id)
    {
        return socksDao.GetById(id);
    }

    public async Task UpdateAsync(SocksCardUpdateDto dto)
    {
        ProductCard? existing = await socksDao.GetById(dto.Id);

        if (existing == null)
        {
            throw new Exception($"Socks with ID {dto.Id} not found!!!");
        }
        
        string titleToUse = dto.Title ?? existing.Title;
        string descriptionToUse = dto.Description ?? existing.Description;
        string materialToUse = dto.Material ?? existing.Material;
        string brandToUse = dto.Brand ?? existing.Brand;
        string imageToUse = dto.Image ?? existing.Image;

        ProductCard updated = new ProductCardSock(titleToUse, descriptionToUse, dto.Price, materialToUse, brandToUse, imageToUse)
        {
            Id = existing.Id
        };
        
        ValidateSocks(updated);
        await socksDao.UpdateAsync((ProductCardSock)updated);
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

    public async Task<ProductCardSock?> GetByTitleAsync(string title)
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