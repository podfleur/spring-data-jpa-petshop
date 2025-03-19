package fr.epsi.b32425c2.petstore.entities;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Cat")
public class Cat extends Animal {
    private String chipId;

    public Cat() {}

    public Cat(String birth, String couleur, PetStore petStore, String chipId) {
        super(birth, couleur, petStore);
        this.chipId = chipId;
    }

    public String getChipId() { return chipId; }

    public void setChipId(String chipId) { this.chipId = chipId; }

    @Override
    public String toString() {
        return "Cat : " +
                "[chipId - '" + chipId + '\'' +
                "] " + super.toString();
    }
}
