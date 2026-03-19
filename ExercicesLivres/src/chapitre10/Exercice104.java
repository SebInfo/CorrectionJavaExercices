package chapitre10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Illustre le tri d'une liste de produits avec Comparable et Comparator.
 */
public class Exercice104 {

    /**
     * Point d'entree de l'exercice.
     *
     * @param args arguments de la ligne de commande
     */
    public static void main(String[] args) {
    	
    	// J'utilise ProduitBis pour éviter le conflit avec l'exercice précédent étant dans le même package

        List<ProduitBis> produits = new ArrayList<>();

        produits.add(new ProduitBis("P1", "Clavier", 29.99));
        produits.add(new ProduitBis("P2", "Souris", 19.50));
        produits.add(new ProduitBis("P3", "Écran", 149.90));
        produits.add(new ProduitBis("P4", "Webcam", 49.99));

        System.out.println("=== Liste avant tri ===");
        for (ProduitBis produit : produits) {
            System.out.println(produit);
        }

        Collections.sort(produits);

        System.out.println();
        System.out.println("=== Liste après tri par prix croissant (Comparable) ===");
        for (ProduitBis produit : produits) {
            System.out.println(produit);
        }

        Comparator<ProduitBis> comparateurNom = Comparator.comparing(ProduitBis::getNom);

        produits.sort(comparateurNom);

        System.out.println();
        System.out.println("=== Liste après tri par nom (Comparator) ===");
        for (ProduitBis produit : produits) {
            System.out.println(produit);
        }
    }

}
