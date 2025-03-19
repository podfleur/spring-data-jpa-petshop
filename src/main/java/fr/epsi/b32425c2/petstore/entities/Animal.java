package fr.epsi.b32425c2.petstore.entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "animal_type")
public abstract class Animal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String birth;
    private String couleur;

    @ManyToOne
    private PetStore petStore;
}