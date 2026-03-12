package chapitre5;

public class Exercice52 {

    public static void main(String[] args) {

        int[] notes = {12, 15, 9, 18, 14};

        double moyenne = calculerMoyenne(notes);

        System.out.println("Moyenne : " + moyenne);
    }

    /**
     * Calcule la moyenne des valeurs contenues dans un tableau d'entiers.
     *
     * @param tableau le tableau d'entiers contenant les valeurs a moyenner
     * @return la moyenne des elements du tableau
     */
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
