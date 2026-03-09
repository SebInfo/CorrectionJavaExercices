package chapitre3;
/**
 * Représente un livre dans un système de bibliothèque.
 * 
 * Un livre possède un titre, un auteur et un état indiquant
 * s'il est actuellement emprunté ou non.
 * 
 */
public class Livre {

    /** Titre du livre. */
    private String titre;

    /** Nom de l'auteur du livre. */
    private String auteur;

    /** Indique si le livre est actuellement emprunté. */
    private boolean emprunte;

    /**
     * Construit un nouveau livre non emprunté.
     *
     * @param titre  le titre du livre
     * @param auteur le nom de l'auteur
     * @throws IllegalArgumentException si le titre ou l'auteur est nul ou vide
     */
    public Livre(String titre, String auteur) {
        setTitre(titre);
        setAuteur(auteur);
        this.emprunte = false;
    }

    /**
     * Définit le titre du livre.
     *
     * @param titre le nouveau titre
     * @throws IllegalArgumentException si le titre est nul, vide ou ne contient que des espaces
     */
    public void setTitre(String titre) {
        if (titre == null || titre.isBlank()) {
            throw new IllegalArgumentException("Titre invalide");
        }
        this.titre = titre;
    }

    /**
     * Définit l'auteur du livre.
     *
     * @param auteur le nom du nouvel auteur
     * @throws IllegalArgumentException si l'auteur est nul, vide ou ne contient que des espaces
     */
    public void setAuteur(String auteur) {
        if (auteur == null || auteur.isBlank()) {
            throw new IllegalArgumentException("Auteur invalide");
        }
        this.auteur = auteur;
    }

    /**
     * Marque le livre comme emprunté.
     *
     * @throws IllegalStateException si le livre est déjà emprunté
     */
    public void emprunter() {
        if (emprunte) {
            throw new IllegalStateException("Le livre est déjà emprunté");
        }
        emprunte = true;
    }

    /**
     * Marque le livre comme rendu.
     *
     * @throws IllegalStateException si le livre n'était pas emprunté
     */
    public void rendre() {
        if (!emprunte) {
            throw new IllegalStateException("Le livre n'est pas emprunté");
        }
        emprunte = false;
    }

    /**
     * Indique si le livre est actuellement emprunté.
     *
     * @return {@code true} si le livre est emprunté, sinon {@code false}
     */
    public boolean estEmprunte() {
        return emprunte;
    }

    /**
     * Retourne le titre du livre.
     *
     * @return le titre du livre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Retourne le nom de l'auteur du livre.
     *
     * @return l'auteur du livre
     */
    public String getAuteur() {
        return auteur;
    }
}