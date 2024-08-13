/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reparaciones;

import java.util.Date;

/**
 *
 * @author Student
 */
public class Reparacion {
     private String id;
    private String vehicle;
    private String mechanic;
    private Date date;
    private String description;
    private String status;

    public String getId() {
        return id;
    }

    public String getVehicle() {
        return vehicle;
    }

    public String getMechanic() {
        return mechanic;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void setMechanic(String mechanic) {
        this.mechanic = mechanic;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reparacion{" + "id=" + id + ", vehicle=" + vehicle + ", mechanic=" + mechanic + ", date=" + date + ", description=" + description + ", status=" + status + '}';
    }

    public Reparacion(String id, String vehicle, String mechanic, Date date, String description, String status) {
        this.id = id;
        this.vehicle = vehicle;
        this.mechanic = mechanic;
        this.date = date;
        this.description = description;
        this.status = status;
    }

    public Reparacion() {
    }
}
