package com.software.produtos.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "codigo")
    private Long codigo;

    @Column(name = "quantidade")
    private Long quantidade;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "validade")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate validade;
}
