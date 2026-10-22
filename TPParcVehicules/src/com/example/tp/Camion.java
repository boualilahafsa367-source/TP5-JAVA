
package com.example.tp;

// Classe Camion qui hérite de la classe Motorise.
public class Camion extends Motorise {

    // Capacité maximale de charge du camion, exprimée en tonnes.
    private double capaciteCharge; // tonnes

    // Constructeur : initialise le modèle, le moteur, le carburant et la capacité de charge.
    public Camion(String modele, Moteur moteur, double carburant, double capaciteCharge) {
        // Appelle le constructeur de la classe mère Motorise.
        super(modele, moteur, carburant);
        this.capaciteCharge = capaciteCharge;
    }

    // Affiche les informations relatives au chargement du camion.
    public void charger(double poids) {
        // Affiche le poids à charger et la capacité maximale autorisée.
        System.out.println(modele + " charge " 
            + poids + " t (max " + capaciteCharge + " t)");
    }

    // Redéfinit toString() pour ajouter les informations spécifiques au camion.
    @Override
    public String toString() {
        // Réutilise les informations de Motorise et ajoute la capacité de charge.
        return super.toString() 
            + " {Camion, cap=" + capaciteCharge + " t}";
    }
}

