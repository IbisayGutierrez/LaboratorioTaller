/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reparaciones;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Student
 */
public class ColaDeEspera {
     private Queue<Reparacion> colaDeEspera;

    public ColaDeEspera() {
        colaDeEspera = new LinkedList<>();
    }

    // Agrega una nueva reparación a la cola de espera
    public void addRepair(Reparacion reparacion) {
        if (reparacion != null) {
            colaDeEspera.add(reparacion);
        } else {
            System.out.println("Invalid repair.");
        }
    }

    // Procesa la reparación en la cabeza de la cola
    public Reparacion procesarReparacion() {
        Reparacion reparacion = colaDeEspera.poll();
        if (reparacion == null) {
            System.out.println("There are no more repairs to process.");
        }
        return reparacion;
    }

    // Devuelve la cola de espera
    public Queue<Reparacion> getColaDeEspera() {
        return colaDeEspera;
    }
}
