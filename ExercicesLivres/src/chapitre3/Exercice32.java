package chapitre3;

public class Exercice32 {

    public static void main(String[] args) {

        Etudiant etudiant = new Etudiant("Alice", 12);

        System.out.println(etudiant.getNom() + " a la moyenne ? " + etudiant.aLaMoyenne());

        etudiant.ajouterPoints(2);

        System.out.println("Nouvelle moyenne : " + etudiant.getMoyenne());
    }
}