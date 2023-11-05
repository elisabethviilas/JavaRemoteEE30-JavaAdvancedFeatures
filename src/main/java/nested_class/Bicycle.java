package nested_class;

/* ============== Inner Class =========== */
public class Bicycle {
    private int maxSpeed = 40;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public class Wheel {
        public void slowDown() {
            // we can refer (access) to outer class's fields/methods
            maxSpeed *= 0.5;
            System.out.println("Wheel's max speed is now: " + maxSpeed);
        }
    } // end of Wheel class (inner class)

    public static class StaticInnerClass {
        public void doNothing() {
            System.out.println("I am a static inner class method");
        }
    } // end of StaticInnerClass

} // end of Bicycle class (outer class)
