package com.example.TP1.repositorios;

import com.example.TP1.entidades.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleRep extends JpaRepository<DetallePedido,Long> {
}
