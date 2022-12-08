using Application.DaoInterfaces;
using Application.LogicInterfaces;
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
             Task<User> stuff = _userDao.UpdateUser(user);
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
}