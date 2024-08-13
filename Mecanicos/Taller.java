/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mecanicos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Dell
 */
public class Taller {
    private Set<Mecanico> mecanicos;

    public Taller() {
        this.mecanicos = new HashSet<>();
    }

    // Método agregar
    public void agregarMecanico(Mecanico mecanico) {
        mecanicos.add(mecanico);
    }

    // Método buscar
    public Mecanico buscarMecanico(String id) {
        for (Mecanico mecanico : mecanicos) {
            if (mecanico.getId().equals(id)) {
                return mecanico;
            }
        }
        return null;
    }

    // Método eliminar
    public void eliminarMecanico(String id) {
        Mecanico mecanico = buscarMecanico(id);
        if (mecanico != null) {
            mecanicos.remove(mecanico);
        }
    }

    // Método para imprimir la lista de mecanicos
    public void imprimirMecanicos() {
        for (Mecanico mecanico : mecanicos) {
            System.out.println(mecanico.toString());
        }
    }
}
