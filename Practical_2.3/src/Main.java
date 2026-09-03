public class Main {
    public static void main(String[] args) {
        Shape c = new Circle();
        c.area(2, 3);
        Shape r = new Rectangle();
        r.area(4, 5);
        c.describe("Circle");
        r.describe("Rectangle", 10);
    }
}