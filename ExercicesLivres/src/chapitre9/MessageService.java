package chapitre9;

/**
 * Definit le comportement commun des services d'envoi de messages.
 */
public interface MessageService {

    /**
     * Envoie un message.
     *
     * @param message une chaine de caracteres correspondant au message a envoyer
     */
    void send(String message);

}
