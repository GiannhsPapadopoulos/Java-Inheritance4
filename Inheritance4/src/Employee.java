

public class Employee {

    // Fields
    private String name;
    protected double baseSalary;


    // Constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Methods
    public double calculateSalary() {
        return this.baseSalary;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name + "\n" + "Salary: " + this.baseSalary);
    }

    public void compareSalary(Employee other) {
        if (this.baseSalary > other.baseSalary) {
            System.out.println(this.name + " earns more than " + other.name);
        }
        else if (this.baseSalary < other.baseSalary) {
            System.out.println(this.name + " earns less than " + other.name);
        }
        else {
            System.out.println(this.name + " and " + other.name + " earn the same");
        }
    }

    public void giveRaise(Employee e, double amount) {
        e.baseSalary += amount;
        System.out.println(e.name + " got a raise of " + amount);
    }

}