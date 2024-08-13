/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class VehicleList {
    private ArrayList<Vehicle> vehicles;

    public VehicleList() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public boolean removeVehicle(String licensePlate) {
        return vehicles.removeIf(vehicle -> vehicle.getLicensePlate().equals(licensePlate));
    }

    public Vehicle findVehicle(String licensePlate) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getLicensePlate().equals(licensePlate)) {
                return vehicle;
            }
        }
        return null;
    }
    
      public void listVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in the list.");
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }
}
