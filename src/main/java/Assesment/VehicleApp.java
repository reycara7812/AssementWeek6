package Assesment;

import java.util.*;

public class VehicleApp {
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    ArrayList<Flyable> flyables = new ArrayList<>();
    ArrayList<Driveable> driveables = new ArrayList<>();
        /*
        This method, printListOfVehiclesNames, is used to print
        the names of vehicles in a given ArrayList of Vehicle objects.
         */
        public void printListOfVehiclesNames(ArrayList<Vehicle> vehicles) {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle.getName());
            }
        }



        /*
        This method, printListOfFlyableObjects,
        is used to print the class of each object in a given ArrayList of Flyable objects.by using a for loop and getting
        the classes from flyable
         */

    public void printListOfFlyableObjects(ArrayList<Flyable> flyables) {
        for (Flyable flyable : flyables) {
            System.out.println("Flyable Object: " + flyable.getClass(Plane));
        }
    }


    /*
    The method takes an ArrayList of Driveable objects as input.
It uses the sort method of the ArrayList class to sort the driveable vehicles based on their speed.
The Comparator.comparingInt method is used to specify the sorting criteria which is the getSpeed method
of the Driveable interface.The sorted driveable vehicles are then printed to the console
The name and speed of each vehicle are displayed using the getName and getSpeed methods of the Driveable interface
respectively.
     */
 //   public void sortAndPrintDriveableVehiclesBySpeed(ArrayList<Driveable> driveables) {

      //  driveables.sort(Comparator.comparingInt(Driveable::ge));

       // System.out.println("Sorted Driveable Vehicles by Speed:");








    }




