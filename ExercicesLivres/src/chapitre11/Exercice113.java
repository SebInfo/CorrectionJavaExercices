package chapitre11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercice113 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            boolean saisieValide = false;

            while (!saisieValide) {
                System.out.print("Entrez un entier a : ");

                try {
                    int a = scanner.nextInt();

                    System.out.print("Entrez un entier b : ");
                    int b = scanner.nextInt();

                    int resultat = a / b;
                    System.out.println("Le resultat de la division est : " + resultat);
                    saisieValide = true;

                } catch (InputMismatchException | ArithmeticException e) {
                    if (e instanceof InputMismatchException) {
                        System.out.println("Erreur : veuillez saisir uniquement des entiers.");
                        scanner.nextLine();
                    } else {
                        System.out.println("Erreur : division par zero impossible.");
                    }
                }
            }
        } finally {
            System.out.println("Fin du programme");
            scanner.close();
        }
    }
}
