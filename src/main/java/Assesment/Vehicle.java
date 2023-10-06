package Assesment;

public abstract class Vehicle extends Product{

    private int speed;
    private float price;
   protected final float TAXT_AMT= .10F;
    private Engine engine;
    //has an engine

    public Vehicle(String name, int speed, float price, Engine engine) {
        super(name);
        this.speed = speed;
        this.price = price;
        this.engine = engine;
    }


    //add engine to this

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTAXT_AMT() {
        return TAXT_AMT;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public abstract void printVehicleType();


    public float getPriceAfterTax() {
        float taxAmount = price * TAXT_AMT;
        float priceAfterTax = price + taxAmount;
        return priceAfterTax;
    }
}


