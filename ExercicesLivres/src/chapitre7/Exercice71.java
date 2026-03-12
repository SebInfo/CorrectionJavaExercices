package chapitre7;

/**
 * Represente la vue de l'exercice 71 dans une architecture MVC.
 */
public class Exercice71 {

    /**
     * Lance le programme et affiche la decision retournee par le controleur.
     *
     * @param args un tableau de chaines de caracteres contenant les arguments de la ligne de commande
     */
    public static void main(String[] args) {

        Etudiant etudiant = new Etudiant(12.5);

        EtudiantController controller = new EtudiantController();
        String decision = controller.genererDecision(etudiant);

        System.out.println(decision);
    }
}
