package com.emergon.dao;

import com.emergon.entities.Salesman;
import java.util.List;

public interface SalesmanDao {
    
    List<Salesman> findAll();

    public Salesman findById(int id);

    public List<Salesman> findByCity(String city);

    public List<Salesman> findBetweenComm(double min, double max);

    public int delete(int id);

    public int create(Salesman s);

    public void update(int id, Salesman s);

    
}
