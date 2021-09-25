package com.example.magasin.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "produit")
@Data
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prix")
    private Integer prix;

    @ManyToOne
    @JoinColumn(name="categorie_id", referencedColumnName = "id")
    private Categorie categorie;
}
