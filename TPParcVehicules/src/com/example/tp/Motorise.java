
package com.example.tp;

// Classe Motorise qui hérite de la classe Vehicule.
public class Motorise extends Vehicule {

    // Objet Moteur associé au véhicule.
    protected Moteur moteur;

    // Quantité de carburant disponible, exprimée en litres ou en kWh.
    protected double niveauCarburant; // en litres ou kWh

    // Distance totale parcourue par le véhicule, initialisée à 0.
    protected double kmTotal = 0;

    // Constructeur : initialise le modèle, le moteur et le niveau initial de carburant.
    public Motorise(String modele, Moteur moteur, double carburantInitial) {
        // Appelle le constructeur de la classe mère Vehicule.
        super(modele);
        this.moteur = moteur;
        this.niveauCarburant = carburantInitial;
    }

    // Affiche les informations du véhicule au démarrage.
    public void demarrer() {
        System.out.println(toString() + " démarre avec " 
            + niveauCarburant + " unités et moteur " + moteur);
    }

    // Simule un trajet et met à jour le carburant disponible et la distance parcourue.
    public void rouler(double km) {
        // Calcule la consommation : 0,1 unité de carburant par kilomètre.
        double conso = km * 0.1; // 0.1 unité par km

        // Vérifie si le carburant disponible est suffisant pour effectuer le trajet.
        if (niveauCarburant >= conso) {
            // Diminue le niveau de carburant selon la consommation du trajet.
            niveauCarburant -= conso;

            // Ajoute la distance parcourue au total des kilomètres.
            kmTotal += km;

            // Affiche la distance parcourue et le carburant restant.
            System.out.println(modele + " a roulé " 
                + km + " km, reste " + niveauCarburant + " unités");
        } else {
            // Affiche un message si le carburant est insuffisant.
            System.out.println("Carburant insuffisant pour " 
                + km + " km sur " + modele + " (reste : " 
                + niveauCarburant + " unités)");
        }
    }

    // Ajoute une quantité de carburant au niveau disponible.
    public void refuel(double quantite) {
        niveauCarburant += quantite;

        // Affiche la quantité ajoutée et le nouveau niveau de carburant.
        System.out.println(modele + " ravitaillé de " 
            + quantite + " unités (nouveau niveau : " 
            + niveauCarburant + ")");
    }

    // Redéfinit toString() pour ajouter les informations spécifiques au véhicule motorisé.
    @Override
    public String toString() {
        // Réutilise les informations de Vehicule et ajoute le moteur et le carburant.
        // String.format("%.1f", niveauCarburant) affiche le carburant avec une décimale.
        return super.toString() + " {" 
            + moteur + ", carburant=" 
            + String.format("%.1f", niveauCarburant) + "}";
    }
}

