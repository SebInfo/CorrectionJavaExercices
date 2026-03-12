package chapitre8;

/**
 * Represente un carre.
 */
public class Carre implements Forme {

    private int cote;

    /**
     * Cree un carre avec une longueur de cote.
     *
     * @param cote un int correspondant a la longueur du cote du carre
     */
    public Carre(int cote) {
        this.cote = cote;
    }

    /**
     * Calcule la surface du carre.
     *
     * @return un int correspondant a la surface du carre
     */
    @Override
    public int calculerSurface() {
        return this.cote * this.cote;
    }

}
