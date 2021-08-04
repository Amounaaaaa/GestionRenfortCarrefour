package com.itgate.demo.dao;

import com.itgate.demo.models.Etablisement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtablisementRepository extends JpaRepository<Etablisement,Long> {
}
