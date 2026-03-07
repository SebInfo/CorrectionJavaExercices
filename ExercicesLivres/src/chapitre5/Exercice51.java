package chap3;
public class Exercice31 {

    public static void main(String[] args) {

        int resultat1 = carre(2);
        int resultat2 = carre(5);
        int resultat3 = carre(-3);

        System.out.println("Carré de 2 : " + resultat1);
        System.out.println("Carré de 5 : " + resultat2);
        System.out.println("Carré de -3 : " + resultat3);
    }

    private static int carre(int nombre) {
        return nombre * nombre;
    }
}