package com.itgate.demo.dao;


import com.itgate.demo.models.Demande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemmandeRepository extends JpaRepository<Demande,Long> {
}

