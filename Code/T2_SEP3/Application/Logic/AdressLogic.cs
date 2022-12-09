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
       return _adressDao.getUserAdresses();
    }

    public Task<IEnumerable<Adress>> getNonUserAdresses()
    {
        return _adressDao.getNonUserAdresses();
    }

    public Task<Adress> getByUserId(int id)
    {
        User user = _userDao.GetById(id).Result;
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

      
        if (user.Adress==null)
        {
            user.Adress = new Adress
            {
                Id = -1,
                Country = "",
                City = "",
                Number = 0,
                PostCode = 0,
                Street = "",
                UserId = user.Id
            };
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
        
            user.Adress = updated;
            await _userDao.UpdateUser(user);
    }

    public Task<Adress> GetById(int id)
    {
        return _adressDao.getById(id);
    }
}