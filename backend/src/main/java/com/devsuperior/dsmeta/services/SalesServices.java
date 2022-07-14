package com.devsuperior.dsmeta.services;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SalesRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

@Service
@AllArgsConstructor
public class SalesServices {

    private SalesRepository sR;


    public Page<Sale> findAll(String minDate, String maxDate, Pageable pageable) {

        LocalDate today= LocalDate.now();
        LocalDate min =minDate.equals("")?LocalDate.now().minusDays(365):LocalDate.parse(minDate);
        LocalDate max =maxDate.equals("")? LocalDate.now(): LocalDate.parse(maxDate);

        return sR.findSales(min,max,pageable);
    }
}
