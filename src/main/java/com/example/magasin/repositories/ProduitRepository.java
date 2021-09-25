package com.example.magasin.repositories;

import com.example.magasin.models.Commande;
import com.example.magasin.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository <Produit, Long> {
}
