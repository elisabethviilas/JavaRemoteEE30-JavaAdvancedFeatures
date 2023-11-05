package polymorphism.runtime;

public class HBOPlayer extends VodPlayer {

    @Override
    public void plau(String title) {
        System.out.println("Netflix is plauing: " + title);
    }
}