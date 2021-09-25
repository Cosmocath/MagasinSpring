package com.example.magasin.controllers;

import com.example.magasin.models.Client;
import com.example.magasin.services.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("clients")
public class ClientController {

    private static Logger LOGGER = LoggerFactory.getLogger(ClientController.class);

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("")
    public List<Client> trouverTousLesClients() {
        return clientService.trouverTousLesClients();
    }

    @GetMapping("{id}")
    public Optional<Client> trouverClientParId(@PathVariable Long aLong) {
        return clientService.trouverClientParId(aLong);
    }

    @DeleteMapping("{id}")
    public void supprimerClientParId(@PathVariable Long aLong) {
        clientService.supprimerClientParId(aLong);
    }
    @PostMapping("")
    @PutMapping("")
    public Client creer(@RequestBody Client client) {
        return clientService.creer(client);
    }
}
