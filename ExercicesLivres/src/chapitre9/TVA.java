package chapitre9;

/**
 * Represente une regle appliquant une taxe sur la valeur ajoutee.
 */
public class TVA implements ReglePrix {

    private double taux;

    /**
     * Cree une regle de TVA.
     *
     * @param taux un double correspondant au taux de TVA
     */
    public TVA(double taux) {
        setTaux(taux);
    }

    /**
     * Retourne le taux de TVA.
     *
     * @return un double correspondant au taux de TVA
     */
    public double getTaux() {
        return this.taux;
    }

    /**
     * Modifie le taux de TVA.
     *
     * @param taux un double correspondant au taux de TVA
     */
    public void setTaux(double taux) {
        if (taux < 0) {
            throw new IllegalArgumentException("Le taux de TVA doit être positif");
        }
        this.taux = taux;
    }

    /**
     * Applique la TVA sur le prix.
     *
     * @param prix un double correspondant au prix a modifier
     * @return un double correspondant au prix apres application de la TVA
     */
    @Override
    public double appliquer(double prix) {
        if (prix < 0) {
            throw new IllegalArgumentException("Le prix doit être positif");
        }

        return prix * (1 + this.taux);
    }

}
