package chapitre7;

import java.util.Locale;

/**
 * Represente la vue de l'exercice 73 dans une architecture MVC.
 */
public class Exercice73 {

    /**
     * Lance le programme et affiche le solde final du compte bancaire.
     *
     * @param args un tableau de chaines de caracteres contenant les arguments de la ligne de commande
     */
    public static void main(String[] args) {

        CompteBancaire compte = new CompteBancaire("Alice Dupont", 500.00);
        CompteController controller = new CompteController();

        controller.deposer(compte, 150.00);
        controller.retirer(compte, 200.00);

        double solde = controller.consulterSolde(compte);

        System.out.println("Titulaire : " + compte.getTitulaire());
        System.out.printf(Locale.FRANCE, "Solde : %.2f €%n", solde);
    }
}
