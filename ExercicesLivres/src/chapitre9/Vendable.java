package chapitre9;

/**
 * Definit le comportement commun des objets pouvant etre vendus.
 */
public interface Vendable {

    /**
     * Retourne le prix d'un objet vendable.
     *
     * @return un double correspondant au prix de l'objet
     */
    double getPrix();
}
