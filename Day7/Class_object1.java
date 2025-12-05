package Day7;

class Car {
    String brand;

    void showBrand() {
        System.out.println(brand);
    }
}

public class Class_object1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "BMW";
        c.showBrand();
    }
}
