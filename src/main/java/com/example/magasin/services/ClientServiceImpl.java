package com.example.magasin.services;

import com.example.magasin.models.Client;
import com.example.magasin.repositories.ClientRepository;

import java.util.List;
import java.util.Optional;

public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public List<Client> trouverTousLesClients() {
        return this.clientRepository.findAll();
    }

    @Override
    public Optional<Client> trouverClientParId(Long aLong) {
        return this.clientRepository.findById(aLong);
    }

    @Override
    public void supprimerClientParId(Long aLong) {
        this.clientRepository.deleteById(aLong);

    }

    @Override
    public Client creer(Client client) {
        return this.clientRepository.save(client);
    }
}
