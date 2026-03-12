package chapitre9;

import java.util.ArrayList;
import java.util.List;

/**
 * Lance l'exercice 93 et applique plusieurs regles sur un prix initial.
 */
public class Exercice93 {

    /**
     * Point d'entree du programme.
     *
     * @param args un tableau de chaines de caracteres contenant les arguments de la ligne de commande
     */
    public static void main(String[] args) {

        List<ReglePrix> regles = new ArrayList<>();

        regles.add(new RemiseFixe(10));
        regles.add(new RemisePourcentage(0.20, 15));
        regles.add(new TVA(0.20));

        CalculateurPrix calculateur = new CalculateurPrix();

        double prixInitial = 100;
        double prixFinal = calculateur.appliquerToutes(regles, prixInitial);

        System.out.println("Prix initial : " + prixInitial + " €");
        System.out.println("Prix final : " + prixFinal + " €");

    }

}
