package chapitre11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercice113 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Cette variable permet de répéter la saisie tant qu'une erreur est détectée.
            boolean saisieValide = false;

            while (!saisieValide) {
                System.out.print("Entrez un entier a : ");

                try {
                    // Lecture du premier entier.
                    int a = scanner.nextInt();

                    System.out.print("Entrez un entier b : ");

                    // Lecture du second entier.
                    int b = scanner.nextInt();

                    // La division peut déclencher une ArithmeticException si b vaut 0.
                    int resultat = a / b;
                    System.out.println("Le resultat de la division est : " + resultat);

                    // Si tout se passe bien, on sort de la boucle.
                    saisieValide = true;

                } catch (InputMismatchException e) {
                    // Ce bloc s'exécute si l'utilisateur ne saisit pas un entier.
                    System.out.println("Erreur : veuillez saisir uniquement des entiers.");

                    // On vide l'entrée invalide pour éviter une boucle infinie sur la même erreur.
                    scanner.nextLine();
                } catch (ArithmeticException e) {
                    // Ce bloc s'exécute si l'utilisateur tente une division par zéro.
                    System.out.println("Erreur : division par zero impossible.");
                }
            }
        } finally {
            // Ce bloc s'exécute dans tous les cas pour fermer le scanner proprement.
            System.out.println("Fin du programme");
            scanner.close();
        }
    }
}
