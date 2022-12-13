package at.zeki.oo;

public class Main {
    public static void main(String[] args){

        Car c1 = new Car();
        c1.fuelConsumption = 7;
        c1.brand = "BMW";
        c1.Serialnumber = "B3046";
        c1.fuelAmount = 50;

        Car c2 = new Car();
        c2.fuelConsumption = 15;
        c2.brand = "Bugatti";
        c2.Serialnumber = "F1200";
        c2.fuelAmount = 70;


        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
    }
}
