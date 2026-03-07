package chap4;
public class Livre {

    private String titre;
    private String auteur;
    private int nombrePages;

    public Livre() {
    }

    public Livre(String titre, String auteur, int nombrePages) {
        setTitre(titre);
        setAuteur(auteur);
        setNombrePages(nombrePages);
    }

    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) {
        if (titre != null && !titre.isBlank()) {
            this.titre = titre;
        }
    }

    public String getAuteur() {
        return this.auteur;
    }

    public void setAuteur(String auteur) {
        if (auteur != null && !auteur.isBlank()) {
            this.auteur = auteur;
        }
    }

    public int getNombrePages() {
        return this.nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        if (nombrePages > 0) {
            this.nombrePages = nombrePages;
        }
    }
}