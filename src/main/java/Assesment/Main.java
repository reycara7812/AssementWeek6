package Assesment;

import java.util.*;

public class Main {
    public static void main(String[] args) {

VehicleApp app = new VehicleApp();
    Engine smallEngine = new Engine(Size.MEDIUM);
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    ArrayList<Flyable> flyables = new ArrayList<>();
    ArrayList<Driveable> driveables = new ArrayList<>();

    Car car1 = new Car("Mustang",20,10.00f,smallEngine);
    Truck truck1 = new Truck("Big Truck",20,10.00f,smallEngine);
    FlyingCar flyingCar = new FlyingCar("RoboTesla",20,10.00f,smallEngine);
    Boat boat1 = new Boat("Mustang",20,10.00f,smallEngine,true);

    Plane plane = new Plane("plane",10000000,1223.87f,smallEngine);
    Drone drone = new Drone("small drone");
        vehicles.add(car1);
        vehicles.add(truck1);
        vehicles.add(flyingCar);
        vehicles.add(boat1);

        flyables.add(plane);
        flyables.add(drone);

        app.printListOfVehiclesNames(vehicles);
      app.printListOfFlyableObjects(flyables);




}
}