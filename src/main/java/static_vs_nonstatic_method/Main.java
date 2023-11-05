package static_vs_nonstatic_method;

public class Main {
    public static void main(String[] args) {
        NonStaticEmployee emp1 = new NonStaticEmployee("John Wickers", 1001, "SDA");
        NonStaticEmployee emp2 = new NonStaticEmployee("Robert Barnes", 1002, "SDA");
        emp1.display();
        emp2.display();

        System.out.println("=============== Static field: Company ==============");
        StaticEmployee emp3 = new StaticEmployee("John Wickers", 1001);
        StaticEmployee emp4 = new StaticEmployee("Robert Barnes", 1002);
        emp1.display();
        emp2.display();

        System.out.println("====== Static method: calculateSalary(...) ========");
        System.out.println("The salary for emp3: " + StaticEmployee.calculateSalary(1000, 0.2));
        System.out.println("The salary for emp4: " + StaticEmployee.calculateSalary(1000, 0.2));
    }
}
