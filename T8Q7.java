interface House {
    @Deprecated
    void open();  // Deprecated method
    void openFrontDoor();
    void openBackDoor();
}

class MyHouse implements House {
    @SuppressWarnings("deprecation")  // Suppresses deprecation warning
    public void open() {}

    public void openFrontDoor() {}

    public void openBackDoor() {}
}

public class T8Q7 {
    public static void main(String[] args) {
        MyHouse myHouse = new MyHouse();
        myHouse.open();  // No warning because it's suppressed
        myHouse.openFrontDoor();
        myHouse.openBackDoor();
    }
}

