package chapitre10;

public class Chat extends Animal {

    public Chat(String nom) {
        super(nom);
    }

    @Override
    public void crier() {
        System.out.println(getNom() + " : Miaou !");
    }

}