package Assesment;

public class Boat extends Vehicle implements Driveable{
    private boolean hasGPS;
    public Boat(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    public Boat(String name, int speed, float price, Engine engine, boolean hasGPS) {
        super(name, speed, price, engine);
        this.hasGPS = hasGPS;
    }



    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }
    public void printGPSinfo(){
        System.out.println("You are in the USA");
    }

    @Override
    public void printVehicleType() {
        System.out.println("This is a Boat");

    }

    @Override
    public void printSpeed() {
        System.out.println("You are going so fast this is your speed:" + getSpeed());
    }
}
