package chapitre6;

public class CompteBancaire {

    private String titulaire;
    private double solde;

    /**
     * Cree un compte bancaire avec un titulaire et un solde initial.
     *
     * @param titulaire une chaine de caracteres correspondant au nom du titulaire du compte bancaire
     * @param solde un double correspondant au solde initial du compte bancaire
     */
    public CompteBancaire(String titulaire, double solde) {
        this.setTitulaire(titulaire);
        this.setSolde(solde);
    }

    /**
     * Retourne le nom du titulaire du compte.
     *
     * @return une chaine de caracteres correspondant au titulaire du compte bancaire
     */
    public String getTitulaire() {
        return this.titulaire;
    }

    /**
     * Modifie le nom du titulaire du compte.
     *
     * @param titulaire une chaine de caracteres correspondant au nom du titulaire du compte bancaire
     */
    public void setTitulaire(String titulaire) {
        if (titulaire != null && !titulaire.isBlank()) {
            this.titulaire = titulaire;
        }
    }

    /**
     * Retourne le solde du compte bancaire.
     *
     * @return un double correspondant au solde du compte
     */
    public double getSolde() {
        return this.solde;
    }

    /**
     * Modifie le solde du compte bancaire si la valeur n'est pas negative.
     *
     * @param solde un double correspondant au nouveau solde du compte bancaire
     */
    public void setSolde(double solde) {
        if (solde >= 0) {
            this.solde = solde;
        }
    }
}
