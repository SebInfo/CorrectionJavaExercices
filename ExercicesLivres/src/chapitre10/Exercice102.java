package chapitre10;

import java.util.ArrayList;
import java.util.List;

public class Exercice102 {

    public static void main(String[] args) {

        List<Animal> animaux = new ArrayList<>();

        animaux.add(new Chien("Rex"));
        animaux.add(new Chat("Minou"));
        animaux.add(new Chien("Rocky"));
        animaux.add(new Chat("Felix"));

        for (Animal animal : animaux) {
            animal.crier();
        }

    }

}