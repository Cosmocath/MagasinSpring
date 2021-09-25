package com.example.magasin.controllers;

import com.example.magasin.models.Commande;
import com.example.magasin.services.CommandeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("commandes")
public class CommandeController {

    private CommandeService commandeService;

    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @GetMapping("")
    public List<Commande> trouverToutesLesCommandes() {
        return commandeService.trouverToutesLesCommandes();
    }

    @GetMapping("{id}")
    public Optional<Commande> trouverCommandeParId(@PathVariable Long aLong) {
        return commandeService.trouverCommandeParId(aLong);
    }

    @DeleteMapping("{id}")
    public void supprimerCommandeParId(Long aLong) {
        commandeService.supprimerCommandeParId(aLong);
    }

    @PostMapping("")
    @PutMapping("")
    public Commande creer(@RequestBody Commande commande) {
        return commandeService.creer(commande);
    }
}
