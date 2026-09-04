import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int r = sc.nextInt();
            checkRadius(r);
        }
        catch(RadiusException e){
            System.out.println(e.getMessage());
        }
    }
    public static void checkRadius(int r) throws RadiusException{
        if(r <= 0) {
            throw new RadiusException("Radius should be greater than 0");
        }
        else{
            double area = 3.1416 * r * r;
            System.out.println("Area of a circle : " + area);
        }
    }
}