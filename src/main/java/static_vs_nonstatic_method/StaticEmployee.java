package static_vs_nonstatic_method;

public class StaticEmployee {
    String name;
    int empId;
    // a static field/method is shared across all objects created from a class
    static String company = "Microsoft";

    public StaticEmployee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public void display() {
        // System.out.println(company); we can access static context from a within a non-static context
        // calculateSalary(1000, 0.2); we can access static context from a within a non-static context
        System.out.println("The details of the employee is ID: " + empId + ", name" + name + ", company: " + company);
    }

    public static double calculateSalary(double basic, double taxRate) {
        // display(); because display() is non-static and is loaded after calculateSalary()
        // this.name(); accessing non-static field from within static context not possible
        // In other terms, we can not access non-static context from within static context
        return basic * (1 - taxRate);
    }



}
