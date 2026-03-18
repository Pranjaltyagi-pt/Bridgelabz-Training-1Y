class LiveCourse extends Course {

    LiveCourse(int courseId, String courseName, double price) {
        super(courseId, courseName, price);
    }

    @Override
    double getFinalPrice() {
        return price - (price * 0.05);  // 5% discount
    }
}