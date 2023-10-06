package Assesment;

public class Truck extends Vehicle implements Driveable{


    public Truck(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public void printVehicleType() {
        System.out.println("This is a truck");

    }

    @Override
    public void printSpeed() {
        System.out.println("You are going so fast this is your speed:" + getSpeed());
    }
}
