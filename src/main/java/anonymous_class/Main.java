package anonymous_class;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        /* =========== Anonymous class using Abstract class ======== */
        // instantiating abstract classes is not possible but below is possible
        Animal kitty = new Cat("Kitty"); // kitty variable's class name is called Cat


        // below is an ad-hoc object creation
        // below we're instantiating an instance of Animal(abstract), with the specified name "dog"
        // and providing the implementation for makeSound()

        // NB! "dog" is the name of the instance variable NOT the same of the class
        // "dog" variable has no class name (anonymous)
        Animal dog = new Animal("Rex") { // concrete class name: unknown OR anonymous
            @Override
            public void makeSound() {
                System.out.println("Woof woof");
            }
        };

        dog.makeSound();

        // Anonymous class can be useful when you need to use a class just once, or when you need to override just a few methods of a class or interface

        // Cons: They can make our code less readable, especially if the anonymous class is large or has lots of abstract methods

        // FYI, later we will take advantage of anonymous class concept massively in Lambda expression

        /* ====== Anonymous class using interface ====== */
        // Similar to abstract class, we cannot instantiate interfaces.
        // Playable toy = new Playable(); // not possible

        // =============== Button Example from JavaFx ==============
        Button button = new Button("Click me");

        // the argument passed to addActionListener() method below is an instance of anonymous class which will be discarded as soon as it is used on line 55
        button.addActionListener(

                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");

            }
        }


        );

    }
}
