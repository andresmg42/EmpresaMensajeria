/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.ServicioDAO;
import java.util.ArrayList;
import logica.Mensajero;
import logica.Servicio;

/**
 *
 * @author diego
 */
public class ControladorServicio {

    ServicioDAO servicioDao;

    public ControladorServicio() {
        servicioDao = new ServicioDAO();
    }

    public int guardarServicio(int pedido_id, String login, String mensajero_id, String hora, String fecha,
            String tipo_transporte, String descripcion, String ciudad_origen, String ciudad_destino, String direccion_origen,
            String direccion_destino, String num_paquetes) {
        Servicio s = new Servicio();
        s.setPedido_id(pedido_id);
        s.setLogin(login);
        s.setMensajero_id(mensajero_id);
        s.setHora(hora);
        s.setFecha(fecha);
        s.setTipo_transporte(tipo_transporte);
        s.setDescripcion(descripcion);
        s.setCiudad_origen(ciudad_origen);
        s.setCiudad_destino(ciudad_destino);
        s.setDireccion_origen(direccion_origen);
        s.setDireccion_destino(direccion_destino);
        s.setNum_paquetes(num_paquetes);
        //Se llama al dao para guardar
        int result = servicioDao.guardarServicio(s);
        return result;

    }//end

    public String[] consultarServicio(String id) {
        String[] m = servicioDao.consultarServivico(id);
        return m;
    }

    public ArrayList<String[]> listarMensajeros() {
        ArrayList<String[]> m = servicioDao.listarServicio();
        return m;
    }

    public void ActualizarServicio(String id, String DatoAActualizar, String dato) {
        System.out.println(dato);
        servicioDao.actualizarServicio(id, DatoAActualizar, dato);
    }

    public void eliminaServicio(String id) {
        servicioDao.BorrarServicio(id);
        System.out.println("Se elimino un registro de servicio");

    }
    public int idMasGrande(){
        int a =0;
        a=servicioDao.idMasGrande();
        return a;
    }
}
