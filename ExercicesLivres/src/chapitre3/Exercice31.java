package chapitre3;

public class Exercice31 {

    public static void main(String[] args) {

        // Création du livre
        Livre livre = new Livre("1984", "George Orwell");

        // Etat initial
        System.out.println("Livre emprunte ? " + livre.estEmprunte());

        // Emprunt du livre
        livre.emprunter();
        System.out.println("Livre emprunte ? " + livre.estEmprunte());

        // Retour du livre
        livre.rendre();
        System.out.println("Livre emprunte ? " + livre.estEmprunte());

    }

}