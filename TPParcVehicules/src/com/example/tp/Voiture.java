
package com.example.tp;

// Classe Voiture qui hérite de la classe Motorise.
public class Voiture extends Motorise {

    // Nombre de portes de la voiture.
    private int nbPortes;

    // Constructeur : initialise le modèle, le moteur, le carburant et le nombre de portes.
    public Voiture(String modele, Moteur moteur, double carburant, int nbPortes) {
        // Appelle le constructeur de la classe mère Motorise.
        super(modele, moteur, carburant);
        this.nbPortes = nbPortes;
    }

    // Affiche un message indiquant que la voiture klaxonne.
    public void klaxonner() {
        System.out.println(modele + " klaxonne : « Pouet ! »");
    }

    // Redéfinit toString() pour ajouter les informations spécifiques à la voiture.
    @Override
    public String toString() {
        // Réutilise les informations de Motorise et ajoute le nombre de portes.
        return super.toString() 
            + " {Voiture, portes=" + nbPortes + "}";
    }
}

