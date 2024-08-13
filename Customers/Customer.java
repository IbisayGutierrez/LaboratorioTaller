/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customers;

/**
 *
 * @author 9552
 */
public class Customer {
    private String Id;
    private String Name;
    private String PhoneNumber;
    private String Direction;

    public String getId() {
        return Id;
    }

    public String getNombre() {
        return Name;
    }

    public String getTelefono() {
        return PhoneNumber;
    }

    public String getDireccion() {
        return Direction;
    }

    public void setTelefono(String Telefono) {
        this.PhoneNumber = Telefono;
    }

    public void setDireccion(String Direccion) {
        this.Direction = Direccion;
    }

    public Customer(String Id, String Name, String PhoneNumber, String Direction) {
        this.Id = Id;
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
        this.Direction = Direction;
    }

    public Customer() {
        this("","","","");
    }
    

    @Override
    public String toString() {
        return "Cliente{" + "Id=" + Id + ", Nombre=" + Name + ", Telefono=" + PhoneNumber + ", Direccion=" + Direction + '}';
    }
        
}

