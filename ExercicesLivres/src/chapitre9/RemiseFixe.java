package chapitre9;

/**
 * Represente une regle appliquant une reduction fixe sur un prix.
 */
public class RemiseFixe implements ReglePrix {

    private double montant;

    /**
     * Cree une remise fixe.
     *
     * @param montant un double correspondant au montant de la remise
     */
    public RemiseFixe(double montant) {
        setMontant(montant);
    }

    /**
     * Retourne le montant de la remise fixe.
     *
     * @return un double correspondant au montant de la remise
     */
    public double getMontant() {
        return this.montant;
    }

    /**
     * Modifie le montant de la remise fixe.
     *
     * @param montant un double correspondant au montant de la remise
     */
    public void setMontant(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Le montant de la remise doit être positif");
        }
        this.montant = montant;
    }

    /**
     * Applique la remise fixe sur le prix.
     *
     * @param prix un double correspondant au prix a modifier
     * @return un double correspondant au prix apres remise
     */
    @Override
    public double appliquer(double prix) {
        if (prix < 0) {
            throw new IllegalArgumentException("Le prix doit être positif");
        }

        return Math.max(0, prix - this.montant);
    }

}
