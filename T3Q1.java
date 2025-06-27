class T3Q1 {
    private int fineAmount;
    public T3Q1() {
        fineAmount = 5;
    }
    public void displayFine() {
        System.out.println("The default fine amount is: $" + fineAmount);
    }
    public static void main(String[] args) {
        T3Q1 library = new T3Q1();
        library.displayFine();
    }
}

