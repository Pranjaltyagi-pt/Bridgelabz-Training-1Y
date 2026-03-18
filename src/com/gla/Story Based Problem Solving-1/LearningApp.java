public class LearningApp {
    public static void main(String[] args) {

        Course c1 = new RecordedCourse(101, "java programming", 1000);
        Course c2 = new LiveCourse(102, "data structures", 2000);

        c1.display();
        c2.display();
    }
}