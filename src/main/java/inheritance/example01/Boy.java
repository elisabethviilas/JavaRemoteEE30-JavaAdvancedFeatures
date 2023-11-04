package inheritance.example01;

// Here Boy is a subclass of Dad
// Since Boy is extending Dad, and Dad itself extends Person
// This means Boy also extends Person
// So, Boy extends both Dad and Person
// In other words, Boy is a Person, Boy is a Dad.
// So it inherits all the fields&methods of Dad and Person
// Every child is also a Parent but not the other way around.
public class Boy extends Dad{

    // our Boy class can have its own field(s) on top of what Dad and Person have
    private String favouriteMusic;

    public Boy(String name, int age, String hairColor, String favoriteMusic) {
        super(name, age, hairColor);
        this.favouriteMusic = favoriteMusic;
        // !NB: The call to super constructor should ALWAYS be the first line in the subclass constructor
        // otherwise you will get compilation error
        // Reason: To give birth to a subclass you have to first give birth to its
    }

    public void dance() {
        System.out.println("Boy is dancing");
    }

    public String getFavouriteMusic() {
        return favouriteMusic;
    }

    public void setFavouriteMusic(String favouriteMusic) {
        this.favouriteMusic = favouriteMusic;
    }
}
