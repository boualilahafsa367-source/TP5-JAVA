
package com.example.tp;

// Classe CompteEpargne qui hérite de la classe Compte.
public class CompteEpargne extends Compte {

    // Taux d'intérêt du compte épargne exprimé en pourcentage (ex. 2.5 pour 2,5%).
    private double tauxInteret;

    // Constructeur : initialise le solde et le taux d'intérêt du compte épargne.
    public CompteEpargne(double soldeInitial, double tauxInteret) {
        // Appelle le constructeur de la classe mère Compte pour initialiser le solde et le numéro.
        super(soldeInitial);
        this.tauxInteret = tauxInteret;
    }

    /** Applique les intérêts au solde courant */
    public void appliquerInterets() {
        // Calcule les intérêts à partir du solde actuel et du taux d'intérêt.
        double interets = solde * tauxInteret / 100.0;

        // Ajoute les intérêts calculés au solde du compte épargne.
        solde += interets;

        // Affiche le numéro du compte et le montant des intérêts appliqués.
        System.out.println("CompteEpargne #" + getNumero()
            + " : intérêts de " + interets);
    }

    // Redéfinit la méthode afficherDetails() héritée de la classe Compte.
    @Override
    public void afficherDetails() {
        // Affiche le numéro, le solde et le taux d'intérêt du compte épargne.
        System.out.println("CompteEpargne #" + getNumero()
            + " — solde = " + solde
            + ", taux = " + tauxInteret + "%");
    }
}

