package com.example.magasin.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "commande")
@Data
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="commande_has_produit",
            joinColumns = @JoinColumn(name="commande_id"),
            inverseJoinColumns = @JoinColumn(name="produit_id")
    )
    private Set<Produit> produits;
}
