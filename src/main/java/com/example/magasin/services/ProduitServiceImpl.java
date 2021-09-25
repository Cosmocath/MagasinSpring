package com.example.magasin.services;

import com.example.magasin.models.Produit;
import com.example.magasin.repositories.ProduitRepository;

import java.util.List;
import java.util.Optional;

public class ProduitServiceImpl implements ProduitService{

    private ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public List<Produit> trouverTouslesProduits() {
        return this.produitRepository.findAll();
    }

    @Override
    public Optional<Produit> trouverProduitParId(Long aLong) {
        return this.produitRepository.findById(aLong);
    }

    @Override
    public void supprimerProduitParId(Long aLong) {
        this.produitRepository.deleteById(aLong);

    }

    @Override
    public Produit creer(Produit produit) {
        return this.produitRepository.save(produit);
    }
}
