public class Task1 extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++) {
            System.out.println("Task1 " + i);
        }
    }
}
