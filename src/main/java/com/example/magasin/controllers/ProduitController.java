package com.example.magasin.controllers;

import com.example.magasin.models.Produit;
import com.example.magasin.services.ProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("produits")
public class ProduitController {

    private ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }
    @GetMapping("")
    public List<Produit> trouverTouslesProduits() {
        return produitService.trouverTouslesProduits();
    }

    @GetMapping("{id}")
    public Optional<Produit> trouverProduitParId(@PathVariable Long aLong) {
        return produitService.trouverProduitParId(aLong);
    }

    @DeleteMapping("{id}")
    public void supprimerProduitParId(Long aLong) {
        produitService.supprimerProduitParId(aLong);
    }
    @PostMapping("")
    @PutMapping("")
    public Produit creer(@RequestBody Produit produit) {
        return produitService.creer(produit);
    }
}
