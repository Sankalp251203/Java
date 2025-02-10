public class T2Q2 {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    public T2Q2(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: Rs. " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: RS. " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public void displayAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : Rs. " + balance);
    }
    public static void main(String[] args) {
        // Creating BankAccount objects
        T2Q2 account1 = new T2Q2("123456789", "SHAAN ANAND", 2000.0);
        account1.displayAccountInfo();
        account1.deposit(150.0);
        account1.withdraw(100.0);
        account1.withdraw(600.0);
        System.out.println();
        account1.displayAccountInfo();
    }
}
