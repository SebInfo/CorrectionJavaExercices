package chapitre9;

/**
 * Represente un livre pouvant etre vendu.
 */
public class Livre implements Vendable {

    private double prix;

    /**
     * Cree un livre avec un prix initial.
     *
     * @param prix un double correspondant au prix du livre
     */
    public Livre(double prix) {
        setPrix(prix);
    }

    /**
     * Modifie le prix du livre.
     *
     * @param prix un double correspondant au prix du livre
     */
    public void setPrix(double prix) {
        if (prix < 0) {
            throw new IllegalArgumentException("Le prix doit être positif");
        }
        this.prix = prix;
    }

    /**
     * Retourne le prix du livre.
     *
     * @return un double correspondant au prix du livre
     */
    @Override
    public double getPrix() {
        return this.prix;
    }

}
