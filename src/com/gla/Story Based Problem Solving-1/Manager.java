class Manager extends Employee {
    String department;

    // Constructor
    Manager(int empId, String name, String department) {
        super(empId, name);
        this.department = department;
    }

    // Override method
    @Override
    String generateEmail() {
        return name.toLowerCase() + "." + department.toLowerCase() + "@company.com";
    }
}