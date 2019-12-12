package com.emergon.service;

import com.emergon.dao.SalesmanDao;
import com.emergon.entities.Salesman;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class SalesmanServiceImpl implements SalesmanService{
    
    @Autowired
    SalesmanDao sdao;
    
    @Override
    public List<Salesman> getSalesmen() {
        List<Salesman> list = sdao.findAll();
        return list;
    }

    @Override
    public Salesman getSalesmanById(int id) {
        Salesman s = sdao.findById(id);
        return s;
    }

    @Override
    public List<Salesman> getSalesmenByCity(String city) {
        List<Salesman> list = sdao.findByCity(city);
        return list;
    }

    @Override
    public List<Salesman> getSalesmenBetweenComm(double min, double max) {
        List<Salesman> list = sdao.findBetweenComm(min, max);
        return list;
    }

    @Override
    public String deleteSalesman(int id) {
        int number = sdao.delete(id);
        if(number>0){
            return "Salesman deleted successfully";
        }else{
            return "Salesman not deleted";
        }
        
    }

    @Override
    public void createSalesman(Salesman s) {
        sdao.create(s);
    }

    
}
