package chapitre9;

/**
 * Lance l'exercice 92 et teste l'envoi de notifications avec plusieurs services.
 */
public class Exercice92 {

    /**
     * Point d'entree du programme.
     *
     * @param args un tableau de chaines de caracteres contenant les arguments de la ligne de commande
     */
    public static void main(String[] args) {

        MessageService service = new EmailService();
        NotificationService notificationService = new NotificationService(service);

        notificationService.envoyer("Bonjour, ceci est un message de test courriel.");
        
        MessageService service2 = new SMSService();
        NotificationService notificationService2 = new NotificationService(service2);

        notificationService2.envoyer("Bonjour, ceci est un message de test SMS.");

    }

}
