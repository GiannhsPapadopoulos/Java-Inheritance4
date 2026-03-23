

public class Intern extends Employee {

    // Fields
    private int months;

    // Constructor
    public Intern(String name, double baseSalary, int months) {
        super(name, baseSalary);
        this.months = months;
    }

    // Methods
    @Override
    public double calculateSalary() {
        return (this.baseSalary * 0.5);
    }

    @Override
    public void printInfo() {
        System.out.println("Intern");
        super.printInfo();
        System.out.println("Months: " + this.months);
    }
}