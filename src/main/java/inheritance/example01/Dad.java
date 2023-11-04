package inheritance.example01;

// Class Dad inherits from class Person
// So, Dad is a Person as well
// Person is the parent class of Dad
// Dad is a child class of Person
public class Dad extends Person {

    // to build any instance of a child class you should know first how to build and instance of a parent class
    public Dad(String name, int age, String hairColor) {
        // 'super' keyword is used to call the constructor of the superclass
        super(name, age, hairColor); // You have to first constructor(birth) the parent class
    }

    public void work() {
        System.out.println("Dad works harder");
    }

    // Override method play() from class Person
    // This means play() in Person is overridden
    // This process is called method overriding (overwrite)
    // So, any instance of Dad class can have its own way of play() method
    @Override
    public void play() {
        System.out.println("Dad plays with his kids");
    }

    // Putting @Override annotation is optional,
    // BUT, it is recommended and is a good practice.
    @Override
    public void eat() {
        System.out.println("Dad eats steak");
    }


}