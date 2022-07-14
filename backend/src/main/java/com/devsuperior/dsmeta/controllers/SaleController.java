package com.devsuperior.dsmeta.controllers;


import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SalesServices;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "sales")
public class SaleController {

    private SalesServices sS;

    @GetMapping
    public Page<Sale> findAll(
            @RequestParam(value = "minDate", defaultValue ="" ) String minDate,
             @RequestParam(value = "maxDate", defaultValue ="" ) String maxDate,
            Pageable pageable){
        System.out.println(LocalDate.now());
        return sS.findAll(minDate,maxDate,pageable);
    }

}
