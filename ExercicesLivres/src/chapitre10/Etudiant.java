package chapitre10;

public class Etudiant {

    private String nom;
    private int age;

    public Etudiant(String nom, int age) {
        setNom(nom);
        setAge(age);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("L'âge doit être positif");
        }
        this.age = age;
    }

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", age=" + age + "]";
	}

}