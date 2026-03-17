import college.student.Student;
import college.faculty.Faculty;

public class MainClass {
    public static void main(String[] args) {

        Student s = new Student("Pranjal", 101);
        Faculty f = new Faculty("Dr. Sharma", "Computer Science");

        System.out.println("---- Student Details ----");
        s.displayStudent();

        System.out.println("\n---- Faculty Details ----");
        f.displayFaculty();
    }
}