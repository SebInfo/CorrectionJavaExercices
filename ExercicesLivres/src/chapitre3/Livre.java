package chapitre3;
public class Livre {

	private String titre;
    private String auteur;
    private boolean emprunte;

    public Livre(String titre, String auteur) {
        setTitre(titre);
        setAuteur(auteur);
        this.emprunte = false;
    }

    public void setTitre(String titre) {
        if (titre == null || titre.isBlank()) {
            throw new IllegalArgumentException("Titre invalide");
        }
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        if (auteur == null || auteur.isBlank()) {
            throw new IllegalArgumentException("Auteur invalide");
        }
        this.auteur = auteur;
    }

    public void emprunter() {
        emprunte = true;
    }

    public void rendre() {
        emprunte = false;
    }

    public boolean estEmprunte() {
        return emprunte;
    }
    
    /**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

}