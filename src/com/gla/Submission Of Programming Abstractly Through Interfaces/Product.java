class Product implements Cloneable {

    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Clone method
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}