package encapsulation;

public class Main {
    // encapsulation is the process of wrapping up the data (variables) and code acting on the data (methods) in a single unit.
    // encapsulation is achieved by making the fields 'private' and providing 'public getters & setters'
    public static void main(String[] args) {
        Pocket aPocket = new Pocket(4000);
        System.out.println(aPocket.getMoney());

        aPocket.setMoney(15000); // error message should be shown
    }
}
