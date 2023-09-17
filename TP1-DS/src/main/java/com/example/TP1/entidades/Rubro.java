package com.example.TP1.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Rubro")
public class Rubro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "denominacion")
    private String denominacion;

    @OneToMany(cascade = CascadeType.REFRESH, orphanRemoval = true)
    @JoinColumn(name = "rubro_id")
    @Builder.Default
    private List<Producto> productos = new ArrayList<Producto>();

}
