package Day8;
                       //Encapsulation
class Person {
    private int age;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(22);
        System.out.println("Age: " + p.getAge());
    }
}
