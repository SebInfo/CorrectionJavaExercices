package chapitre12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercice121 {

    public static void main(String[] args) {
        BufferedReader lecteur = null;
        int nombreLignes = 0;

        try {
            lecteur = new BufferedReader(new FileReader("src/chapitre12/notes.txt"));

            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
                nombreLignes++;
            }

            System.out.println("Nombre de lignes : " + nombreLignes);

        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        } finally {
            if (lecteur != null) {
                try {
                    lecteur.close();
                } catch (IOException e) {
                    System.out.println("Erreur lors de la fermeture du fichier : " + e.getMessage());
                }
            }
        }
    }
}
