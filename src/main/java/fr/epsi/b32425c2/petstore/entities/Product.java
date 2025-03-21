package fr.epsi.b32425c2.petstore.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String label;

    @Enumerated(EnumType.STRING)
    private ProdType type;

    private double price;

    @ManyToMany(mappedBy = "products")
    private List<PetStore> petStores;

    public Product() {}

    public Product(String code, String label, ProdType type, double price) {
        this.code = code;
        this.label = label;
        this.type = type;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public ProdType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public List<PetStore> getPetStores() {
        return petStores;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setType(ProdType type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPetStores(List<PetStore> petStores) {
        this.petStores = petStores;
    }

    @Override
    public String toString() {
        return "Product : " +
                "[id - " + id +
                ", code - '" + code + '\'' +
                ", label - '" + label + '\'' +
                ", type - " + type +
                ", price - " + price +
                ']';
    }
}
