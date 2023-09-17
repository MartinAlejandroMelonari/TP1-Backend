package com.example.TP1.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "factura")
public class Factura implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numero;

    @Column(name = "fecha")
    private LocalDate fecha;
    @Column(name = "descuento")
    private double descuento;
    @Column(name = "forma_de_pago")
    private String formaPago;
    @Column(name = "total")
    private int total;
}
