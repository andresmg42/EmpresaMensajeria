/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author andresuv
 */
public class Cliente {
    private String cliente_id;
    private String telefono;
    private String email;
    private String direccion;
    private String nombre;

    public String getCliente_id() {
        return cliente_id;
    }

    public Cliente() {
    }

    public Cliente(String cliente_id, String telefono, String email, String direccion, String nombre) {
        this.cliente_id = cliente_id;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public void setCliente_id(String cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
