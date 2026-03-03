package chap3;

public class Exercice32 {

    public static void main(String[] args) {

        int[] notes = {12, 15, 9, 18, 14};

        double moyenne = calculerMoyenne(notes);

        System.out.println("Moyenne : " + moyenne);
    }

    private static double calculerMoyenne(int[] tableau) {

        if (tableau == null || tableau.length == 0) {
            throw new IllegalArgumentException("Le tableau ne peut pas être vide.");
        }

        int somme = 0;

        for (int valeur : tableau) {
            somme += valeur;
        }

        return (double) somme / tableau.length;
    }
}