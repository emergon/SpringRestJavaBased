package com.emergon.controller;

import com.emergon.entities.Salesman;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salesman")
public class SalesmanController {
    
    @Autowired
    SessionFactory sessionFactory;
    
    @GetMapping
    public ResponseEntity<List<Salesman>> list(){
        Session s = sessionFactory.openSession();
        List<Salesman> list = s.createQuery("SELECT s FROM Salesman s").getResultList();
        //List<Salesman> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
