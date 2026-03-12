package chapitre9;

/**
 * Lance l'exercice 91 et affiche le prix de plusieurs objets vendables.
 */
public class Exercice91 {

    /**
     * Point d'entree du programme.
     *
     * @param args un tableau de chaines de caracteres contenant les arguments de la ligne de commande
     */
    public static void main(String[] args) {

        Livre livre = new Livre(15.90);
        Boisson boisson = new Boisson(2.50);

        System.out.println("Prix du livre : " + livre.getPrix() + " €");
        System.out.println("Prix de la boisson : " + boisson.getPrix() + " €");

    }

}
