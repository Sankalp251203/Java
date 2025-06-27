// Abstract base class
abstract class T6Q1 {
    protected String name;

    public T6Q1(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();
}

// Full-Time Employee subclass
class FullTimeEmployee extends T6Q1 {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Part-Time Employee subclass
class PartTimeEmployee extends T6Q1 {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyWage, int hoursWorked) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

// Demo class with main method
class Main {
    public static void main(String[] args) {
        T6Q1 ftEmployee = new FullTimeEmployee("Alice", 5000.0);
        T6Q1 ptEmployee = new PartTimeEmployee("Bob", 20.0, 80);

        System.out.println(ftEmployee.name + "'s Salary: $" + ftEmployee.calculateSalary());
        System.out.println(ptEmployee.name + "'s Salary: $" + ptEmployee.calculateSalary());
    }
}


