package com.example.tp;

// Classe principale contenant le point d'entrée du programme.
public class Main {

    // Méthode principale exécutée au lancement du programme.
    public static void main(String[] args) {

        // Crée un objet Zoo.
        Zoo monZoo = new Zoo();

        // Ajout de 6 animaux pour tester l’agrandissement
        // Le tableau initial contient 5 places : l'ajout du 6e animal déclenche son agrandissement.
        monZoo.ajouterAnimal(new Mammifere("Lion", 5, "Dorée"));
        monZoo.ajouterAnimal(new Oiseau("Aigle", 3, 2.3));
        monZoo.ajouterAnimal(new Reptile("Crocodile", 12, "Épaisse"));
        monZoo.ajouterAnimal(new Mammifere("Girafe", 7, "Tachetée"));
        monZoo.ajouterAnimal(new Oiseau("Perroquet", 2, 0.4));
        monZoo.ajouterAnimal(new Reptile("Serpent", 4, "Lisse"));

        // Affiche tous les animaux enregistrés dans le zoo.
        monZoo.afficherTous();

        // Affiche une ligne vide pour séparer les résultats.
        System.out.println();

        // Actions spécifiques
        // Crée un mammifère, stocké dans une variable de type Animal.
        Animal a1 = new Mammifere("Éléphant", 10, "Grise");

        // Ajoute l'éléphant au zoo.
        monZoo.ajouterAnimal(a1);

        // Convertit la référence Animal en Mammifere pour appeler la méthode allaiter().
        ((Mammifere)a1).allaiter();

        // Crée un oiseau, stocké dans une variable de type Animal.
        Animal a2 = new Oiseau("Autruche", 6, 1.8);

        // Ajoute l'autruche au zoo.
        monZoo.ajouterAnimal(a2);

        // Convertit la référence Animal en Oiseau pour appeler la méthode voler().
        ((Oiseau)a2).voler();
    }
}