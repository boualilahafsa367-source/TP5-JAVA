package com.example.tp;

// Classe Flotte : permet de gérer un ensemble de véhicules.
public class Flotte {

    // Tableau contenant les véhicules de la flotte, avec une capacité initiale de 5.
    private Vehicule[] parc = new Vehicule[5];

    // Nombre de véhicules actuellement enregistrés dans la flotte.
    private int nb = 0;

    // Ajoute un véhicule à la flotte.
    public void ajouter(Vehicule v) {
        // Vérifie si le tableau est plein avant d'ajouter un véhicule.
        if (nb == parc.length) {
            // Crée un nouveau tableau dont la capacité est doublée.
            Vehicule[] tmp = new Vehicule[parc.length * 2];

            // Copie les véhicules existants dans le nouveau tableau.
            System.arraycopy(parc, 0, tmp, 0, parc.length);

            // Remplace l'ancien tableau par le nouveau tableau plus grand.
            parc = tmp;
        }

        // Ajoute le véhicule à la prochaine position libre, puis incrémente le compteur.
        parc[nb++] = v;
    }

    // Affiche tous les véhicules enregistrés dans la flotte.
    public void afficherTous() {
        // Affiche le nombre total de véhicules présents dans la flotte.
        System.out.println("Flotte (" + nb + " véhicules) :");

        // Parcourt les positions occupées par les véhicules.
        for (int i = 0; i < nb; i++) {
            // Affiche chaque véhicule en utilisant automatiquement sa méthode toString().
            System.out.println("  • " + parc[i]);
        }
    }

    // Calcule et retourne la distance totale parcourue par les véhicules motorisés.
    public double distanceTotale() {
        // Initialise la somme des distances à 0.
        double sum = 0;

        // Parcourt tous les véhicules enregistrés dans la flotte.
        for (int i = 0; i < nb; i++) {

            // Vérifie si le véhicule est une instance de Motorise ou d'une de ses sous-classes.
            if (parc[i] instanceof Motorise) {

                // Convertit la référence Vehicule en Motorise pour accéder à kmTotal.
                // Ajoute la distance parcourue par ce véhicule au total.
                sum += ((Motorise)parc[i]).kmTotal;
            }
        }

        // Retourne la distance totale calculée.
        return sum;
    }
}

