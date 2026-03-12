package chapitre5;
public class Exercice51 {

    public static void main(String[] args) {

        int resultat1 = carre(2);
        int resultat2 = carre(5);
        int resultat3 = carre(-3);

        System.out.println("Carré de 2 : " + resultat1);
        System.out.println("Carré de 5 : " + resultat2);
        System.out.println("Carré de -3 : " + resultat3);
    }

    /**
     * Calcule le carre d'un nombre entier.
     *
     * @param nombre le nombre entier dont on veut le carre
     * @return un int correspondant au carre du nombre entier passe en parametre
     */
    private static int carre(int nombre) {
        return nombre * nombre;
    }
}
