import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id : ");
        int id = sc.nextInt();
        System.out.println("Enter name : ");
        String name = sc.next();
        System.out.println("Enter marks : ");
        int marks = sc.nextInt();
        Student student = new Student(name, id, marks);
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.insert(student);
    }
}