package com.example.TP1.repositorios;

import com.example.TP1.entidades.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRep extends JpaRepository<Factura,Long> {
}
