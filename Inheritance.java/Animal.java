class AnimalBase {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends AnimalBase {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}