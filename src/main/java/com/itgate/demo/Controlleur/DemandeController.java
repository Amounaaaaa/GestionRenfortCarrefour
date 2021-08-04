package com.itgate.demo.Controlleur;

import com.itgate.demo.dao.DemmandeRepository;
import com.itgate.demo.models.Demande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/users/demands")
public class DemandeController {


    @Autowired
    private DemmandeRepository demmandeRepository;

    ///crud
    //getALl
    @PostMapping("/add")
    public Demande AddDemande(@RequestBody Demande demande) {
        demande.setDate_creation(new Date());
        return demmandeRepository.save(demande);
    }

    @GetMapping("/all")
    public List<Demande> GetAll() {
        return demmandeRepository.findAll();
    }

    @GetMapping ("/GetOne/{id}")
    public Demande getOneDemande(@PathVariable Long id){

        return demmandeRepository.findOne(id);
    }
        @PutMapping("/update")
    public Demande UpdateCommande(@RequestBody Demande demande) {
        return demmandeRepository.saveAndFlush(demande); //Ajout et modification
    }



    @DeleteMapping("/delete/{id}")
    public HashMap deleteDemande(@PathVariable Long id){

        HashMap<String, String> hashMap = new HashMap<>();
        try{
            demmandeRepository.delete(id);
            hashMap.put("state","Ok");
            return  hashMap;
        }catch(Exception e){
            hashMap.put("state","No");
            return hashMap;

        }
    }
    //

//    ///pathVariable
//    @GetMapping ("/one2/{id}")
//    public Optional<Demande> getOneCat2(@PathVariable Long id){
//        return demmandeRepository.findById(id);
//    }

//    @GetMapping ("/one3")
//    public Optional<Demande> getOneCat3(Long id){
//        return demmandeRepository.findById(id);
//    }


//    @PostMapping("/add")
//    public Demande AddCategorie(@RequestBody Demande categorie) {
//        return categorieRepository.save(categorie);
//    }
//

//
//    @DeleteMapping ("/delete/{id}")
//    public Response DeleteCategorie(@PathVariable  Long id){
//        Response res =new Response();
//        try {
//            categorieRepository.deleteById(id);
//            res.setState("ok");
//            return res;
//        }
//        catch (Exception e){
//            res.setState("fail");
//            return  res;
//        }
//    }
    ////

}
