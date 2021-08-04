package com.itgate.demo.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.itgate.demo.models.UniteOrganisationnelle;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Demande  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String reference;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date_creation ;
    private String demandeur;       // responsable magasin !
    private String societe;        // relation !! Depuis la table ht access !interfaçage avec la base oracle des  données personnel
    private String etablissement; // relation !! / Automatique pour individuel (Récupérée depuis table HR Access) && Sélection de liste pour profils Groupe et RH
    //relation avec post ????????
    private String poste;
    private String effectifdemande;
    private String profil;
    private String sexe;
    private String natureDedemande;
    private String motif;
    private String observationMotif;
    private String natureDeMission;
    private String regimeHoraire; //48H
    private String DebutDeLaMission;
    private String FinDeLaMission;
    private String personneAcontacter;
    private String heureDebut;
    //private String Status;
    private String avis_hierarchie; //Accord ou nn
    private String etat; /// En cours, Acceptée (H1)

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }


/*Refusée (H1)
     Validée (RH)
     Rejetée
     Attente avis H2
     Attente validation RH
     Annulée
     Non satisfaite
     Clôturée*/
    // relation ????
    /*
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
    */

//    @OneToOne (cascade = CascadeType.ALL)
//    @JoinColumn(name = "demande_id",referencedColumnName = "id")
//    private UniteOrganisationnelle uniteorganisationnelle;





}
