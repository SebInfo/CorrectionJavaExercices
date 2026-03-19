package chapitre10;

import java.util.Objects;

public class Produit {

    private String reference;
    private String nom;

    public Produit(String reference, String nom) {
        setReference(reference);
        setNom(nom);
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        if (reference == null || reference.isBlank()) {
            throw new IllegalArgumentException("La référence ne peut pas être vide");
        }
        this.reference = reference;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("Le nom ne peut pas être vide");
        }
        this.nom = nom;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Produit autre = (Produit) obj;

        return reference.equals(autre.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "reference='" + reference + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }

}
