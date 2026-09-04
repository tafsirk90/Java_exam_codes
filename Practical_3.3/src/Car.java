public class Car extends Vehicle implements Insurable{
    public void startEngine(){
        System.out.println("Vroom");
    }
    public void fuelType(String fuel){
        System.out.println(fuel);
    }
    public void calculatePremium(){
        System.out.println("Premium");
    }
}
