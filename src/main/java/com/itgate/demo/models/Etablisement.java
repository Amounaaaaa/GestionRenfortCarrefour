package com.itgate.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Etablisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long   id;
    private String nom;
    private String perimetre;                 //Siège || Hyper || Sud
    private String code_etablisement;
//    @OneToMany(mappedBy = "etablisement")
//    private Collection<User> users;

    @ManyToOne
    @JoinColumn(name="code_societe")
    private Societe societe;

//    public Collection<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Collection<User> users) {
//        this.users = users;
//    }
@OneToMany(mappedBy="etablisement")
private Collection<UniteOrganisationnelle> uniteOrganisationnelles;


@JsonIgnore
    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    /*Code société*/
//
//    @ManyToOne
//    @JoinColumn(name="id_unite_org")
//    private UniteOrganisationnelle unite_org;
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

    public String getPerimetre() {
        return perimetre;
    }

    public void setPerimetre(String perimetre) {
        this.perimetre = perimetre;
    }

    public String getCode_etablisement() {
        return code_etablisement;
    }

    public void setCode_etablisement(String code_etablisement) {
        this.code_etablisement = code_etablisement;
    }

    public Etablisement() {
    }

    public Collection<UniteOrganisationnelle> getUniteOrganisationnelles() {
        return uniteOrganisationnelles;
    }

    public void setUniteOrganisationnelles(Collection<UniteOrganisationnelle> uniteOrganisationnelles) {
        this.uniteOrganisationnelles = uniteOrganisationnelles;
    }
}















