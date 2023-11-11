package final_and_constants;

public class ConstantsDemo {

    public static final double PI = 3.14159;

    public static final String DATABASE_URL = "jdbc:mysql://localhost:3306/mydatabase";
    public static final int MAX_LOGIN_ATTEMPTS = 3;

    public static void main(String[] args){

        System.out.println("Connecting to database: " + DATABASE_URL);
        for (int i = 1; i <= MAX_LOGIN_ATTEMPTS; i++) {
            System.out.println("Attempt: " + i + " of" + MAX_LOGIN_ATTEMPTS);
        }
    }
}
