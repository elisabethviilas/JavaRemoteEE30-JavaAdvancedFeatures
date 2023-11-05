package polymorphism.compile_time;

// Polymorphism:
// Polymorphism(multiple+form) is the ability of an object to take on many forms.
// The most common use of polymorphism is OOP occurs when a parent class reference is used to refer to a child class object.
// In other words, the child class can be used as the parent class.
// This is much like a child can be used as a parent in the real world:
// Let's say you as the child try to show up at the parents party and all you have to do is to mimic your dad's behaviour
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // depending on the input arguments type, add() exposes a different behaviour
        calculator.add(3, 4); // calls 1st method
        calculator.add("Hello", "World"); // calls 2nd method

    }
}


class Calculator {

    public void add (int a, int b) {
        System.out.println("Addition of two numbers is: " + (a+b));
    }

    public void add (String a, String b) {
        System.out.println("Addition of two strings is: " + a + b);
    }
}

