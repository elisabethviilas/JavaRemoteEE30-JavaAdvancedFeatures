package enums;

import static enums.SimpleUnit.CENTIMETER;
import static enums.Weekdays.FRIDAY;

public class Main {
    public static void main(String[] args) {
        String name = "John";

        SimpleUnit unit = CENTIMETER;

        ComplexUnit complexUnit = ComplexUnit.INCH;

        double heightInMeter = 1000 * complexUnit.convertToMeters();
        System.out.println(heightInMeter); // 25.4 meters

        // convert 500 grams to kilograms
        double gramsInKilograms = convertToKilograms(Weight.GRAM, 500);

        // Goal of enum:
        // Let's say you have an application that only accepts a predefined(default) set of colors like red, blu, green
        // Using enum you enforce developers and users not to have any other colors

        System.out.println(Color.BLUE); // BLUE

        // Task:
        // Write an application that prints weekdays using enums
        // Also display their corresponding day number

        System.out.println(FRIDAY); // FRIDAY
        System.out.println(FRIDAY.order); // 5
        System.out.println(FRIDAY.name()); // FRIDAY
        System.out.println(FRIDAY.ordinal()); // 4

        // without enums we had to use arrays

    }

    public static double convertToKilograms(Weight weight, double amount) {
        return amount * weight.valueInKilograms;
    }
}
