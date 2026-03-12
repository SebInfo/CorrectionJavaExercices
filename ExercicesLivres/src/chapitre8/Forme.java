package chapitre8;

/**
 * Definit le comportement commun des formes geometriques.
 */
public interface Forme {

    /**
     * Calcule la surface d'une forme geometrique.
     *
     * @return un int correspondant a la surface de la forme
     */
    int calculerSurface();
}
