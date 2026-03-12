package chapitre8;

/**
 * Represente un employe freelance remunere selon un taux horaire.
 */
public class EmployeFreelance extends Employe {

    private double tauxHoraire;
    private int heuresTravaillees;

    /**
     * Cree un employe freelance avec un nom, un taux horaire et un nombre d'heures travaillees.
     *
     * @param nom une chaine de caracteres correspondant au nom de l'employe
     * @param tauxHoraire un double correspondant au taux horaire de l'employe
     * @param heuresTravaillees un int correspondant au nombre d'heures travaillees
     */
    public EmployeFreelance(String nom, double tauxHoraire, int heuresTravaillees) {
        super(nom);
        setTauxHoraire(tauxHoraire);
        setHeuresTravaillees(heuresTravaillees);
    }

    /**
     * Retourne le taux horaire de l'employe.
     *
     * @return un double correspondant au taux horaire de l'employe
     */
    public double getTauxHoraire() {
        return this.tauxHoraire;
    }

    /**
     * Modifie le taux horaire de l'employe.
     *
     * @param tauxHoraire un double correspondant au taux horaire de l'employe
     */
    public void setTauxHoraire(double tauxHoraire) {
        if (tauxHoraire < 0) {
            throw new IllegalArgumentException("Le taux horaire doit être positif");
        }
        this.tauxHoraire = tauxHoraire;
    }

    /**
     * Retourne le nombre d'heures travaillees par l'employe.
     *
     * @return un int correspondant au nombre d'heures travaillees
     */
    public int getHeuresTravaillees() {
        return this.heuresTravaillees;
    }

    /**
     * Modifie le nombre d'heures travaillees par l'employe.
     *
     * @param heuresTravaillees un int correspondant au nombre d'heures travaillees
     */
    public void setHeuresTravaillees(int heuresTravaillees) {
        if (heuresTravaillees < 0) {
            throw new IllegalArgumentException("Le nombre d'heures doit être positif");
        }
        this.heuresTravaillees = heuresTravaillees;
    }

    /**
     * Calcule le salaire de l'employe freelance.
     *
     * @return un double correspondant au produit du taux horaire par les heures travaillees
     */
    @Override
    public double calculerSalaire() {
        return this.tauxHoraire * this.heuresTravaillees;
    }
}
