package chapitre17;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Fournit les traitements métier liés aux adhérents.
 */
public class AdherentService {

    private static final Logger LOGGER = LogUtil.getLogger();
    private AdherentDao adherentDao;

    /**
     * Construit le service en initialisant l'implémentation du DAO.
     */
    public AdherentService() {
        adherentDao = new AdherentDaoImpl();
    }

    /**
     * Ajoute un adhérent après validation de ses données.
     *
     * @param adherent l'adhérent à ajouter
     * @throws DaoException en cas d'erreur de validation ou d'accès aux données
     */
    public void ajouterAdherent(Adherent adherent) throws DaoException {
        valider(adherent);
        adherentDao.ajouter(adherent);
    }

    /**
     * Retourne la liste des adhérents.
     *
     * @return la liste des adhérents
     * @throws DaoException en cas d'erreur d'accès aux données
     */
    public List<Adherent> listerAdherents() throws DaoException {
        return adherentDao.lister();
    }

    /**
     * Modifie un adhérent après validation de ses données.
     *
     * @param adherent l'adhérent à modifier
     * @throws DaoException en cas d'erreur de validation ou d'accès aux données
     */
    public void modifierAdherent(Adherent adherent) throws DaoException {
        valider(adherent);
        adherentDao.modifier(adherent);
    }

    /**
     * Supprime un adhérent à partir de son identifiant.
     *
     * @param id l'identifiant de l'adhérent à supprimer
     * @throws DaoException en cas d'erreur d'accès aux données
     */
    public void supprimerAdherent(int id) throws DaoException {
        LOGGER.log(Level.INFO, "Demande de suppression de l'adherent id={0}", id);
        adherentDao.supprimer(id);
    }

    /**
     * Vérifie que les données obligatoires de l'adhérent sont valides.
     *
     * @param adherent l'adhérent à valider
     * @throws DaoException si une donnée obligatoire est absente ou invalide
     */
    private void valider(Adherent adherent) throws DaoException {
        if (adherent == null) {
            LOGGER.warning("Validation impossible : adherent null.");
            throw new DaoException("L'adherent est obligatoire.");
        }

        if (adherent.getNom() == null || adherent.getNom().trim().isEmpty()) {
            LOGGER.warning("Validation echouee : nom obligatoire.");
            throw new DaoException("Le nom est obligatoire.");
        }

        if (adherent.getPrenom() == null || adherent.getPrenom().trim().isEmpty()) {
            LOGGER.warning("Validation echouee : prenom obligatoire.");
            throw new DaoException("Le prenom est obligatoire.");
        }

        if (adherent.getEmail() == null || adherent.getEmail().trim().isEmpty()) {
            LOGGER.warning("Validation echouee : email obligatoire.");
            throw new DaoException("L'email est obligatoire.");
        }

        if (!adherent.getEmail().contains("@")) {
            LOGGER.warning("Validation echouee : adresse email invalide.");
            throw new DaoException("L'adresse email n'est pas valide.");
        }
    }
}
