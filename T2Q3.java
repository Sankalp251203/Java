public class T2Q3 {
    public double calculateLoan(double principal, double interestRate) {
        double interest = principal * (interestRate / 100);
        double totalAmount = principal + interest;
        System.out.println("Personal Loan Calculation:");
        System.out.println("Principal       : Rs. " + principal);
        System.out.println("Interest Rate   : " + interestRate + "%");
        System.out.println("Total Amount    : Rs. " + totalAmount);
        return totalAmount;
    }
    public double calculateLoan(double principal, double interestRate, int tenureYears) {
        double interest = principal * (interestRate / 100) * tenureYears;
        double totalAmount = principal + interest;
        System.out.println("Home Loan Calculation:");
        System.out.println("Principal       : Rs. " + principal);
        System.out.println("Interest Rate   : " + interestRate + "%");
        System.out.println("Tenure          : " + tenureYears + " years");
        System.out.println("Total Amount    : Rs. " + totalAmount);
        return totalAmount;
    }
    public double calculateLoan(double principal, double interestRate, int tenureYears, double processingFee) {
        double interest = principal * (interestRate / 100) * tenureYears;
        double totalAmount = principal + interest + processingFee;
        System.out.println("Car Loan Calculation:");
        System.out.println("Principal         : Rs. " + principal);
        System.out.println("Interest Rate     : " + interestRate + "%");
        System.out.println("Tenure            : " + tenureYears + " years");
        System.out.println("Processing Fee    : Rs. " + processingFee);
        System.out.println("Total Amount      : Rs. " + totalAmount);
        return totalAmount;
    }
    public static void main(String[] args) {
        T2Q3 loanCalculator = new T2Q3();
        loanCalculator.calculateLoan(10000, 5);
        System.out.println();
        loanCalculator.calculateLoan(200000, 3.5, 15);
        System.out.println();
        loanCalculator.calculateLoan(30000, 4, 5, 500);
    }
}
