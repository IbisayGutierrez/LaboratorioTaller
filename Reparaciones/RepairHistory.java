/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reparaciones;

import java.util.Stack;

/**
 *
 * @author Student
 */
public class RepairHistory {
     private Stack<Reparacion> repairhistory;

    public RepairHistory() {
        repairhistory = new Stack<>();
    }

    // Agrega una reparación al historial
    public void addRepair(Reparacion reparacion) {
        repairhistory.push(reparacion);
    }

    // Devuelve el historial de reparaciones
    public Stack<Reparacion> getRepairHistory() {
        return repairhistory;
    }

    
    
}
