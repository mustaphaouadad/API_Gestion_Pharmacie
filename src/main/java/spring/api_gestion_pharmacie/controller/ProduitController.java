package spring.api_gestion_pharmacie.controller;

import org.springframework.web.bind.annotation.*;
import spring.api_gestion_pharmacie.entities.Produit;
import spring.api_gestion_pharmacie.repositories.ProduitRepository;

import java.util.List;

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
    @GetMapping("/produit")
    public List<Produit> getProduit() {
        return produitRepository.findAll();
    }

    @DeleteMapping("/produit/{id}")
    public void deleteProduit(@PathVariable Long id) {
        produitRepository.deleteById(id);
    }
     @PutMapping("/produit")
    public Produit updateProduit(@RequestBody Produit produit ) {
      return produitRepository.save(produit);
    }
}
