package chap4;

public class CompteBancaire {

    private String titulaire;
    private double solde;

    public CompteBancaire(String titulaire, double solde) {
        setTitulaire(titulaire);
        setSolde(solde);
    }

    public String getTitulaire() {
        return this.titulaire;
    }

    public void setTitulaire(String titulaire) {
        if (titulaire != null && !titulaire.isBlank()) {
            this.titulaire = titulaire;
        }
    }

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double solde) {
        if (solde >= 0) {
            this.solde = solde;
        }
    }
}