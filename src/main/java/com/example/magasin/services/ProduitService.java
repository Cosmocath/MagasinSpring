package com.example.magasin.services;

import com.example.magasin.models.Commande;
import com.example.magasin.models.Produit;

import java.util.List;
import java.util.Optional;

public interface ProduitService {

    public List<Produit> trouverTouslesProduits();
    public Optional<Produit> trouverProduitParId(Long aLong);

    public void supprimerProduitParId(Long aLong);
    public Produit creer(Produit produit);
}
