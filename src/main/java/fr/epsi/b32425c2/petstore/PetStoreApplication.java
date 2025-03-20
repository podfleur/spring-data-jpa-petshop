package fr.epsi.b32425c2.petstore;

import fr.epsi.b32425c2.petstore.entities.*;
import fr.epsi.b32425c2.petstore.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class PetStoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(PetStoreApplication.class, args);
    }

    @Bean
    CommandLineRunner initData(PetStoreRepository petStoreRepo,
                               AddressRepository addressRepo,
                               ProductRepository productRepo,
                               AnimalRepository animalRepo) {
        return args -> {
            // Création des adresses
            Address address1 = new Address("10", "Rue des Animaux", "75001", "Paris");
            Address address2 = new Address("20", "Avenue des Bêtes", "69002", "Lyon");
            Address address3 = new Address("30", "Boulevard Sauvage", "13003", "Marseille");
            addressRepo.saveAll(List.of(address1, address2, address3));

            // Création des animaleries
            PetStore store1 = new PetStore("Animalia", "Alice", address1);
            PetStore store2 = new PetStore("ZooMarket", "Bob", address2);
            PetStore store3 = new PetStore("PetLand", "Charlie", address3);
            petStoreRepo.saveAll(List.of(store1, store2, store3));

            // Création des produits
            Product prod1 = new Product("P001", "Croquettes", ProdType.FOOD, 10.99, store1);
            Product prod2 = new Product("P002", "Laisse", ProdType.ACCESSORY, 15.50, store2);
            Product prod3 = new Product("P003", "Shampooing", ProdType.CLEANING, 8.99, store3);
            Product prod4 = new Product("P001", "Croquettes Premium", ProdType.FOOD, 20.99, store1);
            productRepo.saveAll(List.of(prod1, prod2, prod3, prod4));

            // Création des animaux
            SimpleDateFormat date1ToFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = date1ToFormat.parse("2023-01-10");

            SimpleDateFormat date2ToFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date2 = date2ToFormat.parse("2023-01-20");

            SimpleDateFormat date3ToFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date3 = date3ToFormat.parse("2021-08-20");

            SimpleDateFormat date4ToFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date4 = date4ToFormat.parse("2020-11-12");

            Fish fish1 = new Fish(date1, "Rouge", store1, FishLivEnv.FRESH_WATER);
            Fish fish2 = new Fish(date2, "Bleu", store2, FishLivEnv.SEA_WATER);
            Cat cat1 = new Cat(date3, "Noir", store3, "CHIP123");
            Cat cat2 = new Cat(date4, "Blanc", store1, "CHIP456");
            animalRepo.saveAll(List.of(fish1, fish2, cat1, cat2));

            // Affichage des données en base
            System.out.println("----- Liste des produits avec code P001 -----");
            List<Product> productsByCode = productRepo.findProductsByCode("P001");
            productsByCode.forEach(System.out::println);

            System.out.println("----- Liste des animaux de l'animalerie 1 -----");
            List<Animal> animalsByStore = animalRepo.findAnimalsByPetStore(store1.getId());
            animalsByStore.forEach(System.out::println);
        };
    }
}