public class T6Q2 {

    // Simulating package: library.books
    static class Book {
        private String title;
        private String author;
        private String isbn;

        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        public String getTitle() {
            return title;
        }

        public String toString() {
            return "\"" + title + "\" by " + author + " (ISBN: " + isbn + ")";
        }
    }

    // Simulating package: library.members
    static class Member {
        private String name;
        private String memberId;
        private java.util.List<Book> borrowedBooks;

        public Member(String name, String memberId) {
            this.name = name;
            this.memberId = memberId;
            this.borrowedBooks = new java.util.ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void borrowBook(Book book) {
            borrowedBooks.add(book);
        }

        public void returnBook(Book book) {
            borrowedBooks.remove(book);
        }

        public java.util.List<Book> getBorrowedBooks() {
            return borrowedBooks;
        }

        public String toString() {
            return name + " (Member ID: " + memberId + ")";
        }
    }

    // Simulating package: library.transactions
    static class Transaction {
        public static void borrowBook(Book book, Member member) {
            System.out.println(member.getName() + " borrowed " + book.getTitle());
            member.borrowBook(book);
        }

        public static void returnBook(Book book, Member member) {
            System.out.println(member.getName() + " returned " + book.getTitle());
            member.returnBook(book);
        }
    }

    // Main method to demonstrate borrowing and returning
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "9780061122415");
        Member member1 = new Member("John Doe", "M001");

        // Borrowing
        Transaction.borrowBook(book1, member1);

        System.out.println("\nBorrowed Books:");
        for (Book b : member1.getBorrowedBooks()) {
            System.out.println(b);
        }

        // Returning
        Transaction.returnBook(book1, member1);

        System.out.println("\nBorrowed Books after return:");
        for (Book b : member1.getBorrowedBooks()) {
            System.out.println(b);
        }
    }
}
