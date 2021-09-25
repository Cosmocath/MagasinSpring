package com.example.magasin.services;

import com.example.magasin.models.Categorie;
import com.example.magasin.repositories.CategorieRepository;

import java.util.List;

public class CategorieServiceImpl implements CategorieService {

    private CategorieRepository repo;

    public CategorieServiceImpl(CategorieRepository repo) {
        this.repo = repo;
    }


    @Override
    public List<Categorie> findAll() {
        return this.repo.findAll();
    }

    @Override
    public Categorie create(Categorie categorie) {
        return this.repo.save(categorie);
    }

    @Override
    public Categorie getOneById(Long aLong) {
        return this.repo.getById(aLong);
    }

    @Override
    public void deleteCat(Long along) {
        this.repo.deleteById(along);

    }

}
