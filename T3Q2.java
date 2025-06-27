class T3Q2 {
    private String customerName;
    private int numTickets;
    public T3Q2(String customerName, int numTickets) {
        this.customerName = customerName;
        this.numTickets = numTickets;
    }
    public void showBooking() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Number of Tickets: " + numTickets);
    }
    public static void main(String[] args) {
        T3Q2 booking1 = new T3Q2("Alice", 3);
        T3Q2 booking2 = new T3Q2("Bob", 2);
        booking1.showBooking();
        System.out.println();
        booking2.showBooking();
    }
}
