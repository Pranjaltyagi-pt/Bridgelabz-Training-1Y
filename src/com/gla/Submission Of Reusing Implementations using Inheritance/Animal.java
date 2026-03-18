class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {   // Dog IS-A Animal
    void bark() {
        System.out.println("Dog barks");
    }
}