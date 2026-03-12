package chapitre7;

/**
 * Represente un compte bancaire avec un titulaire et un solde.
 */
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
        setTitulaire(titulaire);
        setSolde(solde);
    }

    /**
     * Retourne le nom du titulaire du compte bancaire.
     *
     * @return une chaine de caracteres correspondant au titulaire du compte bancaire
     */
    public String getTitulaire() {
        return this.titulaire;
    }

    /**
     * Modifie le nom du titulaire du compte bancaire.
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
     * @return un double correspondant au solde du compte bancaire
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

    /**
     * Ajoute un montant au solde du compte bancaire.
     *
     * @param montant un double correspondant au montant a deposer
     */
    public void deposer(double montant) {
        if (montant > 0) {
            this.solde += montant;
        }
    }

    /**
     * Retire un montant du solde du compte bancaire si le retrait est possible.
     *
     * @param montant un double correspondant au montant a retirer
     */
    public void retirer(double montant) {
        if (montant > 0 && montant <= this.solde) {
            this.solde -= montant;
        }
    }
}
