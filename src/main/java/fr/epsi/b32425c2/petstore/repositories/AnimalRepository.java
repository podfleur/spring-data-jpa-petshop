package fr.epsi.b32425c2.petstore.repositories;

import fr.epsi.b32425c2.petstore.entities.Animal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    @Query("SELECT a FROM animal a WHERE a.petStore.id = :petStoreId")
    List<Animal> findAnimalsByPetStoreId(Long petStoreId);
}