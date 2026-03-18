class EngineeringStudent extends Student {
    String branch;

    // Constructor
    EngineeringStudent(int rollNo, String name, double marks, String branch) {
        super(rollNo, name, marks);
        this.branch = branch;
    }

    // Method to display updated name with branch
    void displayDetails() {
        String fullName = name + " (" + branch + ")";  // String concatenation
        System.out.println("Name: " + fullName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}