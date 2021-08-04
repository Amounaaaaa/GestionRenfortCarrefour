package com.itgate.demo.Controlleur;

import com.itgate.demo.dao.SocieteRepository;
import com.itgate.demo.models.Societe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/users/societes")
public class SocieteController {



    @Autowired
    SocieteRepository societeRepository;
    @PostMapping("/add")
    public Societe addSociete(@RequestBody Societe  societe){
        return societeRepository.save(societe);
    }
    @GetMapping("/all")
    public List<Societe> getall(){
        return  societeRepository.findAll();

    }


}
