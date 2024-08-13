/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customers;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 9552
 */
public class Customer {
    private String Id;
    private String Name;
    private String PhoneNumber;
    private String Direction;
    

    private Map<String, Customer> customers;

    

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
    
    public void addCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }
    
        
    public void removeCustomer(String id) {
        customers.remove(id);
    }
    
        
    public Customer searchCustomer(String id) {
        return customers.get(id);
    }
    
     public void showCustomers() {
        for (Customer customer : customers.values()) {
            System.out.println(customer.toString());
        }
    }
     
     

    @Override
    public String toString() {
        return "Cliente{" + "Id=" + Id + ", Nombre=" + Name + ", Telefono=" + PhoneNumber + ", Direccion=" + Direction + '}';
    }
  
    }
 
