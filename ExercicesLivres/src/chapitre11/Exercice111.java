package chapitre11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercice111 {

    public static double diviser(int nombre1, int nombre2) {
        if (nombre2 == 0) {
            throw new ArithmeticException("Impossible de diviser par zero.");
        }
        return (double) nombre1 / nombre2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez le premier entier : ");
            int nombre1 = scanner.nextInt();

            System.out.print("Entrez le deuxieme entier : ");
            int nombre2 = scanner.nextInt();

            double resultat = diviser(nombre1, nombre2);
            System.out.println("Le resultat de la division est : " + resultat);

        } catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erreur : veuillez entrer uniquement des entiers.");
        } finally {
            scanner.close();
        }
    }
}
