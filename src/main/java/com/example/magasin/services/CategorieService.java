package com.example.magasin.services;

import com.example.magasin.models.Categorie;

import java.util.List;

public interface CategorieService {

    public List<Categorie> findAll();
    public Categorie create(Categorie categorie);
    public Categorie getOneById(Long aLong);
    public void deleteCat(Long along);



}
