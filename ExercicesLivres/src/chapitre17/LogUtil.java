package chapitre17;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogUtil {

    private static final Logger LOGGER = Logger.getLogger("GestionAdherentsLogger");

    static {
        try {
            FileHandler fileHandler = new FileHandler("application.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
            LOGGER.setLevel(Level.ALL);
            LOGGER.setUseParentHandlers(false);
        } catch (IOException e) {
            System.err.println("Impossible de configurer le fichier de log.");
        }
    }

    private LogUtil() {
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}
