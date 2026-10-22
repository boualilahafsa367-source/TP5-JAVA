package entities;

// Classe mère représentant un document de la bibliothèque.
public class Document {
    private static int compteur = 0;
    private final int numEnreg;
    private String titre;

    // Constructeur : attribue un numéro unique et initialise le titre.
    public Document(String titre) {
        this.numEnreg = ++compteur;
        this.titre = titre;
    }

    public int getNumEnreg() {
        return numEnreg;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    // Redéfinit l'affichage du document.
    @Override
    public String toString() {
        return "Document [numEnreg=" + numEnreg
                + ", titre=" + titre + "]";
    }
}
