package Day7;

class Mobile {
    void call() {
        System.out.println("Calling...");
    }
}

public class Class_object2 {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.call();
    }
}
