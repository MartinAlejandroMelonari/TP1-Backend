package com.example.TP1.repositorios;

import com.example.TP1.entidades.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubrosRep extends JpaRepository<Rubro,Long> {
}
