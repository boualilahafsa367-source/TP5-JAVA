
package com.example.tp;

public class Compte {

    // Attribut statique partagé par tous les comptes pour compter les comptes créés.
    private static int compteur = 0;

    // Numéro unique du compte, défini une seule fois grâce au mot-clé final.
    private final int numero;

    // Solde du compte, accessible dans cette classe et ses sous-classes.
    protected double solde;

    // Constructeur : initialise le compte avec un solde initial et attribue un numéro.
    public Compte(double soldeInitial) {
        this.numero = ++compteur;
        this.solde  = soldeInitial;
    }

    // Retourne le numéro du compte.
    public int getNumero() {
        return numero;
    }

    // Retourne le solde actuel du compte.
    public double getSolde() {
        return solde;
    }

    // Permet d'ajouter de l'argent au compte si le montant est positif.
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Compte #" + numero + " : dépôt de " + montant);
        }
    }

    // Permet de retirer de l'argent si le montant est positif et le solde suffisant.
    public void retirer(double montant) {
        if (montant > 0 && solde >= montant) {
            solde -= montant;
            System.out.println("Compte #" + numero + " : retrait de " + montant);
        } else {
            // Affiche un message si le retrait ne respecte pas les conditions.
            System.out.println("Compte #" + numero + " : retrait impossible (solde insuffisant)");
        }
    }

    // Affiche le numéro et le solde actuel du compte.
    public void afficherDetails() {
        System.out.println("Compte #" + numero + " — solde = " + solde);
    }
}

