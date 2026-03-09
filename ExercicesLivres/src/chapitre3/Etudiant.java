package chapitre3;

public class Etudiant {

    private String nom;
    private double moyenne;

    public Etudiant(String nom, double moyenne) {
        setNom(nom);
        setMoyenne(moyenne);
    }

    public void setNom(String nom) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("Nom invalide");
        }
        this.nom = nom;
    }

    public void setMoyenne(double moyenne) {
        if (moyenne < 0 || moyenne > 20) {
            throw new IllegalArgumentException("Moyenne invalide");
        }
        this.moyenne = moyenne;
    }

    public void ajouterPoints(double points) {
        setMoyenne(this.moyenne + points);
    }

    public boolean aLaMoyenne() {
        return moyenne >= 10;
    }

    public String getNom() {
        return nom;
    }

    public double getMoyenne() {
        return moyenne;
    }
}