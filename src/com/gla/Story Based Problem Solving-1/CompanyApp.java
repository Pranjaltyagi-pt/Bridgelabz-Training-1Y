public class CompanyApp {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Pranjal");
        Employee e2 = new Manager(2, "Rahul", "HR");

        System.out.println("Employee Email: " + e1.generateEmail());
        System.out.println("Manager Email: " + e2.generateEmail());
    }
}