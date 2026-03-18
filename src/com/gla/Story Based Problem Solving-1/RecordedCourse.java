class RecordedCourse extends Course {

    RecordedCourse(int courseId, String courseName, double price) {
        super(courseId, courseName, price);
    }

    @Override
    double getFinalPrice() {
        return price - (price * 0.10);  // 10% discount
    }
}