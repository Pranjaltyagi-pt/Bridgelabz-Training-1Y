class Animals {
    void eat() {
        System.out.println("Animals eats");
    }
}

class Dog extends Animals {
    @Override
    void eat() {
        System.out.println("Animals eats"); // Same behavior, no change
    }
}