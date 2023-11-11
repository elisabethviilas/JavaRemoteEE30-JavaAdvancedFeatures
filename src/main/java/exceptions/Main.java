package exceptions;

public class Main {
    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5}; // what is the max index? 4
        System.out.println(arr[6]); // this line THROWS ArrayIndexOutOfBoundsException
        System.out.println("This line never gets executed");
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // try-catch block (exception handler)
        try {
            System.out.println(a / b); // ArithmeticException: / by zero
            System.out.println("This line never gets executed");
        } catch (ArithmeticException ex) {
            System.out.println("Exception caught: " + ex);
        }
    }
}
