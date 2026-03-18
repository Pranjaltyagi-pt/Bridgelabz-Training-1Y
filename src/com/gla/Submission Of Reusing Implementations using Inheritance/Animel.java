class Animel {
    Animal() {
        System.out.println("Animel constructor");
    }
}

class Dog extends Animel {
    Dog() {
        super();   // Calls parent constructor
        System.out.println("Dog constructor");
    }
}