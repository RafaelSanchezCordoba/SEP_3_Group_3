using Application.DaoInterfaces;
using Application.LogicInterfaces.Trouser;
using Shared.DTOs.Trousers;
using Shared.Models;

namespace Application.Logic;

public class TrouserLogic : ITrouserLogic
{
    private readonly ITrouserDao dao;

    public TrouserLogic(ITrouserDao dao)
    {
        this.dao = dao;
    }
    
    public async Task<Trouser> CreateAsync(CreateTrouserDto dto)
    {
        Trouser trouser = new Trouser(dto.ProductCardId, dto.Size, dto.Color);
        ValidateSocks(trouser);
        Trouser created = await dao.CreateAsync(trouser);
        return created;
    }

    public async Task<IEnumerable<Trouser>> GetAsync()
    {
        return await dao.GetAsync() ?? throw new Exception("Trouser were not found!!!");
    }

    public async Task<Trouser> GetById(int id)
    {
        ValidateSocksById(id);
        return await dao.GetById(id) ?? throw new Exception($"Trouser with id: {id} was not found!!!");
    }
    
    public  Task DeleteAsync(int id)
    {
        ValidateSocksById(id);
        return dao.DeleteAsync(id) ?? throw new Exception($"Trouser with ID {id} was not found!!!");
    }
    
    public void ValidateSocks(Trouser dto)
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