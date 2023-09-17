package com.example.TP1.repositorios;

import com.example.TP1.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRep extends JpaRepository<Producto,Long> {
}
