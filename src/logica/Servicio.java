/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author diego
 */
public class Servicio {

    private int pedido_id;
    private String login;
    private String mensajero_id;
    private String hora;
    private String fecha;
    private String tipo_transporte;
    private String descripcion;
    private String ciudad_origen;
    private String ciudad_destino;
    private String direccion_origen;
    private String direccion_destino;
    private String num_paquetes;

    public Servicio() {
    }

    public void setPedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMensajero_id(String mensajero_id) {
        this.mensajero_id = mensajero_id;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTipo_transporte(String tipo_transporte) {
        this.tipo_transporte = tipo_transporte;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCiudad_origen(String ciudad_origen) {
        this.ciudad_origen = ciudad_origen;
    }

    public void setCiudad_destino(String ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }

    public void setDireccion_origen(String direccion_origen) {
        this.direccion_origen = direccion_origen;
    }

    public void setDireccion_destino(String direccion_destino) {
        this.direccion_destino = direccion_destino;
    }

    public void setNum_paquetes(String num_paquetes) {
        this.num_paquetes = num_paquetes;
    }

    public int getPedido_id() {
        return pedido_id;
    }

    public String getLogin() {
        return login;
    }

    public String getMensajero_id() {
        return mensajero_id;
    }

    public String getHora() {
        return hora;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipo_transporte() {
        return tipo_transporte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCiudad_origen() {
        return ciudad_origen;
    }

    public String getCiudad_destino() {
        return ciudad_destino;
    }

    public String getDireccion_origen() {
        return direccion_origen;
    }

    public String getDireccion_destino() {
        return direccion_destino;
    }

    public String getNum_paquetes() {
        return num_paquetes;
    }
    
}
