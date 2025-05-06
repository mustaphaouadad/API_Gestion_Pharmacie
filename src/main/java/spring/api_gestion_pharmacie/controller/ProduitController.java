package spring.api_gestion_pharmacie.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.api_gestion_pharmacie.entities.Produit;
import spring.api_gestion_pharmacie.repositories.ProduitRepository;

@RestController
public class ProduitController {
  private final ProduitRepository produitRepository;

    public ProduitController(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @PostMapping("/produit")
    public Produit saveProduit(@RequestBody Produit produit) {
        return produitRepository.save(produit);
    }
}
