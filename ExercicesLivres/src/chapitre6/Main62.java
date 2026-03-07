package chap4;

public class Main42 {

	public static void main(String[] args) {

        CompteBancaire compte =
                new CompteBancaire("Alice Dupont", 500.0);

        System.out.println("Titulaire : " + compte.getTitulaire());
        System.out.println("Solde : " + compte.getSolde());

        // Tentative de solde invalide
        compte.setSolde(-200.0);

        System.out.println("Solde après tentative invalide : "
                + compte.getSolde());
    }

}
