package chapitre8;

/**
 * Lance l'exercice 81 et affiche le salaire de plusieurs employes.
 */
public class Exercice81 {

    /**
     * Point d'entree du programme.
     *
     * @param args un tableau de chaines de caracteres contenant les arguments de la ligne de commande
     */
    public static void main(String[] args) {

        Employe[] employes = new Employe[3];

        employes[0] = new EmployeTempsPlein("Alice", 3000);
        employes[1] = new EmployeFreelance("Bob", 50, 120);
        employes[2] = new EmployeFreelance("Charlie", 60, 80);

        for (Employe e : employes) {
            System.out.println(e.getNom() + " gagne " + e.calculerSalaire() + " €");
        }
    }
}
