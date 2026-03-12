package chapitre9;

/**
 * Represente un service d'envoi de messages par email.
 */
public class EmailService implements MessageService {

    /**
     * Envoie un message par email.
     *
     * @param message une chaine de caracteres correspondant au message a envoyer
     */
    @Override
    public void send(String message) {
        System.out.println("Envoi d'un email : " + message);
    }

}
