

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("John", 2200);
        Manager m1 = new Manager("Alice", 2000, 500);
        Developer d1 = new Developer("Bob", 1800, 10, 20);
        Intern i1 = new Intern("Charlie", 1200, 6);

        m1.printInfo();
        System.out.println("----");

        d1.printInfo();
        System.out.println("----");

        i1.printInfo();
        System.out.println("----");

        // Methods with objects as args
        m1.compareSalary(d1);

        m1.giveRaise(e1, 200);
        d1.printInfo();
    }
}