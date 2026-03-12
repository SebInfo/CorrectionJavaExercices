package chapitre7;

/**
 * Represente un produit avec un nom et un prix.
 */
public class Produit {

    private String nom;
    private double prix;

    /**
     * Cree un produit avec un nom et un prix initial.
     *
     * @param nom une chaine de caracteres correspondant au nom du produit
     * @param prix un double correspondant au prix initial du produit
     */
    public Produit(String nom, double prix) {
        setNom(nom);
        setPrix(prix);
    }

    /**
     * Retourne le nom du produit.
     *
     * @return une chaine de caracteres correspondant au nom du produit
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Modifie le nom du produit.
     *
     * @param nom une chaine de caracteres correspondant au nom du produit
     */
    public void setNom(String nom) {
        if (nom != null && !nom.isBlank()) {
            this.nom = nom;
        }
    }

    /**
     * Retourne le prix du produit.
     *
     * @return un double correspondant au prix du produit
     */
    public double getPrix() {
        return this.prix;
    }

    /**
     * Modifie le prix du produit si la valeur n'est pas negative.
     *
     * @param prix un double correspondant au nouveau prix du produit
     */
    public void setPrix(double prix) {
        if (prix >= 0) {
            this.prix = prix;
        }
    }

    /**
     * Applique une remise sur le prix du produit.
     *
     * @param pourcentage un double correspondant au pourcentage de remise
     */
    public void appliquerRemise(double pourcentage) {
        if (pourcentage < 0 || pourcentage > 100) {
            return;
        }

        double coefficient = 1 - (pourcentage / 100);
        this.prix = this.prix * coefficient;
    }
}
