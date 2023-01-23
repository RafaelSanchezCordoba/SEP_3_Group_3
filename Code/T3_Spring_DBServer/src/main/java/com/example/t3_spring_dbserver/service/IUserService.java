package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.Customer;
import com.example.t3_spring_dbserver.entity.ShippingInf;

public interface IUserService {

    Customer RegisterUser(String email, String password);
    Customer Login(String email, String password);
    Customer GetUserById(long id);
    Customer GetUserByEmail(String email);
    Customer UpdateUser(Customer user);

    ShippingInf GetAddressByUserId(int id);
}
