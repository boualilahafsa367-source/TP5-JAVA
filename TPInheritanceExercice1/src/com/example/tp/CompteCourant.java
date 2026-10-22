
package com.example.tp;

// Classe CompteCourant qui hérite de la classe Compte.
public class CompteCourant extends Compte {

    // Montant maximal du découvert autorisé sur le compte courant.
    private double decouvertAutorise;

    // Constructeur : initialise le solde et la limite du découvert autorisé.
    public CompteCourant(double soldeInitial, double decouvertAutorise) {
        // Appelle le constructeur de la classe mère pour initialiser le compte.
        super(soldeInitial);
        this.decouvertAutorise = decouvertAutorise;
    }

    /** Permet un découvert jusqu’à la limite autorisée */
    // Redéfinit la méthode retirer() pour autoriser un solde négatif dans la limite prévue.
    @Override
    public void retirer(double montant) {
        // Vérifie que le montant est positif et que le découvert autorisé couvre le retrait.
        if (montant > 0 && solde + decouvertAutorise >= montant) {
            // Déduit le montant retiré du solde, même si celui-ci devient négatif.
            solde -= montant;
            System.out.println("CompteCourant #" + getNumero()
                + " : retrait de " + montant);
        } else {
            // Affiche un message si le retrait dépasse la limite du découvert autorisé.
            System.out.println("CompteCourant #" + getNumero()
                + " : retrait impossible (découvert max dépassé)");
        }
    }

    // Redéfinit la méthode afficherDetails() pour afficher les informations spécifiques au compte courant.
    @Override
    public void afficherDetails() {
        // Affiche le numéro du compte, son solde et le montant du découvert autorisé.
        System.out.println("CompteCourant #" + getNumero()
            + " — solde = " + solde
            + ", découvert autorisé = " + decouvertAutorise);
    }
}