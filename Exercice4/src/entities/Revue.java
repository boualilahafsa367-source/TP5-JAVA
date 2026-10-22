package entities;

// Classe Revue qui hérite de Document.
public class Revue extends Document {
    private String mois;
    private int annee;

    public Revue(String titre, String mois, int annee) {
        super(titre);
        this.mois = mois;
        this.annee = annee;
    }

    public String getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }

    @Override
    public String toString() {
        return super.toString()
                + " {Revue, mois=" + mois
                + ", annee=" + annee + "}";
    }
}
