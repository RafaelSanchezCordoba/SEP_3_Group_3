package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.Customer;
import com.example.t3_spring_dbserver.entity.ProductCard;
import com.example.t3_spring_dbserver.entity.ShippingInf;
import com.example.t3_spring_dbserver.repository.IUserRepository;
import com.protoBuff.AddressComunicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository repo;

    @Override
    public Customer RegisterUser(String email, String password) {
        Customer user=new Customer(email,password);
        user.setAuth("Customer");
        return repo.save(user);
    }

    @Override
    public Customer Login(String email, String password){

        return GetUserByEmail(email);
        }


    @Override
    public Customer GetUserById(long id) {
        Optional<Customer> user = repo.findById(id);
        return user.get();
    }

    @Override
    public Customer GetUserByEmail(String email) {
        Customer user = repo.getByEmail(email);
        return user;
    }

    @Override
    public Customer UpdateUser(Customer user) {
        Optional<Customer> customerToUpdate = repo.findById(user.getId());
        customerToUpdate.get().setEmail(user.getEmail());
        customerToUpdate.get().setName(user.getName());
        customerToUpdate.get().setPhone(user.getPhone());
        customerToUpdate.get().setPassword(user.getPassword());

        repo.save(customerToUpdate.get());
        return repo.getReferenceById(user.getId());
    }

    @Override
    public ShippingInf GetAddressByUserId(int id) {
       // Optional<ShippingInf> address = Optional.ofNullable(repo.getAddressByUserId(id));
      //  return address.get();
        return null;
    }

   }
