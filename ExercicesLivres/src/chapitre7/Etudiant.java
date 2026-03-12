package chapitre7;

/**
 * Represente un etudiant avec sa moyenne generale.
 */
public class Etudiant {

    private double moyenne;

    /**
     * Cree un etudiant avec une moyenne initiale.
     *
     * @param moyenne un double correspondant a la moyenne de l'etudiant
     */
    public Etudiant(double moyenne) {
        setMoyenne(moyenne);
    }

    /**
     * Retourne la moyenne de l'etudiant.
     *
     * @return un double correspondant a la moyenne de l'etudiant
     */
    public double getMoyenne() {
        return this.moyenne;
    }

    /**
     * Modifie la moyenne de l'etudiant si elle est comprise entre 0 et 20.
     *
     * @param moyenne un double correspondant a la nouvelle moyenne de l'etudiant
     */
    public void setMoyenne(double moyenne) {
        // Validation simple (sans exceptions à ce stade)
        if (moyenne >= 0 && moyenne <= 20) {
            this.moyenne = moyenne;
        }
    }

    /**
     * Indique si l'etudiant est admis.
     *
     * @return un booleen indiquant si la moyenne est superieure ou egale a 10
     */
    public boolean estAdmis() {
        return this.moyenne >= 10;
    }
}
