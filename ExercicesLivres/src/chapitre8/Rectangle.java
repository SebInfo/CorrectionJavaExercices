package chapitre8;

/**
 * Represente un rectangle.
 */
public class Rectangle implements Forme {

    private int largeur;
    private int hauteur;

    /**
     * Cree un rectangle avec une largeur et une hauteur.
     *
     * @param largeur un int correspondant a la largeur du rectangle
     * @param hauteur un int correspondant a la hauteur du rectangle
     */
    public Rectangle(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    /**
     * Calcule la surface du rectangle.
     *
     * @return un int correspondant a la surface du rectangle
     */
    @Override
    public int calculerSurface() {
        return this.largeur * this.hauteur;
    }

}
