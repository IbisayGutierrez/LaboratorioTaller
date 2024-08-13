/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mecanicos;

/**
 *
 * @author Dell
 */
public class Mecanico {
    private String id;
    private String name;
    private String specialty;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Mecanico(String id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public Mecanico() {
        this("","","");
    }

    
    
    @Override
    public String toString() {
        return "Mecanico{" + "id=" + id + ", name=" + name + ", specialty=" + specialty + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Mecanico mecanico = (Mecanico) obj;
        return getId().equals(mecanico.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
    

