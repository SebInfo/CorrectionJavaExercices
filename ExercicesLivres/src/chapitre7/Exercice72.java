package chapitre7;

/**
 * Represente la vue de l'exercice 72 dans une architecture MVC.
 */
public class Exercice72 {

    /**
     * Lance le programme et affiche le prix du produit apres remise.
     *
     * @param args un tableau de chaines de caracteres contenant les arguments de la ligne de commande
     */
    public static void main(String[] args) {

        Produit produit = new Produit("Clavier", 49.99);

        ProduitController controller = new ProduitController();
        controller.appliquerRemise(produit, 20);

        System.out.println("Produit : " + produit.getNom());
        System.out.printf("Prix après remise : %.2f €%n", produit.getPrix());
    }
}
