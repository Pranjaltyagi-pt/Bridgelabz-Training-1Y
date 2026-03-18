class Employee {
    int empId;
    String name;

    // Constructor
    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    // Method to generate email
    String generateEmail() {
        return name.toLowerCase() + "@company.com";
    }
}