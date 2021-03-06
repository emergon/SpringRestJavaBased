package com.emergon.service;

import com.emergon.entities.Salesman;
import java.util.List;

public interface SalesmanService {
    
    List<Salesman> getSalesmen();

    public Salesman getSalesmanById(int id);

    public List<Salesman> getSalesmenByCity(String city);

    public List<Salesman> getSalesmenBetweenComm(double min, double max);

    public String deleteSalesman(int id);

    public int createSalesman(Salesman s);

    public void updateSalesman(int id, Salesman s);

    
}
