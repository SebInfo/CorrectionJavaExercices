package chapitre9;

/**
 * Represente une boisson pouvant etre vendue.
 */
public class Boisson implements Vendable {

    private double prix;

    /**
     * Cree une boisson avec un prix initial.
     *
     * @param prix un double correspondant au prix de la boisson
     */
    public Boisson(double prix) {
        setPrix(prix);
    }

    /**
     * Modifie le prix de la boisson.
     *
     * @param prix un double correspondant au prix de la boisson
     */
    public void setPrix(double prix) {
        if (prix < 0) {
            throw new IllegalArgumentException("Le prix doit être positif");
        }
        this.prix = prix;
    }

    /**
     * Retourne le prix de la boisson.
     *
     * @return un double correspondant au prix de la boisson
     */
    @Override
    public double getPrix() {
        return this.prix;
    }

}
