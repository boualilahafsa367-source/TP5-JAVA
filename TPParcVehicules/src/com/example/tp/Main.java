
package com.example.tp;

// Classe principale contenant le point d'entrée du programme.
public class Main {

    // Méthode principale exécutée au lancement du programme.
    public static void main(String[] args) {

        // Crée un objet Flotte pour gérer les véhicules.
        Flotte flotte = new Flotte();

        // Crée une voiture avec son moteur, son carburant initial et son nombre de portes.
        Voiture v1 = new Voiture("Clio", new Moteur("Essence",75), 50, 5);

        // Crée un camion avec son moteur, son carburant initial et sa capacité de charge.
        Camion  c1 = new Camion("Volvo", new Moteur("Diesel",400),200,20);

        // Crée une moto avec son moteur, son carburant initial et sa cylindrée.
        Moto    m1 = new Moto("Harley", new Moteur("Essence",90),20,1200);

        // Crée une voiture électrique avec son moteur et son niveau initial de batterie.
        VoitureElectrique e1 = new VoitureElectrique("Tesla", new Moteur("Élec",300),85);

        // Ajoute les quatre véhicules à la flotte.
        flotte.ajouter(v1);
        flotte.ajouter(c1);
        flotte.ajouter(m1);
        flotte.ajouter(e1);

        // Affiche les informations de tous les véhicules de la flotte.
        flotte.afficherTous();

        // Affiche une ligne vide pour séparer les résultats.
        System.out.println();

        // Scénario de conduite
        // Démarre la voiture Clio.
        v1.demarrer();

        // Simule un trajet de 100 km et met à jour le carburant et la distance parcourue.
        v1.rouler(100);

        // Ajoute 20 unités de carburant à la voiture.
        v1.refuel(20);

        // Simule un trajet supplémentaire de 300 km.
        v1.rouler(300);

        // Affiche une ligne vide pour séparer les scénarios.
        System.out.println();

        // Démarre la voiture électrique Tesla.
        e1.demarrer();

        // Simule un trajet de 200 km.
        e1.rouler(200);

        // Recharge la batterie de 50 kWh grâce à la méthode refuel() redéfinie.
        e1.refuel(50);

        // Simule un trajet supplémentaire de 300 km.
        e1.rouler(300);

        // Affiche une ligne vide avant le résultat final.
        System.out.println();

        // Calcule et affiche la distance totale parcourue par les véhicules motorisés.
        System.out.println("Distance totale parcourue : " 
            + flotte.distanceTotale() + " km");
    }
}

