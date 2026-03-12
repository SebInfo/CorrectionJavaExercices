package chapitre6;

public class Exercice61 {

    public static void main(String[] args) {

        Livre livre = new Livre();

        livre.setTitre("Clean Code");
        livre.setAuteur("Robert C. Martin");
        livre.setNombrePages(464);

        System.out.println("Titre : " + livre.getTitre());
    }
}
