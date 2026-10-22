
package com.example.tp;

// Classe VoitureElectrique qui hérite de la classe Motorise.
public class VoitureElectrique extends Motorise {

    // Constructeur : initialise le modèle, le moteur et le niveau initial de la batterie.
    public VoitureElectrique(String modele, Moteur moteur, double batterieInitial) {
        // Appelle le constructeur de la classe mère Motorise.
        // La valeur batterieInitial est utilisée comme niveau initial de carburant dans la classe mère.
        super(modele, moteur, batterieInitial);
    }

    // Redéfinit refuel() pour recharger la batterie en kWh.
    @Override
    public void refuel(double kWh) {
        // Ajoute l'énergie fournie au niveau de la batterie.
        niveauCarburant += kWh;

        // Affiche la quantité d'énergie ajoutée et le niveau actuel de la batterie.
        System.out.println(modele + " recharge " 
            + kWh + " kWh (niveau=" 
            + niveauCarburant + ")");
    }

    // Redéfinit toString() pour adapter l'affichage à une voiture électrique.
    @Override
    public String toString() {
        // Remplace le mot "carburant" par "batterie" dans l'affichage hérité.
        // Ajoute ensuite la mention indiquant que le véhicule est électrique.
        return super.toString()
            .replace("carburant", "batterie") 
            + " {Electrique}";
    }
}

