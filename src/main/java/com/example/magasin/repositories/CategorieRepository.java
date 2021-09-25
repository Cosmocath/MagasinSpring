package com.example.magasin.repositories;

import com.example.magasin.models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
