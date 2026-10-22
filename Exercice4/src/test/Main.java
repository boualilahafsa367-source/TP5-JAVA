package test;

import java.util.Scanner;
import entities.*;

public class Main {

    // Lit un entier en évitant de laisser des caractères dans le Scanner.
    public static int lireInt(Scanner sc) {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Veuillez saisir un entier valide : ");
            }
        }
    }

    // Lit un nombre décimal.
    public static double lireDouble(Scanner sc) {
        while (true) {
            try {
                return Double.parseDouble(
                        sc.nextLine().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.print("Veuillez saisir un nombre valide : ");
            }
        }
    }

    // Demande les informations nécessaires et crée un document.
    public static Document creerDocument(Scanner sc) {
        System.out.println("\nType de document :");
        System.out.println("1. Livre");
        System.out.println("2. Revue");
        System.out.println("3. Dictionnaire");
        System.out.println("4. Roman");
        System.out.println("5. Manuel");
        System.out.print("Votre choix : ");

        int choix = lireInt(sc);

        System.out.print("Titre : ");
        String titre = sc.nextLine();

        switch (choix) {
            case 1:
                System.out.print("Auteur : ");
                String auteur = sc.nextLine();

                System.out.print("Nombre de pages : ");
                int pages = lireInt(sc);

                return new Livre(titre, auteur, pages);

            case 2:
                System.out.print("Mois de publication : ");
                String mois = sc.nextLine();

                System.out.print("Année de publication : ");
                int annee = lireInt(sc);

                return new Revue(titre, mois, annee);

            case 3:
                System.out.print("Langue : ");
                String langue = sc.nextLine();

                return new Dictionnaire(titre, langue);

            case 4:
                System.out.print("Auteur : ");
                String auteurRoman = sc.nextLine();

                System.out.print("Nombre de pages : ");
                int pagesRoman = lireInt(sc);

                System.out.print("Prix : ");
                double prix = lireDouble(sc);

                return new Roman(titre, auteurRoman,
                        pagesRoman, prix);

            case 5:
                System.out.print("Auteur : ");
                String auteurManuel = sc.nextLine();

                System.out.print("Nombre de pages : ");
                int pagesManuel = lireInt(sc);

                System.out.print("Niveau : ");
                String niveau = sc.nextLine();

                return new Manuel(titre, auteurManuel,
                        pagesManuel, niveau);

            default:
                System.out.println("Type de document invalide.");
                return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demande la capacité de la bibliothèque.
        int capacite;

        do {
            System.out.print(
                    "Capacité de la bibliothèque (minimum 2) : ");
            capacite = lireInt(sc);

            if (capacite < 2) {
                System.out.println(
                        "La capacité doit être au moins égale à 2.");
            }
        } while (capacite < 2);

        // Crée la bibliothèque avec la capacité choisie.
        Bibliotheque bibliotheque = new Bibliotheque(capacite);

        // Initialise la bibliothèque avec deux documents.
        bibliotheque.ajouter(
                new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 96));

        bibliotheque.ajouter(
                new Revue("Science et Vie", "Octobre", 2026));

        // Affiche le menu jusqu'à ce que l'utilisateur choisisse de quitter.
        int choix;

        do {
            System.out.println("\n===== MENU BIBLIOTHÈQUE =====");
            System.out.println("1. Ajouter un document");
            System.out.println("2. Afficher tous les documents");
            System.out.println("3. Supprimer un document");
            System.out.println("4. Rechercher un document");
            System.out.println("5. Afficher les auteurs");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = lireInt(sc);

            switch (choix) {
                case 1:
                    Document nouveau = creerDocument(sc);

                    if (nouveau != null) {
                        if (bibliotheque.ajouter(nouveau)) {
                            System.out.println(
                                    "Document ajouté avec succès.");
                        } else {
                            System.out.println(
                                    "Échec : bibliothèque pleine.");
                        }
                    }
                    break;

                case 2:
                    bibliotheque.afficherDocuments();
                    break;

                case 3:
                    System.out.print(
                            "Numéro du document à supprimer : ");
                    int numSupp = lireInt(sc);

                    Document docSupp =
                            bibliotheque.document(numSupp);

                    if (bibliotheque.supprimer(docSupp)) {
                        System.out.println("Document supprimé.");
                    } else {
                        System.out.println(
                                "Document introuvable.");
                    }
                    break;

                case 4:
                    System.out.print(
                            "Numéro du document à rechercher : ");
                    int numRecherche = lireInt(sc);

                    Document resultat =
                            bibliotheque.document(numRecherche);

                    if (resultat != null) {
                        System.out.println(resultat);
                    } else {
                        System.out.println(
                                "Document introuvable.");
                    }
                    break;

                case 5:
                    bibliotheque.afficherAuteurs();
                    break;

                case 0:
                    System.out.println("Fin du programme.");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }

        } while (choix != 0);

        sc.close();
    }
}
