public class EcommerceApp {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Laptop");
        Product p2 = new ElectronicProduct(2, "Smartphone", "Samsung");

        System.out.println("Search 'lap': " + p1.isMatch("lap"));
        System.out.println("Search 'Samsung': " + p2.isMatch("Samsung"));
        System.out.println("Search 'phone': " + p2.isMatch("phone"));
    }
}