package chapitre9;

/**
 * Represente un service d'envoi de messages par SMS.
 */
public class SMSService implements MessageService {

    /**
     * Envoie un message par SMS.
     *
     * @param message une chaine de caracteres correspondant au message a envoyer
     */
    @Override
    public void send(String message) {
        System.out.println("Envoi d'un SMS : " + message);
    }

}
