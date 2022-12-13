using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;
namespace Application.Logic;

public class AddressLogic:IAddressLogic
{
    private readonly IUserDao _userDao;
    private readonly IAddressDao addressDao;
    
    public AddressLogic(IUserDao userDao,IAddressDao addressDao)
    {
        _userDao = userDao;
        this.addressDao = addressDao;
    }

    public  Task<Address> CreateAsync(Address address)
    {
         ValidateAddress(address);
         
         if (!_userDao.UserExists(address.UserId).Result)
         {
             address.UserId = -1;
             addressDao.Create(address);
             return Task.FromResult(address);
         }
        
         User user = _userDao.GetById(address.UserId).Result;
         address.Id = -1;
         user.Address = address;
         _userDao.UpdateUser(user);
             Address result = address;

             return Task.FromResult(result);
         
    }

    public Task<IEnumerable<Address>> GetUserAddresses()
    {
       return addressDao.GetUserAddresses() ?? throw new Exception($"Addresses were not found");
    }

    public Task<IEnumerable<Address>> GetNonUserAddresses()
    {
        return addressDao.GetNonUserAddresses() ?? throw new Exception($"Addresses were not found");
    }

    public Task<Address> GetByUserId(int id)
    {
        ValidateById(id);
        User user = _userDao.GetById(id).Result ?? throw new Exception($"User with ID {id} was not found");
        Address result = user.Address;
        return Task.FromResult(result);
    }

    public async Task UpdateAsync(UpdateAdressDto dto)
    {
        User user = await _userDao.GetById(dto.OwnerId);
        if (user == null)
        {
            throw new Exception($"User with ID {dto.OwnerId} not found!!!");
        }

      
        if (user.Address==null)
        {
            user.Address = new Address
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
        
        Address? existing = user.Address;
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

        Address updated = new Address
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
        
            user.Address = updated;
            await _userDao.UpdateUser(user);
    }

    public Task<Address> GetById(int id)
    {
        return addressDao.GetById(id);
    }

    public void ValidateAddress(Address address)
    {
        if (string.IsNullOrEmpty(address.City)) throw new Exception("City can not be empty!!!");
        if (string.IsNullOrEmpty(address.Country)) throw new Exception("Country can not be empty!!!");
        if (string.IsNullOrEmpty(address.Street)) throw new Exception("Street can not be empty!!!");
        if (address.Id <= 0) throw new Exception("Id must be > 0!!!");
        if (address.Number <= 0) throw new Exception("Number must be > 0!!!");
        if (address.PostCode <= 0) throw new Exception("Post code must be > 0!!!");
        if (address.UserId <= 0) throw new Exception("User id must be > 0!!!");
    }

    public void ValidateById(int id)
    {
        if (id <= 0) throw new Exception("Id must be > 0!!!");
    }
}