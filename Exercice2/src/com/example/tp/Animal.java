
package com.example.tp;

// Classe Animal : représente un animal avec un identifiant, un nom et un âge.
public class Animal {

    // Compteur statique partagé par tous les animaux pour générer des identifiants uniques.
    private static int compteur = 0;

    // Identifiant unique de l'animal, initialisé une seule fois grâce à final.
    private final int id;

    // Nom de l'animal, accessible dans cette classe et ses sous-classes.
    protected String nom;

    // Âge de l'animal, accessible dans cette classe et ses sous-classes.
    protected int age;

    // Constructeur : initialise l'animal avec un identifiant, un nom et un âge.
    public Animal(String nom, int age) {
        this.id    = ++compteur;
        this.nom   = nom;
        this.age   = age;
    }

    // Retourne l'identifiant de l'animal.
    public int getId() { return id; }

    // Retourne le nom de l'animal.
    public String getNom() { return nom; }

    // Retourne l'âge de l'animal.
    public int getAge() { return age; }

    // Affiche un message indiquant que l'animal se déplace.
    public void seDeplacer() {
        System.out.println(nom + " se déplace.");
    }

    // Redéfinit toString() pour obtenir une représentation textuelle de l'animal.
    @Override
    public String toString() {
        return "Animal[id=" + id +
               ", nom=" + nom +
               ", age=" + age + "]";
    }
}

