package chapitre10;

public abstract class Animal {

    private String nom;

    public Animal(String nom) {
        setNom(nom);
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

    public abstract void crier();

}