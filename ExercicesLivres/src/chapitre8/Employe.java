package chapitre8;

/**
 * Represente un employe de maniere abstraite.
 */
public abstract class Employe {

    private String nom;

    /**
     * Cree un employe avec un nom.
     *
     * @param nom une chaine de caracteres correspondant au nom de l'employe
     */
    public Employe(String nom) {
        setNom(nom);
    }

    /**
     * Retourne le nom de l'employe.
     *
     * @return une chaine de caracteres correspondant au nom de l'employe
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Modifie le nom de l'employe.
     *
     * @param nom une chaine de caracteres correspondant au nom de l'employe
     */
    public void setNom(String nom) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("Le nom ne peut pas être vide");
        }
        this.nom = nom;
    }

    /**
     * Calcule le salaire de l'employe.
     *
     * @return un double correspondant au salaire de l'employe
     */
    public abstract double calculerSalaire();
}
