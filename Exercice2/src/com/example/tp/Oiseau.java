
package com.example.tp;

// Classe Oiseau qui hérite de la classe Animal.
public class Oiseau extends Animal {

    // Envergure de l'oiseau, exprimée en mètres.
    private double envergure;

    // Constructeur : initialise le nom, l'âge et l'envergure de l'oiseau.
    public Oiseau(String nom, int age, double envergure) {
        // Appelle le constructeur de la classe mère Animal.
        super(nom, age);
        this.envergure = envergure;
    }

    // Affiche un message indiquant que l'oiseau s'envole et précise son envergure.
    public void voler() {
        System.out.println(nom + " s'envole avec une envergure de " 
                           + envergure + " m.");
    }

    // Redéfinit toString() pour ajouter les informations spécifiques à l'oiseau.
    @Override
    public String toString() {
        // Réutilise les informations de Animal et ajoute l'envergure de l'oiseau.
        return super.toString() +
               " {Oiseau, envergure=" + envergure + "}";
    }
}
