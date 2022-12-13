package at.zeki.oo;

public class Car {
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String Serialnumber;

    private String color;

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }
}
