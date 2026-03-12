package chapitre7;

/**
 * Gere les operations appliquees a un compte bancaire.
 */
public class CompteController {

    /**
     * Demande au modele d'ajouter un montant au compte bancaire.
     *
     * @param compte un objet CompteBancaire sur lequel effectuer le depot
     * @param montant un double correspondant au montant a deposer
     */
    public void deposer(CompteBancaire compte, double montant) {
        compte.deposer(montant);
    }

    /**
     * Demande au modele de retirer un montant du compte bancaire.
     *
     * @param compte un objet CompteBancaire sur lequel effectuer le retrait
     * @param montant un double correspondant au montant a retirer
     */
    public void retirer(CompteBancaire compte, double montant) {
        compte.retirer(montant);
    }

    /**
     * Retourne le solde actuel du compte bancaire.
     *
     * @param compte un objet CompteBancaire dont on veut consulter le solde
     * @return un double correspondant au solde du compte bancaire
     */
    public double consulterSolde(CompteBancaire compte) {
        return compte.getSolde();
    }
}
