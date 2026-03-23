package chapitre17;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestConnexion {

    private static final Logger LOGGER = LogUtil.getLogger();

    public static void main(String[] args) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            LOGGER.info("Connexion reussie a la base de donnees.");
            System.out.println("Connexion reussie a la base de donnees.");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erreur de connexion a la base de donnees.", e);
            System.out.println("Erreur de connexion a la base : " + e.getMessage());
        }
    }
}
