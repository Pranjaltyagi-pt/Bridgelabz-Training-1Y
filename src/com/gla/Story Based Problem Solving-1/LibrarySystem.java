public class LibrarySystem {
    public static void main(String[] args) {

        Book b1 = new TextBook(1, "Java Programming", 500);
        Book b2 = new Magazine(2, "Tech Monthly", 150);

        int daysLate = 3;

        System.out.println("Library: " + Book.libraryName);

        System.out.println("TextBook Fine: ₹" + b1.calculateFine(daysLate));
        System.out.println("Magazine Fine: ₹" + b2.calculateFine(daysLate));
    }
}