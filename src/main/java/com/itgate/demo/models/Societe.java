package com.itgate.demo.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Societe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String code_societe;  //interfaçage avec la base oracle des  données personnel !
    private String nom;
    @OneToMany(mappedBy = "societe")
    private Collection<Etablisement> etablisements;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode_societe() {
        return code_societe;
    }

    public void setCode_societe(String code_societe) {
        this.code_societe = code_societe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Collection<Etablisement> getEtablisements() {
        return etablisements;
    }

    public void setEtablisements(Collection<Etablisement> etablisements) {
        this.etablisements = etablisements;
    }
}
