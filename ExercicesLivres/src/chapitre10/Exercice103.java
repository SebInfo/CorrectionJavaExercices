package chapitre10;

import java.util.HashSet;
import java.util.Set;

public class Exercice103 {

    public static void main(String[] args) {

        Produit p1 = new Produit("P1", "Clavier");
        Produit p2 = new Produit("P2", "Souris");
        Produit p3 = new Produit("P3", "Écran");

        // même référence que p1
        Produit p4 = new Produit("P1", "Clavier mécanique");

        System.out.println("=== Tests d'égalité ===");

        System.out.println("p1 == p4 : " + (p1 == p4));
        System.out.println("p1.equals(p4) : " + p1.equals(p4));

        System.out.println("hashCode p1 : " + p1.hashCode());
        System.out.println("hashCode p4 : " + p4.hashCode());

        System.out.println();

        System.out.println("=== Test avec HashSet ===");

        Set<Produit> produits = new HashSet<>();

        produits.add(p1);
        produits.add(p2);
        produits.add(p3);
        produits.add(p4); // même référence logique que p1

        System.out.println("Nombre de produits dans le HashSet : " + produits.size());

        for (Produit p : produits) {
            System.out.println(p);
        }

    }

}