package chapitre7;

/**
 * Gere la logique de decision liee a un etudiant.
 */
public class EtudiantController {

    /**
     * Genere le message de decision a partir de l'etat de l'etudiant.
     *
     * @param etudiant un objet Etudiant a analyser
     * @return une chaine de caracteres correspondant a la decision
     */
    public String genererDecision(Etudiant etudiant) {

        if (etudiant.estAdmis()) {
            return "Admis";
        }

        return "Ajourné";
    }
}
