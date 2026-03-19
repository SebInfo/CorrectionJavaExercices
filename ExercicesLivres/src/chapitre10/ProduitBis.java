package chapitre10;

/**
 * Represente un produit avec une reference, un nom et un prix.
 * L'ordre naturel des produits est defini par prix croissant.
 */
public class ProduitBis implements Comparable<ProduitBis> {

    private String reference;
    private String nom;
    private double prix;

    /**
     * Construit un produit.
     *
     * @param reference la reference du produit
     * @param nom le nom du produit
     * @param prix le prix du produit
     */
    public ProduitBis(String reference, String nom, double prix) {
        setReference(reference);
        setNom(nom);
        setPrix(prix);
    }

    /**
     * Retourne la reference du produit.
     *
     * @return la reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * Modifie la reference du produit.
     *
     * @param reference la nouvelle reference
     */
    public void setReference(String reference) {
        if (reference == null || reference.isBlank()) {
            throw new IllegalArgumentException("La référence ne peut pas être vide");
        }
        this.reference = reference;
    }

    /**
     * Retourne le nom du produit.
     *
     * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom du produit.
     *
     * @param nom le nouveau nom
     */
    public void setNom(String nom) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("Le nom ne peut pas être vide");
        }
        this.nom = nom;
    }

    /**
     * Retourne le prix du produit.
     *
     * @return le prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Modifie le prix du produit.
     *
     * @param prix le nouveau prix
     */
    public void setPrix(double prix) {
        if (prix < 0) {
            throw new IllegalArgumentException("Le prix doit être positif");
        }
        this.prix = prix;
    }

    /**
     * Compare deux produits par prix croissant.
     *
     * @param autre l'autre produit
     * @return un entier negatif, nul ou positif selon l'ordre de tri
     */
    @Override
    public int compareTo(ProduitBis autre) {
        return Double.compare(this.prix, autre.prix);
    }

    /**
     * Retourne une representation textuelle du produit.
     *
     * @return une chaine contenant les informations du produit
     */
    @Override
    public String toString() {
        return "Produit{" +
                "reference='" + reference + '\'' +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }

}
