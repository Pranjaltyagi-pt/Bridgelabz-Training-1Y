class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void barkMultipleTimes(int x) {   // Clear method name
        System.out.println("Dog barks " + x + " times");
    }
}