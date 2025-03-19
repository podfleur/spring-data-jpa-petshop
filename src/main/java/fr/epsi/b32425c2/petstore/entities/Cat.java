package fr.epsi.b32425c2.petstore.entities;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Cat")
public class Cat extends Animal {
    private String chipId;
}
