/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import logica.Cliente;

/**
 *
 * @author diego
 */
public class ClienteDAO {

    FachadaBD fachada;
    Connection conn;
    public ClienteDAO() {
        fachada = new FachadaBD();
        conn = fachada.getConnetion();

    }//

    public int guardarCliente(Cliente cli) {
        String sql_guardar;
        sql_guardar = "INSERT INTO cliente(cliente_id, telefono, email, direccion, nombre) VALUES ('"
                + cli.getCliente_id() + "', '" + cli.getTelefono() + "', '"
                + cli.getEmail() + "', '"
                + cli.getDireccion() + "', '" + cli.getNombre() + "')";
        try {
            Connection conn = fachada.openConnection();
            Statement sentencia = conn.createStatement();
            int numFilas = sentencia.executeUpdate(sql_guardar);
            conn.close();
            return numFilas;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }//fin guardar

    public Cliente consultarCliente() {

        String sql_select;
        sql_select = "SELECT * FROM cliente";
        try {
            Connection conn = fachada.openConnection();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            System.out.println("Codigo\tNombre\tPrograma");

            //
            while (tabla.next()) {
                System.out.println("ID: " + tabla.getString(1) + "Telefono: " + tabla.getString(2)
                        + "Email: " + tabla.getString(3) + "Direccion: " + tabla.getString(4) + " Nombre: " + tabla.getString(5));

            }
            conn.close();
            System.out.println("Conexion cerrada");
            Cliente c = new Cliente();
            c.setCliente_id(tabla.getString(1));
            c.setTelefono(tabla.getString(2));
            c.setEmail(tabla.getString(3));
            c.setDireccion(tabla.getString(4));
            c.setNombre(tabla.getString(5));
            return c;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }
    //UPDATE mi_tabla SET ciudad = 'Valencia' WHERE nombre = 'Pepito' AND ciudad = 'Sevilla';


    public int actualizarCliente(String id){
        String sqlActualizar;
            String sql_borrar;
        int numFilas = 0;

        sqlActualizar = "UPDATE cliente SET Aqui hay que poner lo que se va a actulizar despues de hacer la gui ='valor' WHERE cliente_id = '" + id + "'";
        try {

            Statement sentencia = this.conn.createStatement();

            numFilas = sentencia.executeUpdate(sqlActualizar);
            System.out.println("up " + numFilas);
            return numFilas;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }
    
    public int BorrarCliente(String id) {

        String sql_borrar;
        int numFilas = 0;

        sql_borrar = "DELETE FROM programa WHERE cliente_id = '" + id + "'";
        try {

            Statement sentencia = this.conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_borrar);
            System.out.println("up " + numFilas);
            return numFilas;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }

    public void cerrarConexionBD() {
        fachada.closeConection(fachada.getConnetion());
    }
}// Fin Clase
