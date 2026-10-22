
package com.example.tp;

// Classe Reptile qui hérite de la classe Animal.
public class Reptile extends Animal {

    // Type d'écailles du reptile.
    private String typeEcailles;

    // Constructeur : initialise le nom, l'âge et le type d'écailles du reptile.
    public Reptile(String nom, int age, String typeEcailles) {
        // Appelle le constructeur de la classe mère Animal.
        super(nom, age);
        this.typeEcailles = typeEcailles;
    }

    // Affiche un message indiquant que le reptile se chauffe au soleil.
    public void seChauffer() {
        System.out.println(nom + " se chauffe au soleil.");
    }

    // Redéfinit toString() pour ajouter les informations spécifiques au reptile.
    @Override
    public String toString() {
        // Réutilise les informations de Animal et ajoute le type d'écailles.
        return super.toString() +
               " {Reptile, écailles=" + typeEcailles + "}";
    }
}

