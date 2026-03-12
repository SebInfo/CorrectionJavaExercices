package chapitre9;

/**
 * Represente une regle appliquant une remise en pourcentage avec un plafond.
 */
public class RemisePourcentage implements ReglePrix {

    private double pourcentage;
    private double plafond;

    /**
     * Cree une remise en pourcentage avec un plafond.
     *
     * @param pourcentage un double correspondant au pourcentage de remise
     * @param plafond un double correspondant au montant maximal de la remise
     */
    public RemisePourcentage(double pourcentage, double plafond) {
        setPourcentage(pourcentage);
        setPlafond(plafond);
    }

    /**
     * Retourne le pourcentage de remise.
     *
     * @return un double correspondant au pourcentage de remise
     */
    public double getPourcentage() {
        return this.pourcentage;
    }

    /**
     * Modifie le pourcentage de remise.
     *
     * @param pourcentage un double correspondant au pourcentage de remise
     */
    public void setPourcentage(double pourcentage) {
        if (pourcentage < 0 || pourcentage > 1) {
            throw new IllegalArgumentException("Le pourcentage doit être compris entre 0 et 1");
        }
        this.pourcentage = pourcentage;
    }

    /**
     * Retourne le plafond de la remise.
     *
     * @return un double correspondant au plafond de la remise
     */
    public double getPlafond() {
        return this.plafond;
    }

    /**
     * Modifie le plafond de la remise.
     *
     * @param plafond un double correspondant au plafond de la remise
     */
    public void setPlafond(double plafond) {
        if (plafond < 0) {
            throw new IllegalArgumentException("Le plafond doit être positif");
        }
        this.plafond = plafond;
    }

    /**
     * Applique la remise en pourcentage sur le prix.
     *
     * @param prix un double correspondant au prix a modifier
     * @return un double correspondant au prix apres remise
     */
    @Override
    public double appliquer(double prix) {
        if (prix < 0) {
            throw new IllegalArgumentException("Le prix doit être positif");
        }

        double remise = prix * this.pourcentage;
        remise = limiter(remise, 0, this.plafond);

        return prix - remise;
    }

}
