package abstraction.interfaces;

// Multiple inheritance is not allowed in Java classes
// BUT, multiple implementation is allowed in Java
public class Girl extends Human implements Loveable, Playable {
    private String name;

    public Girl(String skinColor, String name) {
        super(skinColor);
        this.name = name;
    }

    @Override
    public void love() {
        System.out.println("Showing love to a girl");
    }

    @Override
    public void play() {
        System.out.println("Playing with a girl");
    }

    public String getName() {
        return name;
    }

}
