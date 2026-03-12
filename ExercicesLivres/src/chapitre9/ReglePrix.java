package chapitre9;

/**
 * Definit le comportement commun des regles de calcul de prix.
 */
public interface ReglePrix {

    /**
     * Applique une regle de calcul sur un prix.
     *
     * @param prix un double correspondant au prix a modifier
     * @return un double correspondant au prix apres application de la regle
     */
    double appliquer(double prix);

    /**
     * Limite une valeur entre un minimum et un maximum.
     *
     * @param valeur un double correspondant a la valeur a limiter
     * @param min un double correspondant a la borne minimale
     * @param max un double correspondant a la borne maximale
     * @return un double correspondant a la valeur bornee
     */
    default double limiter(double valeur, double min, double max) {
        return Math.max(min, Math.min(valeur, max));
    }

}
