package chapitre7;

/**
 * Gere les actions appliquees a un produit.
 */
public class ProduitController {

    /**
     * Demande au modele d'appliquer une remise sur le produit.
     *
     * @param produit un objet Produit sur lequel appliquer la remise
     * @param pourcentage un double correspondant au pourcentage de remise
     */
    public void appliquerRemise(Produit produit, double pourcentage) {
        produit.appliquerRemise(pourcentage);
    }
}
