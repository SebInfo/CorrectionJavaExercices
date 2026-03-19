package chapitre11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercice114 {

    public static void verifierNote(double note) {
        if (note < 0 || note > 20) {
            throw new IllegalArgumentException("La note doit etre comprise entre 0 et 20.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez une note : ");
            double note = scanner.nextDouble();

            verifierNote(note);
            System.out.println("Note enregistree");

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erreur : veuillez saisir un nombre valide.");
        } finally {
            scanner.close();
        }
    }
}
