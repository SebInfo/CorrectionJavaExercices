package chapitre17;

import java.util.List;

/**
 * Définit les opérations de gestion des adhérents.
 */
public interface AdherentDao {

    /**
     * Ajoute un adhérent.
     *
     * @param adherent l'adhérent à ajouter
     * @throws DaoException en cas d'erreur d'accès aux données
     */
    void ajouter(Adherent adherent) throws DaoException;

    /**
     * Retourne la liste des adhérents.
     *
     * @return la liste des adhérents
     * @throws DaoException en cas d'erreur d'accès aux données
     */
    List<Adherent> lister() throws DaoException;

    /**
     * Modifie un adhérent existant.
     *
     * @param adherent l'adhérent à modifier
     * @throws DaoException en cas d'erreur d'accès aux données
     */
    void modifier(Adherent adherent) throws DaoException;

    /**
     * Supprime un adhérent à partir de son identifiant.
     *
     * @param id l'identifiant de l'adhérent à supprimer
     * @throws DaoException en cas d'erreur d'accès aux données
     */
    void supprimer(int id) throws DaoException;

    /**
     * Recherche un adhérent par son identifiant.
     *
     * @param id l'identifiant recherché
     * @return l'adhérent trouvé, ou {@code null} s'il n'existe pas
     * @throws DaoException en cas d'erreur d'accès aux données
     */
    Adherent rechercherParId(int id) throws DaoException;
}
