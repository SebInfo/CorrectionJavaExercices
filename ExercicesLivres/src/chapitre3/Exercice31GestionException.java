package chapitre3;


public class Exercice31GestionException {

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

        System.out.println("\n--- Test des exceptions ---");

        // 1. Test : emprunter deux fois
        try {
            livre.emprunter();
            livre.emprunter(); // doit déclencher l'exception
        } catch (IllegalStateException e) {
            System.out.println("Exception capturée : " + e.getMessage());
        }

        // 2. Test : rendre un livre non emprunté
        try {
            livre.rendre(); // premier retour
            livre.rendre(); // deuxième retour -> exception
        } catch (IllegalStateException e) {
            System.out.println("Exception capturée : " + e.getMessage());
        }

        // 3. Test : titre invalide
        try {
            Livre livre2 = new Livre("", "Victor Hugo");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception capturée : " + e.getMessage());
        }

        // 4. Test : auteur invalide
        try {
            Livre livre3 = new Livre("Les Misérables", null);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception capturée : " + e.getMessage());
        }

    }

}