package com.itgate.demo.Controlleur;

import com.itgate.demo.dao.EtablisementRepository;
import com.itgate.demo.dao.SocieteRepository;
import com.itgate.demo.models.Etablisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/users/etablisements")
public class EtablisementController {


    @Autowired
    EtablisementRepository   etablisementRepository;
    @Autowired
    SocieteRepository        societeRepository;

    @PostMapping("/add/{code_societe}")
    public Etablisement AddEtablisement(@RequestBody Etablisement etab, @PathVariable String code_societe) {

        etab.setSociete(societeRepository.findByCode_societe(code_societe));
        return etablisementRepository.save(etab);


    }
    @GetMapping("/all")
    public List<Etablisement> GetAllEtablisement(){
        return  etablisementRepository.findAll();

    }




}
