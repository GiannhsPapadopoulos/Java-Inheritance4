

public class Developer extends Employee {

    // Fields
    private int overtimeHours;
    private double overtimeRate;

    // Constructor
    public Developer(String name, double baseSalary, int overtimeHours, double overtimeRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    // Methods
    @Override
    public double calculateSalary() {
        return (this.baseSalary + (this.overtimeHours * this.overtimeRate));
    }

    @Override
    public void printInfo() {
        System.out.println("Developer");
        super.printInfo();
        System.out.println("Overtime hours: " + this.overtimeHours);
        System.out.println("Overtime rate: " + this.overtimeRate);

    }
}