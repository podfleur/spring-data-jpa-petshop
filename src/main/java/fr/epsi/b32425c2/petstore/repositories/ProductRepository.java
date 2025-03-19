package fr.epsi.b32425c2.petstore.repositories;

import fr.epsi.b32425c2.petstore.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCode(String code);
}
