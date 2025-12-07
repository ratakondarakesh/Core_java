package Day9;

class Employee {
    int salary = 30000;
}

class Manager extends Employee {
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println("Salary: " + m.salary);
    }
}

