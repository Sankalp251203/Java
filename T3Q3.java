class T3Q3 {
    private String itemName;
    private int quantity;

    public T3Q3() {
        this.itemName = "Burger";
        this.quantity = 1;
    }
    public T3Q3(String itemName) {
        this.itemName = itemName;
        this.quantity = 1;
    }
    public T3Q3(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }
    public void showOrder() {
        System.out.println("Order: " + itemName + ", Quantity: " + quantity);
    }
    public static void main(String[] args) {
        T3Q3 order1 = new T3Q3();
        T3Q3 order2 = new T3Q3("Sushi");
        T3Q3 order3 = new T3Q3("Thukpa", 2);
        order1.showOrder();
        order2.showOrder();
        order3.showOrder();
    }
}
