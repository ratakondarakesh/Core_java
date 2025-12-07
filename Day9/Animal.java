package Day9;

class Animal {
    void eat() {
        System.out.println("Animal eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barking");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}

