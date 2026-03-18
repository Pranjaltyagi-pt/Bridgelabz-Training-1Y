class Product {
    int productId;
    String productName;

    // Constructor
    Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    // Method to check keyword match
    boolean isMatch(String keyword) {
        return productName.toLowerCase().contains(keyword.toLowerCase());
    }
}