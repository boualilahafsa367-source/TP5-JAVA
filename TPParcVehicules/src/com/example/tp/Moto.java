
package com.example.tp;

// Classe Moto qui hérite de la classe Motorise.
public class Moto extends Motorise {

    // Cylindrée du moteur de la moto, exprimée en centimètres cubes.
    private double cylindree; // cm³

    // Constructeur : initialise le modèle, le moteur, le carburant et la cylindrée.
    public Moto(String modele, Moteur moteur, double carburant, double cylindree) {
        // Appelle le constructeur de la classe mère Motorise.
        super(modele, moteur, carburant);
        this.cylindree = cylindree;
    }

    // Affiche un message indiquant que la moto fait un wheelie.
    public void faireWheelie() {
        System.out.println(modele + " fait un wheelie !");
    }

    // Redéfinit toString() pour ajouter les informations spécifiques à la moto.
    @Override
    public String toString() {
        // Réutilise les informations de Motorise et ajoute la cylindrée de la moto.
        return super.toString() 
            + " {Moto, cylindrée=" + cylindree + " cm³}";
    }
}

