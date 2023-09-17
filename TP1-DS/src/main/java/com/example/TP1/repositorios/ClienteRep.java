package com.example.TP1.repositorios;

import com.example.TP1.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRep extends JpaRepository<Cliente,Long> {
}
