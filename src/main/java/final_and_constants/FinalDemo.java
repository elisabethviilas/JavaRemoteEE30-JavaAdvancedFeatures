package final_and_constants;

public class FinalDemo {
    public static void main(String[] args){

        final int x = 100;


    }
}

final class FinalClass {

}

class NonFinalClass {
    public void finalMethod(){
        System.out.println("This is a final method");
    }
}
