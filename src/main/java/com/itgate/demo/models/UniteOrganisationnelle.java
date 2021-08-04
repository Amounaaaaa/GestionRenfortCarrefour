package com.itgate.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class UniteOrganisationnelle {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String code;
    // //// ceci est une relation:
    private String  h1;              //(Utilisateur) *
    //    //// ceci est une relation:
    private String  h2;            // (Utilisateur) *

    @ManyToOne
   private Etablisement etablisement;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getH1() {
        return h1;
    }

    public void setH1(String h1) {
        this.h1 = h1;
    }

    public String getH2() {
        return h2;
    }

    public void setH2(String h2) {
        this.h2 = h2;
    }

    @JsonIgnore
    public Etablisement getEtablisement() {
        return etablisement;
    }

    public void setEtablisement(Etablisement etablisement) {
        this.etablisement = etablisement;
    }


//// Ceci est une relation:
    //@OneToMany()              //mappedBy = "unite_org")
    // private List<Etablissement> etablissements;



  /*  @JsonIgnore
    public List<Etablissement> getEtablissements() {
        return etablissements;
    }*/



    //(sélection obligatoire) *


}
