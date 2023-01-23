package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.ShippingInf;

import java.util.List;

public interface IAddressService {

    ShippingInf GetAddressById(int id);
    ShippingInf CreateAddress(ShippingInf address);
    List<ShippingInf> GetAllAddresses();
    ShippingInf UpdateAddress(ShippingInf address);

}
