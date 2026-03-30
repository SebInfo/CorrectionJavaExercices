package chapitre12;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Exercice125 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:8889/bibliotheque";
        String user = "root";
        String password = "root";

        try {

            // Connexion à la base de données
            Connection connection =
                DriverManager.getConnection(url, user, password);

            // Création d'un objet Statement
            Statement statement = connection.createStatement();

            // Exécution de la requête SQL
            ResultSet result =
                statement.executeQuery("SELECT id, titre, auteur FROM livre");

            // Lecture des résultats
            while (result.next()) {

                int id = result.getInt("id");
                String titre = result.getString("titre");
                String auteur = result.getString("auteur");

                System.out.println(id + " - " + titre + " - " + auteur);
            }

            // Fermeture de la connexion
            connection.close();

        } catch (SQLException e) {

            System.out.println("Erreur lors de la connexion à la base");
            e.printStackTrace();

        }
    }
}