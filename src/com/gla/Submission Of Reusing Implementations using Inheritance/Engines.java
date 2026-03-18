abstract class Engines {
    abstract void start();
}

class PetrolEngine extends Engine {
    void start() {
        System.out.println("Petrol engine starts");
    }
}

class Car {
    private Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
    }
}