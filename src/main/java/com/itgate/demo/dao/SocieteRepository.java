package com.itgate.demo.dao;

import com.itgate.demo.models.Societe;
import com.itgate.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SocieteRepository extends JpaRepository<Societe,Long> {



    //Societe findByCodeSociete(String code_societe);
    /*@Query("{'username':?0}")*/
    @Query("select s from  Societe  s where s.code_societe= :code_societe")
    Societe findByCode_societe(@Param("code_societe") String code_societe);


}
