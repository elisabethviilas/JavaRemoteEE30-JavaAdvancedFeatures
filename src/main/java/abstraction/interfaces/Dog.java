package abstraction.interfaces;

// 'extends' keyword always comes before 'implements' keyword
public class Dog extends Animal implements Loveable {
    private String collarShape;

    public Dog(int age, String collarShape) {
        super(age);
        this.collarShape = collarShape;
    }

    @Override
    public void love() {
        System.out.println("Showing love to a dog");
    }
}
