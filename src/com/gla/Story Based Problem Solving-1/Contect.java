class Contact {
    String name;
    String phoneNumber;

    // Constructor
    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Method to display contact details
    void display() {
        System.out.println("Name: " + name + ", Phone: " + phoneNumber);
    }
}