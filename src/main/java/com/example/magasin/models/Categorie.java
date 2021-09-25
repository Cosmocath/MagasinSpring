package com.example.magasin.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "categorie")
@Data
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;
}
