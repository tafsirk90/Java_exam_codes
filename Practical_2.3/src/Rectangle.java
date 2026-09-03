public class Rectangle extends Shape {
    @Override
    public void area(int r, int c){
        double a = r * c;
        System.out.println("Area of rectangle : " + a);
    }
}
