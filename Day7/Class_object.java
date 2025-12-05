package Day7;

class Student {
    int id;
    String name;
}

public class Class_object {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 101;
        s.name = "Rahul";
        System.out.println(s.id + " " + s.name);
    }
}

