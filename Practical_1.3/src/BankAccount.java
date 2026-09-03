public class BankAccount {
    private double balance;
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void deposit(double amount, String remarks){
        balance += amount;
        System.out.println("Remarks : " + remarks);
    }
}
