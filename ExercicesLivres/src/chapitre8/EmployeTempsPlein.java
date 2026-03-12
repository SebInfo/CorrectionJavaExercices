package chapitre8;

/**
 * Represente un employe remunere par un salaire mensuel fixe.
 */
public class EmployeTempsPlein extends Employe {

    private double salaireMensuel;

    /**
     * Cree un employe a temps plein avec un nom et un salaire mensuel.
     *
     * @param nom une chaine de caracteres correspondant au nom de l'employe
     * @param salaireMensuel un double correspondant au salaire mensuel fixe
     */
    public EmployeTempsPlein(String nom, double salaireMensuel) {
        super(nom);
        setSalaireMensuel(salaireMensuel);
    }

    /**
     * Retourne le salaire mensuel de l'employe.
     *
     * @return un double correspondant au salaire mensuel de l'employe
     */
    public double getSalaireMensuel() {
        return this.salaireMensuel;
    }

    /**
     * Modifie le salaire mensuel de l'employe.
     *
     * @param salaireMensuel un double correspondant au salaire mensuel de l'employe
     */
    public void setSalaireMensuel(double salaireMensuel) {
        if (salaireMensuel < 0) {
            throw new IllegalArgumentException("Le salaire doit être positif");
        }
        this.salaireMensuel = salaireMensuel;
    }

    /**
     * Calcule le salaire de l'employe a temps plein.
     *
     * @return un double correspondant au salaire mensuel fixe
     */
    @Override
    public double calculerSalaire() {
        return this.salaireMensuel;
    }
}
