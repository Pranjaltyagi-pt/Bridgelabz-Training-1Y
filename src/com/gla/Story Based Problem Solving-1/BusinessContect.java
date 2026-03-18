class BusinessContact extends Contact {
    String companyName;

    // Constructor
    BusinessContact(String name, String phoneNumber, String companyName) {
        super(name, phoneNumber);
        this.companyName = companyName;
    }

    // Override display method
    @Override
    void display() {
        System.out.println(
                String.format("Name: %s, Phone: %s, Company: %s",
                        name.toUpperCase(), phoneNumber, companyName)
        );
    }
}