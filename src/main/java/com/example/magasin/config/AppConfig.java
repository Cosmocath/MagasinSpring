package com.example.magasin.config;

import com.example.magasin.models.Client;
import com.example.magasin.repositories.ClientRepository;
import com.example.magasin.repositories.CommandeRepository;
import com.example.magasin.repositories.ProduitRepository;
import com.example.magasin.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.yaml.snakeyaml.introspector.Property;

@Configuration
public class AppConfig {

    @Bean
    public ClientService clientService(ClientRepository repo) {
        return new ClientServiceImpl(repo);
    }

    @Bean
    public CommandeService commandeService(CommandeRepository repo) {
        return new CommandeServiceImpl(repo);
    }

    @Bean
    public ProduitService produitService(ProduitRepository repo) {
        return new ProduitServiceImpl(repo);
    }
}
