package chapitre17;

/**
 * Représente un adhérent avec ses informations d'identification
 * et de contact.
 */
public class Adherent {

    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;

    /**
     * Construit un adhérent vide.
     */
    public Adherent() {
    }

    /**
     * Construit un adhérent sans identifiant.
     *
     * @param nom le nom de l'adhérent
     * @param prenom le prénom de l'adhérent
     * @param email l'adresse e-mail de l'adhérent
     * @param telephone le numéro de téléphone de l'adhérent
     */
    public Adherent(String nom, String prenom, String email, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }

    /**
     * Construit un adhérent avec identifiant.
     *
     * @param id l'identifiant de l'adhérent
     * @param nom le nom de l'adhérent
     * @param prenom le prénom de l'adhérent
     * @param email l'adresse e-mail de l'adhérent
     * @param telephone le numéro de téléphone de l'adhérent
     */
    public Adherent(int id, String nom, String prenom, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }

    /**
     * Retourne l'identifiant de l'adhérent.
     *
     * @return l'identifiant
     */
    public int getId() {
        return id;
    }

    /**
     * Modifie l'identifiant de l'adhérent.
     *
     * @param id le nouvel identifiant
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retourne le nom de l'adhérent.
     *
     * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom de l'adhérent.
     *
     * @param nom le nouveau nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le prénom de l'adhérent.
     *
     * @return le prénom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Modifie le prénom de l'adhérent.
     *
     * @param prenom le nouveau prénom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Retourne l'adresse e-mail de l'adhérent.
     *
     * @return l'adresse e-mail
     */
    public String getEmail() {
        return email;
    }

    /**
     * Modifie l'adresse e-mail de l'adhérent.
     *
     * @param email la nouvelle adresse e-mail
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retourne le numéro de téléphone de l'adhérent.
     *
     * @return le numéro de téléphone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Modifie le numéro de téléphone de l'adhérent.
     *
     * @param telephone le nouveau numéro de téléphone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Retourne une représentation textuelle simple de l'adhérent.
     *
     * @return le nom complet de l'adhérent
     */
    @Override
    public String toString() {
        return nom + " " + prenom;
    }
}
