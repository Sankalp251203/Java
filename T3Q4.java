class BankAccount {
    private String accountHolder;
    private double balance;
    protected String accountType;
    public String accountNumber;

    public BankAccount(String accountHolder, String accountNumber, String accountType, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void viewBalance() {
        System.out.println("Balance: Rs." + balance);
    }

    protected void updateAccountType(String newType) {
        this.accountType = newType;
        System.out.println("Account type updated to: " + newType);
    }

    private void updateBalance(double amount) {
        this.balance = amount;
        System.out.println("Balance updated to: Rs." + amount);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: Rs." + amount);
            viewBalance();
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void adminUpdateBalance(double amount) {
        updateBalance(amount);
    }
}

class Employee extends BankAccount {
    public Employee(String accountHolder, String accountNumber, String accountType, double balance) {
        super(accountHolder, accountNumber, accountType, balance);
    }

    public void modifyAccountType(String newType) {
        updateAccountType(newType);
    }
}

class Admin extends BankAccount {
    public Admin(String accountHolder, String accountNumber, String accountType, double balance) {
        super(accountHolder, accountNumber, accountType, balance);
    }

    public void changeBalance(BankAccount account, double newBalance) {
        account.adminUpdateBalance(newBalance);
    }
}

public class T3Q4 {
    public static void main(String[] args) {
        BankAccount customer = new BankAccount("Sankalp", "2512", "Savings", 1000);
        System.out.println("Customer Access:");
        customer.viewBalance();
        customer.deposit(500);

        System.out.println();
        Employee employee = new Employee("Employee", "1509", "Staff", 0);
        System.out.println("Employee Access:");
        employee.modifyAccountType("Current");

        System.out.println();
        Admin admin = new Admin("Admin", "0607", "Administrator", 0);
        System.out.println("Admin Access:");
        admin.changeBalance(customer, 5000);
        customer.viewBalance();
    }
}

