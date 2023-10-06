package Assesment;

public class Plane extends Vehicle implements Flyable{
    public Plane(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public void printVehicleType() {
        System.out.println("This is a plane");

    }

    @Override
    public boolean transportPassengers() {
        return true;
    }
}
