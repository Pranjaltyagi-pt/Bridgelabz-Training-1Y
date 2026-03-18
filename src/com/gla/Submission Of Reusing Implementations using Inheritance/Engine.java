class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car extends Engine {   // Wrong design
    void drive() {
        start();
        System.out.println("Car is driving");
    }
}