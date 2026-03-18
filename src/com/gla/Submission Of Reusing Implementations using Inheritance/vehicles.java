abstract class vehicles {
    abstract void start();   // abstract method

    void fuelType() {        // concrete method
        System.out.println("Uses fuel");
    }
}

class Car extends vehicles {
    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends vehicles {
    @Override
    void start() {
        System.out.println("Bike starts with kick");
    }
}