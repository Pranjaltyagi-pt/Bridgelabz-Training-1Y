class Course {
    int courseId;
    String courseName;
    double price;

    static String platformName = "LearnHub";  // shared

    // Constructor
    Course(int courseId, String courseName, double price) {
        this.courseId = courseId;
        this.courseName = formatTitleCase(courseName);
        this.price = price;
    }

    // Method to calculate final price
    double getFinalPrice() {
        return price;
    }

    // Method to convert to Title Case
    String formatTitleCase(String name) {
        String[] words = name.toLowerCase().split(" ");
        String result = "";

        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }
        return result.trim();
    }

    // Display method
    void display() {
        System.out.println("Platform: " + platformName);
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Final Price: ₹" + getFinalPrice());
        System.out.println("------------------------");
    }
}