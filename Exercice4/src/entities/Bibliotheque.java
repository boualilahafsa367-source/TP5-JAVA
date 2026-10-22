package entities;

// Classe qui gère un ensemble de documents dans un tableau.
public class Bibliotheque {
    private Document[] documents;
    private int nbDocuments;

    // Constructeur : crée un tableau de la capacité indiquée.
    public Bibliotheque(int capacite) {
        if (capacite < 0) {
            throw new IllegalArgumentException(
                    "La capacité ne peut pas être négative.");
        }

        this.documents = new Document[capacite];
        this.nbDocuments = 0;
    }

    // Affiche tous les documents présents dans la bibliothèque.
    public void afficherDocuments() {
        if (nbDocuments == 0) {
            System.out.println("La bibliothèque est vide.");
            return;
        }

        System.out.println("Documents de la bibliothèque :");

        for (int i = 0; i < nbDocuments; i++) {
            System.out.println(documents[i]);
        }
    }

    // Ajoute un document si le tableau n'est pas plein.
    public boolean ajouter(Document doc) {
        if (doc == null || nbDocuments == documents.length) {
            return false;
        }

        documents[nbDocuments] = doc;
        nbDocuments++;

        return true;
    }

    // Supprime un document en comparant son numéro d'enregistrement.
    public boolean supprimer(Document doc) {
        if (doc == null) {
            return false;
        }

        for (int i = 0; i < nbDocuments; i++) {
            if (documents[i].getNumEnreg() == doc.getNumEnreg()) {

                // Décale les documents suivants vers la gauche.
                for (int j = i; j < nbDocuments - 1; j++) {
                    documents[j] = documents[j + 1];
                }

                // Libère la dernière position devenue inutilisée.
                documents[nbDocuments - 1] = null;
                nbDocuments--;

                return true;
            }
        }

        return false;
    }

    // Recherche un document à partir de son numéro d'enregistrement.
    public Document document(int numEnrg) {
        for (int i = 0; i < nbDocuments; i++) {
            if (documents[i].getNumEnreg() == numEnrg) {
                return documents[i];
            }
        }

        // Retourne null si aucun document ne correspond au numéro.
        return null;
    }

    // Affiche les auteurs des documents qui sont des livres.
    public void afficherAuteurs() {
        boolean trouve = false;

        System.out.println("Liste des auteurs :");

        for (int i = 0; i < nbDocuments; i++) {
            // Roman et Manuel sont aussi des Livres grâce à l'héritage.
            if (documents[i] instanceof Livre) {
                Livre livre = (Livre) documents[i];

                if (livre.getAuteur() != null
                        && !livre.getAuteur().trim().isEmpty()) {
                    System.out.println("- " + livre.getAuteur());
                    trouve = true;
                }
            }
        }

        if (!trouve) {
            System.out.println("Aucun auteur trouvé.");
        }
    }
}
