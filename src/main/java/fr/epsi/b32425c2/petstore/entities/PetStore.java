package fr.epsi.b32425c2.petstore.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class PetStore {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String managerName;

    @OneToMany(mappedBy = "petStore")
    private List<Product> products;

    @OneToMany(mappedBy = "petStore")
    private List<Animal> animals;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
