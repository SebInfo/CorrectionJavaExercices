package chapitre17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implémentation JDBC du DAO des adhérents.
 */
public class AdherentDaoImpl implements AdherentDao {

    private static final Logger LOGGER = LogUtil.getLogger();

    /**
     * Ajoute un adhérent dans la base de données.
     *
     * @param adherent l'adhérent à ajouter
     * @throws DaoException en cas d'erreur d'accès aux données
     */
    @Override
    public void ajouter(Adherent adherent) throws DaoException {
        String sql = "INSERT INTO adherent(nom, prenom, email, telephone) VALUES (?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, adherent.getNom());
            statement.setString(2, adherent.getPrenom());
            statement.setString(3, adherent.getEmail());
            statement.setString(4, adherent.getTelephone());

            statement.executeUpdate();
            LOGGER.log(Level.INFO, "Adherent ajoute : {0} {1}",
                    new Object[] { adherent.getNom(), adherent.getPrenom() });

        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erreur lors de l'ajout de l'adherent.", e);
            throw new DaoException("Erreur lors de l'ajout de l'adherent.", e);
        }
    }

    /**
     * Lit tous les adhérents triés par nom puis prénom.
     *
     * @return la liste des adhérents
     * @throws DaoException en cas d'erreur d'accès aux données
     */
    @Override
    public List<Adherent> lister() throws DaoException {
        List<Adherent> adherents = new ArrayList<>();
        String sql = "SELECT id, nom, prenom, email, telephone FROM adherent ORDER BY nom, prenom";

        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Adherent adherent = new Adherent(
                        resultSet.getInt("id"),
                        resultSet.getString("nom"),
                        resultSet.getString("prenom"),
                        resultSet.getString("email"),
                        resultSet.getString("telephone"));
                adherents.add(adherent);
            }

            LOGGER.log(Level.INFO, "Nombre d'adherents lus : {0}", adherents.size());

        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erreur lors de la lecture des adherents.", e);
            throw new DaoException("Erreur lors de la lecture des adherents.", e);
        }

        return adherents;
    }

    /**
     * Met à jour les informations d'un adhérent.
     *
     * @param adherent l'adhérent à modifier
     * @throws DaoException en cas d'erreur d'accès aux données
     */
    @Override
    public void modifier(Adherent adherent) throws DaoException {
        String sql = "UPDATE adherent SET nom = ?, prenom = ?, email = ?, telephone = ? WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, adherent.getNom());
            statement.setString(2, adherent.getPrenom());
            statement.setString(3, adherent.getEmail());
            statement.setString(4, adherent.getTelephone());
            statement.setInt(5, adherent.getId());

            int lignesModifiees = statement.executeUpdate();
            LOGGER.log(Level.INFO, "Modification adherent id={0}, lignes touchees={1}",
                    new Object[] { adherent.getId(), lignesModifiees });

        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erreur lors de la modification de l'adherent.", e);
            throw new DaoException("Erreur lors de la modification de l'adherent.", e);
        }
    }

    /**
     * Supprime un adhérent à partir de son identifiant.
     *
     * @param id l'identifiant de l'adhérent à supprimer
     * @throws DaoException en cas d'erreur d'accès aux données
     */
    @Override
    public void supprimer(int id) throws DaoException {
        String sql = "DELETE FROM adherent WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);
            int lignesSupprimees = statement.executeUpdate();
            LOGGER.log(Level.INFO, "Suppression adherent id={0}, lignes touchees={1}",
                    new Object[] { id, lignesSupprimees });

        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erreur lors de la suppression de l'adherent.", e);
            throw new DaoException("Erreur lors de la suppression de l'adherent.", e);
        }
    }

    /**
     * Recherche un adhérent à partir de son identifiant.
     *
     * @param id l'identifiant recherché
     * @return l'adhérent trouvé, ou {@code null} s'il n'existe pas
     * @throws DaoException en cas d'erreur d'accès aux données
     */
    @Override
    public Adherent rechercherParId(int id) throws DaoException {
        String sql = "SELECT id, nom, prenom, email, telephone FROM adherent WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    LOGGER.log(Level.INFO, "Adherent trouve pour id={0}", id);
                    return new Adherent(
                            resultSet.getInt("id"),
                            resultSet.getString("nom"),
                            resultSet.getString("prenom"),
                            resultSet.getString("email"),
                            resultSet.getString("telephone"));
                }
            }

            LOGGER.log(Level.INFO, "Aucun adherent trouve pour id={0}", id);

        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erreur lors de la recherche de l'adherent.", e);
            throw new DaoException("Erreur lors de la recherche de l'adherent.", e);
        }

        return null;
    }
}
