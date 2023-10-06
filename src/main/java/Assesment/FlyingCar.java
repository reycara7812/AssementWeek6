package Assesment;

public class FlyingCar extends Vehicle implements Flyable,Driveable {

    public FlyingCar(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public void printVehicleType() {
        System.out.println("this is a flying car");

    }

    @Override
    public void printSpeed() {
        System.out.println( "You are going so fast this is your speed:" + getSpeed());
    }

    @Override
    public boolean transportPassengers() {
        return true;
    }
}
