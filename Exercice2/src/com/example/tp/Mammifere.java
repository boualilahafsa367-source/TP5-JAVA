
package com.example.tp;

// Classe Mammifere qui hérite de la classe Animal.
public class Mammifere extends Animal {

    // Couleur de la fourrure du mammifère.
    private String couleurFourrure;

    // Constructeur : initialise le nom, l'âge et la couleur de la fourrure.
    public Mammifere(String nom, int age, String couleurFourrure) {
        // Appelle le constructeur de la classe mère Animal.
        super(nom, age);
        this.couleurFourrure = couleurFourrure;
    }

    // Affiche un message indiquant que le mammifère allaite ses petits.
    public void allaiter() {
        System.out.println(nom + " allaite ses petits.");
    }

    // Redéfinit toString() pour ajouter les informations spécifiques au mammifère.
    @Override
    public String toString() {
        // Réutilise les informations de Animal, puis ajoute la couleur de la fourrure.
        return super.toString() +
               " {Mammifere, fourrure=" + couleurFourrure + "}";
    }
}

