package chapitre8;

/**
 * Lance l'exercice 82 et affiche la surface de plusieurs formes.
 */
public class Exercice82 {

    /**
     * Point d'entree du programme.
     *
     * @param args un tableau de chaines de caracteres contenant les arguments de la ligne de commande
     */
    public static void main(String[] args) {

        Forme f1 = new Rectangle(5, 10);
        Forme f2 = new Carre(10);

        System.out.println(f1.calculerSurface());
        System.out.println(f2.calculerSurface());

    }

}
