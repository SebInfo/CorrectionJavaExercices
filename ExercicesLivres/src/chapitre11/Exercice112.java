package chapitre11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercice112 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez le nom : ");
            String nom = scanner.nextLine();

            System.out.print("Entrez l'age : ");
            int age = scanner.nextInt();

            Personne personne = new Personne(nom, age);
            System.out.println("Personne creee : " + personne.getNom() + ", " + personne.getAge() + " ans.");

        } catch (AgeInvalideException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erreur : veuillez entrer un age entier valide.");
        }

        System.out.println("Le programme continue son execution.");
        scanner.close();
    }
}
