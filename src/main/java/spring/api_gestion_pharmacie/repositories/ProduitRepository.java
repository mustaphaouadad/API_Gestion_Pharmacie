package spring.api_gestion_pharmacie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api_gestion_pharmacie.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
