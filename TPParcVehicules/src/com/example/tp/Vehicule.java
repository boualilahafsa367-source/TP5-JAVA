
package com.example.tp;

// Classe Vehicule : représente un véhicule avec un identifiant unique et un modèle.
public class Vehicule {

    // Compteur statique partagé par tous les véhicules pour générer des identifiants uniques.
    private static int compteur = 0;

    // Identifiant unique du véhicule, initialisé une seule fois grâce à final.
    private final int id;

    // Modèle du véhicule, accessible dans cette classe et ses sous-classes.
    protected String modele;

    // Constructeur : initialise le modèle et attribue un identifiant unique au véhicule.
    public Vehicule(String modele) {
        this.id = ++compteur;
        this.modele = modele;
    }

    // Redéfinit toString() pour afficher les informations du véhicule.
    @Override
    public String toString() {
        // Retourne l'identifiant et le modèle du véhicule sous forme de texte.
        return "Vehicule#" + id + " [" + modele + "]";
    }
}

