public class T2Q1 {
    private int bookID;
    private String title;
    private String author;
    private boolean availabilityStatus;
    public T2Q1(int bookID, String title, String author, boolean availabilityStatus) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.availabilityStatus = availabilityStatus;
    }
    public void displayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("Book ID       : " + bookID);
        System.out.println("Title         : " + title);
        System.out.println("Author        : " + author);
        System.out.println("Availability  : " + (availabilityStatus ? "Available" : "Not Available"));
    }
    public boolean isAvailable() {
        return availabilityStatus;
    }
    public static void main(String[] args) {
        T2Q1 book1 = new T2Q1(101, "DELHI BELLY", "PAN SINGH TOMAR", true);
        T2Q1 book2 = new T2Q1(102, "RANG DE BASANTI", "AAMIR KHAN", false);
        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
        System.out.println("\nAvailability Check:");
        System.out.println("Is '" + book1.title + "' available? " + (book1.isAvailable() ? "Yes" : "No"));
        System.out.println("Is '" + book2.title + "' available? " + (book2.isAvailable() ? "Yes" : "No"));
    }
}
