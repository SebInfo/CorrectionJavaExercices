package chapitre17;

/**
 * Représente une erreur survenue dans la couche d'accès aux données.
 */
public class DaoException extends Exception {

    /**
     * Construit une exception DAO avec un message.
     *
     * @param message le message décrivant l'erreur
     */
    public DaoException(String message) {
        super(message);
    }

    /**
     * Construit une exception DAO avec un message et la cause d'origine.
     *
     * @param message le message décrivant l'erreur
     * @param cause l'exception à l'origine de l'erreur
     */
    public DaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
