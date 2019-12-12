package com.emergon.controller;

import com.emergon.entities.Salesman;
import com.emergon.service.SalesmanService;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salesman")
public class SalesmanController {
    
    @Autowired
    SalesmanService service;
    
    @GetMapping
    public ResponseEntity<List<Salesman>> list(){
        List<Salesman> list = service.getSalesmen();
        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Salesman> get(@PathVariable("id") int id){
        Salesman s = service.getSalesmanById(id);
        return ResponseEntity.ok().body(s);
    }
    
    @GetMapping("/city/{city}")
    public ResponseEntity<List<Salesman>> getSalesmanByCity(
            @PathVariable("city") String city){
        List<Salesman> list = service.getSalesmenByCity(city);
        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping("/comm/{min}/and/{max:.+}")
    public ResponseEntity<List<Salesman>> getSalesmanBetweenComm(
            @PathVariable("min") double min,
            @PathVariable("max") double max){
        System.out.println("min="+min);
        System.out.println("max="+max);
        List<Salesman> list = service.getSalesmenBetweenComm(min, max);
        return ResponseEntity.ok().body(list);
    }
    
    
}
