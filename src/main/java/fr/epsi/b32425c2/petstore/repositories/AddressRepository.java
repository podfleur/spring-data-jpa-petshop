package fr.epsi.b32425c2.petstore.repositories;

import fr.epsi.b32425c2.petstore.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}