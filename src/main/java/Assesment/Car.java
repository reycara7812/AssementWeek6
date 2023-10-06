package Assesment;

public class Car extends Vehicle implements Driveable{
    private int numberOfDoors;
    protected final float taxAfterCartaxt = getPriceAfterTax() + 0.5f;

    public Car(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }
    @Override
    public void printVehicleType() {

    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void printNumberOfDoors() {
        System.out.println(getNumberOfDoors());
    }
    /*
     public float getPriceAfterTax() {
        float taxAmount = price * TAXT_AMT;
        float priceAfterTax = price + taxAmount;
        return priceAfterTax;

     */

    public float getCarPriceAfterTax() {
        float taxAmount = getPrice() * getCarPriceAfterTax();
        float priceAfterTax = getPrice() + taxAmount;
        return priceAfterTax;
    }

    @Override
    public void printSpeed() {
        System.out.println(getSpeed());
    }
}
