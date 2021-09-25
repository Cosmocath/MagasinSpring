package com.example.magasin.services;

import com.example.magasin.models.Commande;
import com.example.magasin.repositories.CommandeRepository;

import java.util.List;
import java.util.Optional;

public class CommandeServiceImpl implements CommandeService{

    private CommandeRepository commandeRepository;

    public CommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
    public List<Commande> trouverToutesLesCommandes() {
        return this.commandeRepository.findAll();
    }

    @Override
    public Optional<Commande> trouverCommandeParId(Long aLong) {
        return this.commandeRepository.findById(aLong);
    }

    @Override
    public void supprimerCommandeParId(Long aLong) {
        this.commandeRepository.deleteById(aLong);

    }

    @Override
    public Commande creer(Commande commande) {
        return this.commandeRepository.save(commande);
    }
}
