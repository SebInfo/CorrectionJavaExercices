package chapitre6;

public class Etudiant {

    private String nom;
    private String prenom;
    private int age;
    private double moyenne;

    public Etudiant(String nom, String prenom, int age, double moyenne) {
        setNom(nom);
        setPrenom(prenom);
        setAge(age);
        setMoyenne(moyenne);
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        if (nom != null && !nom.isBlank()) {
            this.nom = nom;
        }
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        if (prenom != null && !prenom.isBlank()) {
            this.prenom = prenom;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public double getMoyenne() {
        return this.moyenne;
    }

    public void setMoyenne(double moyenne) {
        if (moyenne >= 0 && moyenne <= 20) {
            this.moyenne = moyenne;
        }
    }

    public void afficherInformations() {
        System.out.println("Nom : " + this.nom);
        System.out.println("Prénom : " + this.prenom);
        System.out.println("Age : " + this.age);
        System.out.println("Moyenne : " + this.moyenne);
    }

    @Override
    public String toString() {
        return "Etudiant[nom=" + this.nom
                + ", prenom=" + this.prenom
                + ", age=" + this.age
                + ", moyenne=" + this.moyenne + "]";
    }
}