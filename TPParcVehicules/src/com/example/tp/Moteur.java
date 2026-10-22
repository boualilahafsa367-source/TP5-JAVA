
package com.example.tp;

// Classe Moteur : représente le moteur d'un véhicule.
public class Moteur {

    // Type du moteur (ex. : essence, diesel, électrique).
    private String type;

    // Puissance du moteur exprimée en chevaux.
    private int puissance; // chevaux

    // Constructeur : initialise le type et la puissance du moteur.
    public Moteur(String type, int puissance) {
        this.type = type;
        this.puissance = puissance;
    }

    // Redéfinit toString() pour obtenir une représentation textuelle du moteur.
    @Override
    public String toString() {
        // Retourne le type du moteur suivi de sa puissance en chevaux.
        return type + " " + puissance + "ch";
    }
}

