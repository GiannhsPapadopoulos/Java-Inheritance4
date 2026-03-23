

public class Manager extends Employee {

    // Fields
    private double bonus;


    // Constructor
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    // Methods
    @Override
    public double calculateSalary() {
        return (this.baseSalary + this.bonus);
    }

    @Override
    public void printInfo() {
        System.out.println("Manager");
        super.printInfo();
        System.out.println("Bonus: " + this.bonus);
    }
}