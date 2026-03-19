package chapitre10;

import java.util.ArrayList;
import java.util.List;

public class Exercice101 {

    public static void main(String[] args) {

        List<Etudiant> etudiants = new ArrayList<>();

        etudiants.add(new Etudiant("Alice", 20));
        etudiants.add(new Etudiant("Bob", 22));
        etudiants.add(new Etudiant("Charlie", 19));

        for (Etudiant etudiant : etudiants) {
            System.out.println( etudiant);
        }

    }
}