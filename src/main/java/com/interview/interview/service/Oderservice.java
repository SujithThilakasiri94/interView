package com.interview.interview.service;

import com.interview.interview.entity.Customer;
import com.interview.interview.entity.Oder;
import com.interview.interview.repo.OderRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class Oderservice {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private OderRepo oderRepo;

    public Oder saveOder(Oder order){
        return oderRepo.save(order);
    }
    public Oder getOderById(int id){
        return  oderRepo.findById(id).orElse(null);
    }

    public Oder updateOder(Oder oder){
        Oder existingOder = oderRepo.findById(oder.getId()).orElse(null);
        existingOder.setProduct_name(oder.getProduct_name());
        existingOder.setProduct_price(oder.getProduct_price());
        existingOder.setProduct_quantity(oder.getProduct_quantity());
        existingOder.setTotal_amount(oder.getTotal_amount());

        return oderRepo.save(existingOder);
    }

}
