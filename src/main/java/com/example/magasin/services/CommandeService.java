package com.example.magasin.services;

import com.example.magasin.models.Client;
import com.example.magasin.models.Commande;

import java.util.List;
import java.util.Optional;

public interface CommandeService {
    public List<Commande> trouverToutesLesCommandes();
    public Optional<Commande> trouverCommandeParId(Long aLong);

    public void supprimerCommandeParId(Long aLong);
    public Commande creer(Commande commande);
}
