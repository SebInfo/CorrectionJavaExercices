package chapitre12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercice122 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter("src/chapitre12/livres.txt"));

            for (int i = 1; i <= 3; i++) {
                System.out.print("Entrez le nom du livre " + i + " : ");
                String livre = scanner.nextLine();
                writer.write(livre);
                writer.newLine();
            }

            System.out.println("Les donnees ont ete enregistrees avec succes.");

        } catch (IOException e) {
            System.out.println("Erreur lors de l'ecriture du fichier : " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Erreur lors de la fermeture du fichier : " + e.getMessage());
                }
            }
            scanner.close();
        }
    }
}
