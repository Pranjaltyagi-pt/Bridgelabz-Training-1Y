public class ContactApp {
    public static void main(String[] args) {

        Contact c1 = new Contact("Pranjal", "9876543210");
        Contact c2 = new BusinessContact("Rahul", "9123456780", "TCS");

        c1.display();
        c2.display();   // Calls overridden method
    }
}