package chap2;
import java.util.Scanner;

public class Exercice21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisir un nombre entier : ");
        int nombre = scanner.nextInt();

        // Analyse du signe
        if (nombre > 0) {
            System.out.println("Le nombre est positif.");
        } else if (nombre < 0) {
            System.out.println("Le nombre est négatif.");
        } else {
            System.out.println("Le nombre est nul.");
        }

        // Analyse de la parité
        if (nombre % 2 == 0) {
            System.out.println("Le nombre est pair.");
        } else {
            System.out.println("Le nombre est impair.");
        }

        // Extension : cas spécifique
        if (nombre > 0 && nombre % 2 == 0) {
            System.out.println("Le nombre est positif et pair.");
        }

        scanner.close();
    }
}