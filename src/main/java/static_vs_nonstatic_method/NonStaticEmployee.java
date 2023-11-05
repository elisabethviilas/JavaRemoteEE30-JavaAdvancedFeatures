package static_vs_nonstatic_method;

public class NonStaticEmployee {
    String name;
    int empId;
    String company;

    public NonStaticEmployee(String name, int empId, String company) {
        this.name = name;
        this.empId = empId;
        this.company = company;
    }

    public void display() {
        System.out.println("The details of the employee is ID: " + empId + ", name" + name + ", company: " + company);
    }
}
