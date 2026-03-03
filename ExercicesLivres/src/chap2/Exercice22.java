package chap2;

import java.util.Scanner;

public class Exercice22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char recommencer;

        do {
            int nombre;

            // Validation de la saisie
            do {
                System.out.print("Saisir un entier entre 1 et 10 : ");
                nombre = scanner.nextInt();

                if (nombre < 1 || nombre > 10) {
                    System.out.println("J'ai dit entre 1 et 10 ! Recommencez.");
                }

            } while (nombre < 1 || nombre > 10);

            if (nombre >= 1 && nombre <= 10) {

                System.out.println("\nTable de multiplication de " + nombre + " :");

                // Affichage de la table avec une boucle for
                for (int i = 1; i <= 10; i++) {
                    System.out.println(nombre + " x " + i + " = " + (nombre * i));
                }

            } else {
                System.out.println("Erreur : le nombre doit être compris entre 1 et 10.");
            }

            // Demande pour recommencer
            System.out.print("\nVoulez-vous recommencer ? (o/n) : ");
            recommencer = scanner.next().charAt(0);

        } while (recommencer == 'o' || recommencer == 'O');

        scanner.close();
        System.out.println("Fin du programme.");
    }
}