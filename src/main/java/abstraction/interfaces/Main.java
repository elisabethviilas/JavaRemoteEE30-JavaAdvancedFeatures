package abstraction.interfaces;

public class Main {

    public static void main(String[] args) {
        Girl girl = new Girl("white", "Anna");
        Dog rex = new Dog(2, "Circular");

        // WHAT: to show love to human/animal
        // HOW: the implementation of love (current solution)
        showLove(girl);
        showLove(rex);


        // But, let's fix it and focus on WHAT rather than HOW by using abstraction
        showLove(girl);
        showLove(rex);
    }

    public static void showLoveToHuman(Human human) {
        System.out.println("showing love to a human");
    }

    public static void showLoveToAnimal(Animal animal) {
        System.out.println("showing love to a animal");

    }

    public static void showLove(Loveable loveable) {
        // because of Loveable contract(interface)
        // we are 100% sure that any Loveable object
        // has love() method
        loveable.love();
    }

}
