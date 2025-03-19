package fr.epsi.b32425c2.petstore.entities;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Fish")
public class Fish extends Animal {
    @Enumerated(EnumType.STRING)
    private FishLivEnv livingEnv;
}