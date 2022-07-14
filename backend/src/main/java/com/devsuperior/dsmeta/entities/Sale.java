package com.devsuperior.dsmeta.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_sales")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String sellerName;
    private Integer visited;
    private Integer deals;
    private Double amount;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;


}
