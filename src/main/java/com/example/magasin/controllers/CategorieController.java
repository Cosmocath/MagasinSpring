package com.example.magasin.controllers;

import com.example.magasin.models.Categorie;
import com.example.magasin.services.CategorieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("categories")
public class CategorieController {

    private CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }
    @GetMapping("")
    public List<Categorie> findAll() {
        return categorieService.findAll();
    }

    @PostMapping("")
    public Categorie create(@RequestBody Categorie categorie) {
        return categorieService.create(categorie);
    }
    @GetMapping("{id}")
    public Categorie getOneById(@PathVariable Long aLong) {
        return categorieService.getOneById(aLong);
    }

    @GetMapping("delete/{id}")
    public void deleteCat(@PathVariable Long along) {
        categorieService.deleteCat(along);
    }

}
