# PetStore - Spring Data JPA - Claire Nguyen

## **Description**
Ce projet est une application **Spring Boot** utilisant **Spring Data JPA** et **Hibernate** pour modéliser une animalerie.  
L'objectif est de manipuler des entités JPA avec des relations complexes (**OneToMany, ManyToOne, OneToOne**) et une gestion de l'héritage en **JOINED Table**.  

L'application permet :  
- L'insertion de données dans une base de données **petstore**.
- La récupération des **produits en fonction d’un code produit**.
- La récupération des **animaux d’une animalerie donnée**.
  
## **Structure du projet**
Le projet est divisé en plusieurs couches afin de respecter l'architecture "multi-couches" :
- **Modèle (Entities)** : Les entités JPA qui définissent la structure de la base de données.
- **Repository** : Les interfaces de type `JpaRepository` pour manipuler les entités en base.

## **Modèle de données**
![image](https://github.com/user-attachments/assets/fa8b14fd-2cc5-4ebc-9c77-e7cebf5de83b)

## **Installation et configuration**

### **1. Cloner le projet**
```sh
git clone https://github.com/podfleur/spring-data-jpa-petstore.git
cd spring-data-jpa-petstore
```

### **2. Configurer la base de données**
```sh
spring.application.name=petstore
# Datasource
spring.datasource.url=jdbc:mariadb(or mysql)://localhost:{your_port}(usually 3306)/petstore
spring.datasource.username={username}
spring.datasource.password={password}
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
# Hibernate & JPA settings
spring.jpa.properties.hibernate.transaction.coordinator_class=jdbc
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## **Technologies utilisées**
- **Java 17+**
- **Spring Boot 3**
- **Spring Data JPA**
- **Hibernate**
- **MySQL** (ou H2 pour le développement)
- **Maven**
