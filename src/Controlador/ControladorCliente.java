/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.ClienteDAO;
import logica.Cliente;

/**
 *
 * @author diego
 */

public class ControladorCliente {

    ClienteDAO clienteDao;

    public ControladorCliente() {
        clienteDao = new ClienteDAO();
    }

    public int insertarCliente(String id, String telefono, String email, String direccion, String nombre) {
        Cliente c = new Cliente();

        c.setCliente_id(id);
        c.setNombre(telefono);
        c.setEmail(email);
        c.setDireccion(direccion);
        c.setNombre(nombre);

        //Se llama al dao para guardar
        System.out.println("Se va a insertar un cliente");

        int result = clienteDao.guardarCliente(c);

        System.out.println("Se  insertó  un  nuevo cliente");

        return result;

    }//end

    public Cliente consultarCliente(String id) {

        System.out.println("Se va a consultar un cliente");
        Cliente c = clienteDao.consultarCliente();

        return c;
    }

    public void eliminarCliente(String id) {
        clienteDao.BorrarCliente(id);
        System.out.println("Se elimino un registro de cliente");

    }

    public void ActualizarCliente(String id) {
        clienteDao.actualizarCliente(id);
        System.out.println("Se Actualizo un registro de cliente");

    }

    public void cerrarConexionBD() {
        clienteDao.cerrarConexionBD();
    }
}
