package com.devsuperior.dsmeta.controllers;


import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SalesServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "sales")
public class SaleController {

    private SalesServices sS;

    @GetMapping
    public List<Sale> findAll(){

        return sS.findAll();
    }

}
