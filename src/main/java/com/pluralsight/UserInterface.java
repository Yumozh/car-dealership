package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner scanner;

    public void display(){
        boolean isRunning = true;
        Scanner scan = new Scanner(System.in);

        while (isRunning) {
//            init();
            System.out.println("HOME SCREEN");
            System.out.print("""
                    \n
                    1) Find vehicles within a price range
                    2) Find vehicles by make / model
                    3) Find vehicles by year range
                    4) Find vehicles by color
                    5) Find vehicles by mileage range
                    6) Find vehicles by type (car, truck, SUV, van)
                    7) List ALL vehicles
                    8) Add a vehicle
                    9) Remove a vehicle
                    99) Quit
                    Enter command: \s""");

            String choice = scan.nextLine().toLowerCase().trim();

            switch (choice) {
                case "1" -> processGetByPriceRequest();
                case "2" -> processGetByMakeModelRequest();
                case "3" -> processGetByYearRequest();
                case "4" -> processGetByColorRequest();
                case "5" -> processGetByMileageRequest();
                case "6" -> processGetByVehicleTypeRequest();
                case "7" -> processAllVehiclesRequest();
                case "8" -> processAddVehicleRequest();
                case "9" -> processRemoveVehicleRequest();
                case "99" -> isRunning = false;
                default -> System.out.println("Invalid input.");
            }
        }
    }
    private void processGetByPriceRequest() {
        // Empty for Phase 3
    }

    private void processGetByMakeModelRequest() {
        // Empty for Phase 3
    }

    private void processGetByYearRequest() {
        // Empty for Phase 3
    }

    private void processGetByColorRequest() {
        // Empty for Phase 3
    }

    private void processGetByMileageRequest() {
        // Empty for Phase 3
    }

    private void processGetByVehicleTypeRequest() {
        // Empty for Phase 3
    }

    private void processAllVehiclesRequest() {
        List<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }

    private void processAddVehicleRequest() {
        // Empty for Phase 3
    }

    private void processRemoveVehicleRequest() {
        // Empty for Phase 3
    }
    private void displayVehicles(List<Vehicle> vehicles) {
        if (vehicles == null || vehicles.isEmpty()) {
            System.out.println("No vehicles found.");
            return;
        }
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
