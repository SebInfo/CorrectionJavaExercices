package chapitre11;

public class Personne {

    private String nom;
    private int age;

    public Personne(String nom, int age) throws AgeInvalideException {
        if (age < 0) {
            throw new AgeInvalideException("L'age ne peut pas etre negatif.");
        }
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }
}
