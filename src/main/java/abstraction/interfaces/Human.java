package abstraction.interfaces;

public abstract class Human {
    private String skinColor;

    public Human(String skinColor) {
        this.skinColor = skinColor;
    }

    @Override
    public void play() {
        System.out.println("girl is playing");
    }

    public String getSkinColor() {
        return skinColor;
    }
}
