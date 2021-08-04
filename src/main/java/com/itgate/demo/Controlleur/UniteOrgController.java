package com.itgate.demo.Controlleur;

import com.itgate.demo.dao.EtablisementRepository;
import com.itgate.demo.dao.Unite_OrgRepository;
import com.itgate.demo.models.Etablisement;
import com.itgate.demo.models.UniteOrganisationnelle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/users/uniteOrg")
public class UniteOrgController {

@Autowired
    EtablisementRepository     etablisementRepository;
@Autowired
    Unite_OrgRepository        unite_orgRepository;

    @PostMapping("/add/{id_etablis}")
    public UniteOrganisationnelle addUOrg(@RequestBody UniteOrganisationnelle uniteOrganisationnelle, @PathVariable Long id_etablis) {
        // souscategorie.setCategorie(categorieRepository.getOne(idc));
        uniteOrganisationnelle.setEtablisement(etablisementRepository.getOne(id_etablis));
        return unite_orgRepository.save(uniteOrganisationnelle);
    }
        @GetMapping("/all")
        public List<UniteOrganisationnelle> GetAllUniteOrg(){
            return  unite_orgRepository.findAll();

        }
}
