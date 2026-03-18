class ElectronicProduct extends Product {
    String brand;

    // Constructor
    ElectronicProduct(int productId, String productName, String brand) {
        super(productId, productName);
        this.brand = brand;
    }

    // Override method
    @Override
    boolean isMatch(String keyword) {
        return productName.toLowerCase().contains(keyword.toLowerCase()) ||
                brand.equalsIgnoreCase(keyword);
    }
}