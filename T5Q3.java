class Employe {
    protected String name;
    protected double salary;

    public Employe(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employe {
    private double incentive;

    public Manager(String name, double salary, double incentive) {
        super(name, salary);
        this.incentive = incentive;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Incentive: " + incentive);
    }
}

class Developer extends Employe {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class T5Q3 {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 75000, 5000);
        Developer developer = new Developer("Bob", 60000, "Java");

        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println("\nDeveloper Details:");
        developer.displayDetails();
    }
}