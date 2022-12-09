using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

public class AdressLogic:IAdressLogic
{
    private readonly IUserDao _userDao;
    private readonly IAdressDao _adressDao;
    
    public AdressLogic(IUserDao userDao,IAdressDao adressDao)
    {
        _userDao = userDao;
        _adressDao = adressDao;
    }

    public  Task<Adress> CreateAsync(Adress adress)
    {
         ValidateAddress(adress);
         
         if (!_userDao.UserExists(adress.UserId).Result)
         {
             adress.UserId = -1;
             _adressDao.Create(adress);
             return Task.FromResult(adress);
         }
        
         User user = _userDao.GetById(adress.UserId).Result;
         adress.Id = -1;
         user.Adress = adress;
         _userDao.UpdateUser(user);
             Adress result = adress;

             return Task.FromResult(result);
         
    }

    public Task<IEnumerable<Adress>> getUserAdresses()
    {
       return _adressDao.getUserAdresses() ?? throw new Exception($"Addresses were not found");
    }

    public Task<IEnumerable<Adress>> getNonUserAdresses()
    {
        return _adressDao.getNonUserAdresses() ?? throw new Exception($"Addresses were not found");
    }

    public Task<Adress> getByUserId(int id)
    {
        ValidateById(id);
        User user = _userDao.GetById(id).Result ?? throw new Exception($"User with ID {id} was not found");
        Adress result = user.Adress;
        return Task.FromResult(result);
    }

    public async Task UpdateAsync(UpdateAdressDto dto)
    {
        User user = await _userDao.GetById(dto.OwnerId);
        if (user == null)
        {
            throw new Exception($"User with ID {dto.OwnerId} not found!!!");
        }
        Adress? existing = user.Adress;
        string CountryToUse = dto.Country ?? existing.Country ;
        string CityToUse = dto.City ?? existing.City ;
        int PostCodeToUse = dto.PostCode;
        if (dto.PostCode==null)
        {
            PostCodeToUse = existing.PostCode;
        }
        string StreetToUse = dto.Street ?? existing.Street ;
        int NumberToUse = dto.Number;
        if (dto.Number==null)
        {
            NumberToUse = existing.Number;
        }
        if (dto.Number==null)
        {
            NumberToUse = existing.Number;
        }
        string ExtraInfoToUse = dto.ExtraInfo ?? existing.ExtraInfo ;

        Adress updated = new Adress
        {
            Id = existing.Id,
            Country = CountryToUse,
            City = CityToUse,
            ExtraInfo = ExtraInfoToUse,
            Number = NumberToUse,
            PostCode = PostCodeToUse,
            Street = StreetToUse,
            UserId = existing.UserId
        };
        
        
        if (user == null)
        { 
            await _adressDao.UpdateAsync(updated);
        }
        else
        {
            user.Adress = updated;
            await _userDao.UpdateUser(user);
        }
       
         
    }

    public Task<Adress> GetById(int id)
    {
        return _adressDao.getById(id);
    }

    public void ValidateAddress(Adress adress)
    {
        if (string.IsNullOrEmpty(adress.City)) throw new Exception("City can not be empty!!!");
        if (string.IsNullOrEmpty(adress.Country)) throw new Exception("Country can not be empty!!!");
        if (string.IsNullOrEmpty(adress.Street)) throw new Exception("Street can not be empty!!!");
        if (adress.Id <= 0) throw new Exception("Id must be > 0!!!");
        if (adress.Number <= 0) throw new Exception("Number must be > 0!!!");
        if (adress.PostCode <= 0) throw new Exception("Post code must be > 0!!!");
        if (adress.UserId <= 0) throw new Exception("User id must be > 0!!!");
    }

    public void ValidateById(int id)
    {
        if (id <= 0) throw new Exception("Id must be > 0!!!");
    }
}