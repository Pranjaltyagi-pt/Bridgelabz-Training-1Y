class Animels {
    void sound() {
        System.out.println("Animels sound");
    }
}

class Dog extends Animels {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animels {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animels a;

        a = new Dog();
        a.sound();   // Dog barks

        a = new Cat();
        a.sound();   // Cat meows
    }
}