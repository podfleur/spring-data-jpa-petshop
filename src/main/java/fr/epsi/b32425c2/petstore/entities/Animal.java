package fr.epsi.b32425c2.petstore.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "animal_type")
public abstract class Animal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date birth;
    private String couleur;

    @ManyToOne
    private PetStore petStore;

    public Animal() {}

    public Animal(Date birth, String couleur, PetStore petStore) {
        this.birth = birth;
        this.couleur = couleur;
        this.petStore = petStore;
    }

    public Long getId() {
        return id;
    }

    public Date getBirth() {
        return birth;
    }

    public String getCouleur() {
        return couleur;
    }

    public PetStore getPetStore() {
        return petStore;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }

    @Override
    public String toString() {
        return "Animal : " +
                "[id - " + id +
                ", birth - '" + birth + '\'' +
                ", couleur - '" + couleur + '\'' +
                ']';
    }
}