package chap2;

public class Exercice23 {

    public static void main(String[] args) {

        int[] notes = {12, 8, 15, 3, 19, 7, 14, 5};

        for (int note : notes) {

            // Arrêt immédiat si la note vaut 19
            if (note == 19) {
                System.out.println("Note 19 rencontrée : arrêt du parcours.");
                break;
            }

            // Ignorer les notes strictement inférieures à 5
            if (note < 5) {
                continue;
            }

            // Afficher uniquement les notes >= 10
            if (note >= 10) {
                System.out.println("Note retenue : " + note);
            }
        }

        System.out.println("Fin du traitement.");
    }
}