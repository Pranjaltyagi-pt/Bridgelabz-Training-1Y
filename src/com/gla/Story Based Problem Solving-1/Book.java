class Book {
    int bookId;
    String title;
    double price;

    static String libraryName = "City Library";  // shared by all

    // Constructor
    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    // Method to calculate fine (to be overridden)
    double calculateFine(int daysLate) {
        return 0;
    }
}