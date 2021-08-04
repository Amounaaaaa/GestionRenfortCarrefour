package com.itgate.demo.dao;

import com.itgate.demo.models.UniteOrganisationnelle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Unite_OrgRepository extends JpaRepository<UniteOrganisationnelle,Long> {
}
