package com.example.TP1.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "tipo")
    private String tipo;
    @Column(name = "tiempo_estimado_cocina")
    private int tiempoEstimadoCocina;
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "precio_venta")
    private double precioVenta;
    @Column(name = "precio_compra")
    private double precioCompra;
    @Column(name = "stock_actual")
    private int stockActual;
    @Column(name = "stock_minimo")
    private int stockMinimo;
    @Column(name = "unidad_medida")
    private String unidadMedida;
    @Column(name = "receta")
    private String receta;
}
