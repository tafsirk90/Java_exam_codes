public class Circle extends Shape{
    @Override
    public void area(int r, int c){
        double a = 3.14 * r * c;
        System.out.println("Area of circle : " + a);
    }
}
