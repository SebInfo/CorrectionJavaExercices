package chapitre9;

/**
 * Gere l'envoi de notifications en s'appuyant sur un service de messagerie.
 */
public class NotificationService {

    private MessageService messageService;

    /**
     * Cree un service de notification avec une dependance de type MessageService.
     *
     * @param messageService un objet MessageService utilise pour envoyer les messages
     */
    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    /**
     * Envoie une notification.
     *
     * @param message une chaine de caracteres correspondant au message a envoyer
     */
    public void envoyer(String message) {
        this.messageService.send(message);
    }

}
