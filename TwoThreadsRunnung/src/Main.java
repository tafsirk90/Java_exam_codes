public class Main {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Thread t2 = new Thread(new Task2());
        t1.start();
        t2.start();
    }
}