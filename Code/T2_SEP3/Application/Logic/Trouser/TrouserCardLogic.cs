using Application.DaoInterfaces;
using Application.LogicInterfaces.Trouser;
using Shared.DTOs;
using Shared.DTOs.Trousers;
using Shared.Models;

namespace Application.Logic;

public class TrouserCardLogic : ITrouserCardLogic
{
    private readonly ITrouserCardDao dao;

    public TrouserCardLogic(ITrouserCardDao dao)
    {
        this.dao = dao;
    }

    public async Task<TrouserCard> CreateAsync(CreateTrouserCardDto dto)
    {
        TrouserCard trouserCard = new TrouserCard(dto.Title, dto.Description, dto.Price, dto.Material, dto.Brand,
            dto.Image, dto.Type);
        ValidateTrouserCard(trouserCard);
        TrouserCard created = await dao.CreateAsync(trouserCard);
        return created;
    }

    public async Task<IEnumerable<TrouserCard>> GetAsync()
    {
        return await dao.GetAsync() ?? throw new Exception("TrouserCard were not found!!!");
    }

    public Task<TrouserCard> GetById(int id)
    {
        ValidateTrouserCardById(id);
        return dao.GetById(id) ??  throw new Exception($"Trouser with ID {id} was not found!!!");
    }

    public Task UpdateAsync(UpdateTrouserCardDto dto)
    {
        ValidateTrouserCardUpdate(dto);
        dao.UpdateAsync(dto);
        return dao.UpdateAsync(dto) ?? throw new Exception("TrouserCard was not found!!!");
    }

    public Task DeleteAsync(int id)
    {
        ValidateTrouserCardById(id);
        return dao.DeleteAsync(id) ?? throw new Exception($"Trouser with ID {id} was not found!!!");
    }

    public async Task<IEnumerable<ProductCardBasicDto>> GetProductSockCardTitlesAsync()
    {
        return await dao.GetTitlesAsync() ?? throw new Exception("TrouserCard were not found!!!");
    }

    public Task<TrouserCard?> GetByTitleAsync(string title)
    {
        ValidateTrouserCardByTitle(title);
        return dao.GetByTitlesAsync(title) ?? throw new Exception($"TrouserCard with title: {title} does not exist!!!");
    }
    
    private void ValidateTrouserCard(TrouserCard dto)
    {
        if (string.IsNullOrEmpty(dto.Title)) throw new Exception("The title can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Description)) throw new Exception("The description can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Material)) throw new Exception("The material can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Brand)) throw new Exception("The brand can not be empty!!!");
        if (string.IsNullOrEmpty(dto.Image)) throw new Exception("The image can not be empty!!!");
        if (dto.Price == 0) throw new Exception("The price can not be 0!!!");
        if (dto.Price < 0) throw new Exception("The price can not be negative!!!");
    }

    private void ValidateTrouserCardById(int id)
    {
        if (id <= 0) throw new Exception("Id must be > 0!!!");
    }

    private void ValidateTrouserCardByTitle(string title)
    {
        if (string.IsNullOrEmpty(title)) throw new Exception("Title can not be empty!!!");
    }

    private void ValidateTrouserCardUpdate(UpdateTrouserCardDto dto)
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