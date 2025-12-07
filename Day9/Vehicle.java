package Day9;

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Bike extends Vehicle {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
    }
}

