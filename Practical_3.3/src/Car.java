public class Car extends Vehicle implements Insurable{
    public void startEngine(){
        System.out.println("Vroom");
    }
    public void fuelType(){
        System.out.println("Full");
    }
    public void calculatePremium(){
        System.out.println("Premium");
    }
}
