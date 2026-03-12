package chapitre9;

import java.util.List;

/**
 * Represente un pipeline abstrait appliquant plusieurs regles de prix.
 */
public abstract class PipelinePrix {

    /**
     * Applique successivement toutes les regles de prix sur une valeur initiale.
     *
     * @param regles une liste de regles de prix a appliquer
     * @param prix un double correspondant au prix initial
     * @return un double correspondant au prix final
     */
    public double appliquerToutes(List<ReglePrix> regles, double prix) {
        if (regles == null) {
            throw new IllegalArgumentException("La liste des règles ne peut pas être null");
        }

        if (prix < 0) {
            throw new IllegalArgumentException("Le prix doit être positif");
        }

        double resultat = prix;

        for (ReglePrix regle : regles) {
            resultat = regle.appliquer(resultat);
        }

        return resultat;
    }

}
