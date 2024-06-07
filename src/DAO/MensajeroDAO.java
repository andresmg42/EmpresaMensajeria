/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import logica.Cliente;
import logica.Mensajero;

/**
 *
 * @author diego
 */
public class MensajeroDAO {

    FachadaBD fachada;
    Connection conn;

    public MensajeroDAO() {
        fachada = new FachadaBD();
        conn = fachada.getConnetion();

    }//

    public int guardarMensajero(Mensajero men) {
        String sql_guardar;
        sql_guardar = "INSERT INTO mensajero(mensajero_id, telefono, email, direccion, nombre) VALUES ('"
                + men.getId_mensajero() + "', '" + men.getTelefono() + "', '"
                + men.getEmail() + "', '"
                + men.getDireccion() + "', '" + men.getNombre() + "')";
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
    public String consultarMensajero(String id) {
        String sql_select;
        String a ="";
        sql_select = "SELECT * FROM mensajero WHERE mensajero_id    ='"+id+"'";
        try {
            Connection conn = fachada.openConnection();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                 a += ("ID: " + tabla.getString(1) + " Telefono: " + tabla.getString(2)
                        + " Email: " + tabla.getString(3) + " Direccion: " + tabla.getString(4) + " Nombre: " + tabla.getString(5)+" \n");

            }
            conn.close();

            return a;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }
    public String listarMensajeros() {
        String sql_select;
        String a ="";
        sql_select = "SELECT * FROM mensajero";
        try {
            Connection conn = fachada.openConnection();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                 a += ("ID: " + tabla.getString(1) + " Telefono: " + tabla.getString(2)
                        + " Email: " + tabla.getString(3) + " Direccion: " + tabla.getString(4) + " Nombre: " + tabla.getString(5)+" \n");

            }
            conn.close();

            return a;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }
    //UPDATE mi_tabla SET ciudad = 'Valencia' WHERE nombre = 'Pepito' AND ciudad = 'Sevilla';

    public int actualizarMensajero(String id, String datoAActualizar, String dato) {
        String sqlActualizar;
        int numFilas = 0;
        switch (datoAActualizar) {
            case "nombre":
                sqlActualizar = "UPDATE mensajero SET nombre ='" + dato + "' WHERE mensajero_id = '" + id + "'";
                break;
            case "telefono":
                sqlActualizar = "UPDATE mensajero SET telefono ='" + dato + "' WHERE mensajero_id = '" + id + "'";
                break;
            case "direccion":
                sqlActualizar = "UPDATE mensajero SET direccion ='" + dato + "' WHERE mensajero_id = '" + id + "'";
                break;
            case "email":
                sqlActualizar = "UPDATE mensajero SET email ='" + dato + "' WHERE mensajero_id = '" + id + "'";
                break;
            default:
                throw new AssertionError();
        }
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

    public int BorrarMensajero(String id) {

        String sql_borrar;
        int numFilas = 0;

        sql_borrar = "DELETE FROM mensajero WHERE mensajero_id = '" + id + "'";
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
}
