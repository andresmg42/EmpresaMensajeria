/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.EstadoDAO;
import logica.Estado;

/**
 *
 * @author diego
 */
public class ControladorEstado {

    EstadoDAO estadoDao;

    public ControladorEstado() {
        estadoDao = new EstadoDAO();
    }

    public int GuardarEstado(int estado_id, int pedido_id, String fecha, String hora, String estado, String foto) {
        Estado e = new Estado();
//    	 estado_id;
//	 pedido_id ;
//	fecha;
//	hora;
//	estado; 
//	foto;
        e.setEstado_id(estado_id);
        e.setPedido_id(pedido_id);
        e.setFecha(fecha);
        e.setHora(hora);
        e.setEstado(estado);
        e.setFoto(foto);
        int result = estadoDao.guardarEstado(e);
        return result;
    }
     public int idMasGrande(){
        int a =0;
        a=estadoDao.idMasGrande();
        return a;
    }
}
