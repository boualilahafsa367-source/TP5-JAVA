
package com.example.tp;

// Classe Zoo : permet de stocker et de gérer plusieurs animaux.
public class Zoo {

    // Tableau contenant les animaux du zoo.
    private Animal[] animaux;

    // Nombre d'animaux actuellement enregistrés dans le zoo.
    private int nbAnimaux;

    // Constructeur : crée un tableau initial de 5 animaux et initialise le compteur à 0.
    public Zoo() {
        this.animaux   = new Animal[5];
        this.nbAnimaux = 0;
    }

    // Ajoute un animal au zoo.
    public void ajouterAnimal(Animal a) {
        // Vérifie si le tableau est plein avant d'ajouter un nouvel animal.
        if (nbAnimaux == animaux.length) {
            // Crée un nouveau tableau dont la capacité est doublée.
            Animal[] tmp = new Animal[animaux.length * 2];

            // Copie les animaux existants dans le nouveau tableau.
            System.arraycopy(animaux, 0, tmp, 0, animaux.length);

            // Remplace l'ancien tableau par le nouveau tableau plus grand.
            animaux = tmp;
        }

        // Ajoute l'animal à la prochaine position libre, puis incrémente le compteur.
        animaux[nbAnimaux++] = a;
    }

    // Affiche tous les animaux actuellement enregistrés dans le zoo.
    public void afficherTous() {
        // Affiche le nombre total d'animaux présents dans le zoo.
        System.out.println("Le zoo contient " + nbAnimaux + " animaux :");

        // Parcourt uniquement les positions occupées par des animaux.
        for (int i = 0; i < nbAnimaux; i++) {
            // Affiche chaque animal en utilisant automatiquement sa méthode toString().
            System.out.println("  - " + animaux[i]);
        }
    }
}
