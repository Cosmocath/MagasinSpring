package com.example.magasin.services;

import com.example.magasin.models.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    public List<Client> trouverTousLesClients();
    public Optional<Client> trouverClientParId(Long aLong);

    public void supprimerClientParId(Long aLong);
    public Client creer(Client client);
}
