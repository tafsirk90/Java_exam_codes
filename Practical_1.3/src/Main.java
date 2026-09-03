public class Main {
    public static void main(String[] args) {
        BankAccount ac = new BankAccount();
        ac.deposit(100.00);
        ac.deposit(200.00, "Student ac");
        System.out.println("Deposited " + ac.getBalance());
    }
}