/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

import java.time.LocalDate;

/**
 *
 * @author andre
 */
public class Vehicle {
    private String licensePlate;
    private String model;
    private String brand;
    private LocalDate yearOfManufacture;

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public LocalDate getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYearOfManufacture(LocalDate yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public Vehicle(String licensePlate, String model, String brand, LocalDate yearOfManufacture) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Vehicle() {
        this("","","",LocalDate.now());
    }

    @Override
    public String toString() {
        return "Vehicle{" + "licensePlate=" + licensePlate + ", model=" + model + ", brand=" + brand + ", yearOfManufacture=" + yearOfManufacture + '}';
    }

}

