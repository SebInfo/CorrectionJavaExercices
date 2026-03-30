package chapitre12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercice123 {

    public static void main(String[] args) {
        BufferedReader lecteur = null;

        try {
            lecteur = new BufferedReader(new FileReader("src/chapitre12/livres.csv"));

            String ligne = lecteur.readLine();

            while ((ligne = lecteur.readLine()) != null) {
                String[] colonnes = ligne.split(";");

                if (colonnes.length == 2) {
                    Livre livre = new Livre(colonnes[0], colonnes[1]);
                    System.out.println("Titre : " + livre.getTitre() + ", Auteur : " + livre.getAuteur());
                }
            }

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
