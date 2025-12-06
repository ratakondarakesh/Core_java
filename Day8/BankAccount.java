package Day8;
                         //Encapsulation
class BankAccount {
    private double balance = 5000;

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        System.out.println("Balance: " + b.getBalance());
    }
}

