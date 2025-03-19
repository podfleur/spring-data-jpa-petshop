# PetStore - Spring Data JPA - Claire Nguyen

## Description
Ce projet utilise Spring Data JPA pour modéliser une animalerie avec des entités et des relations entre elles (héritage, associations, etc.). Le but du projet est de mettre en place une application qui manipule des entités JPA dans un contexte multi-couches, tout en respectant les bonnes pratiques de modélisation de base de données.

Les entités sont mappées à des tables de base de données via JPA, et les données peuvent être manipulées grâce aux Repositories. Ce projet montre également l'utilisation de l'annotation `@Inheritance` pour gérer l'héritage entre différentes sortes d'animaux.

## Structure du projet
Le projet est divisé en plusieurs couches afin de respecter l'architecture "multi-couches" :
- **Modèle (Entities)** : Les entités JPA qui définissent la structure de la base de données.
- **Repository** : Les interfaces de type `JpaRepository` pour manipuler les entités en base.
