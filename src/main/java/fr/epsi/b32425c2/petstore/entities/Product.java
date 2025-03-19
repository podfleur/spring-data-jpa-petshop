package fr.epsi.b32425c2.petstore.entities;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String label;

    @Enumerated(EnumType.STRING)
    private ProdType type;

    private double price;

    @ManyToOne
    private PetStore petStore;
}
