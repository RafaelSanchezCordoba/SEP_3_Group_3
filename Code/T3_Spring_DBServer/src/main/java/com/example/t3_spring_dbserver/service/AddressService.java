package com.example.t3_spring_dbserver.service;

import com.example.t3_spring_dbserver.entity.ShippingInf;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements IAddressService{
    @Override
    public ShippingInf GetAddressById(int id) {
        return null;
    }

    @Override
    public ShippingInf CreateAddress(ShippingInf address) {
        return null;
    }

    @Override
    public List<ShippingInf> GetAllAddresses() {
        return null;
    }

    @Override
    public ShippingInf UpdateAddress(ShippingInf address) {
        return null;
    }
}
