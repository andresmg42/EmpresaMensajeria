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
import logica.Servicio;

/**
 *
 * @author diego
 */
public class ServicioDAO {

    FachadaBD fachada;
    Connection conn;

    public ServicioDAO() {
        fachada = new FachadaBD();
        conn = fachada.getConnetion();

    }//

    public int guardarServicio(Servicio ser) {
        String sql_guardar;
        sql_guardar = "INSERT INTO servicio VALUES ('"
                + ser.getPedido_id()
                + "', '"
                + ser.getLogin()
                + "', '"
                + ser.getMensajero_id()
                + "', '"
                + ser.getHora()
                + "', '"
                + ser.getFecha()
                + "', '"
                + ser.getTipo_transporte()
                + "', '"
                + ser.getDescripcion()
                + "', '"
                + ser.getCiudad_origen()
                + "', '"
                + ser.getCiudad_destino()
                + "', '"
                + ser.getDireccion_origen()
                + "', '"
                + ser.getDireccion_destino()
                + "', '"
                + ser.getNum_paquetes()
                + "')";
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

    public String[] consultarServivico(String id) {
        String sql_select;
        String[] a = new String[11];

        sql_select = "SELECT * FROM servicio WHERE pedido_id    ='" + id + "'";
        try {
            Connection conn = fachada.openConnection();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            a[0] = ("ID: " + tabla.getString(1));
            a[1] = "Login: " + tabla.getString(2);
            a[2] = "Mensajero_id: " + tabla.getString(3);
            a[3] = "Hora: " + tabla.getString(4);
            a[4] = "Fecha: " + tabla.getString(5);
            a[5] = "Tipo transporte: " + tabla.getString(6);
            a[6] = "Descripcion: " + tabla.getString(7);
            a[7] = "Ciudad origen: " + tabla.getString(8);
            a[8] = "Ciudad destino: " + tabla.getString(9);
            a[9] = "Direccion origen: " + tabla.getString(10);
            a[10] = "direccionn destino: " + tabla.getString(11);
            a[11] = "Numero paquetes: " + tabla.getString(12);

            conn.close();

            return a;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }

    public ArrayList<String[]> listarServicio() {
        String sql_select;

        String[] a = new String[12];
        ArrayList<String[]> b = new ArrayList<>();
        sql_select = "SELECT * FROM servicio";
        try {
            Connection conn = fachada.openConnection();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                a[0] = ("ID: " + tabla.getString(1));
                a[1] = "Login: " + tabla.getString(2);
                a[2] = "Mensajero_id: " + tabla.getString(3);
                a[3] = "Hora: " + tabla.getString(4);
                a[4] = "Fecha: " + tabla.getString(5);
                a[5] = "Tipo transporte: " + tabla.getString(6);
                a[6] = "Descripcion: " + tabla.getString(7);
                a[7] = "Ciudad origen: " + tabla.getString(8);
                a[8] = "Ciudad destino: " + tabla.getString(9);
                a[9] = "Direccion origen: " + tabla.getString(10);
                a[10] = "direccionn destino: " + tabla.getString(11);
                a[11] = "Numero paquetes: " + tabla.getString(12);
                b.add(a);
            }
            conn.close();

            return b;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }

    //UPDATE mi_tabla SET ciudad = 'Valencia' WHERE nombre = 'Pepito' AND ciudad = 'Sevilla';
    public int idMasGrande() {
    
        String sql_select;

        int a =0;
        sql_select = "SELECT MAX(pedido_id) FROM servicio";;
        try {
            Connection conn = fachada.openConnection();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                a = ( tabla.getInt(1));
               
            }
            conn.close();

            return a;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;

    }
    public int actualizarServicio(String id, String datoAActualizar, String dato) {
        String sqlActualizar;
        int numFilas = 0;
        switch (datoAActualizar) {
            case "ciudad_destino":
                sqlActualizar = "UPDATE servicio SET ciudad_destino ='" + dato + "' WHERE  pedido_id= '" + id + "'";
                break;
            case "direccion_destino":
                sqlActualizar = "UPDATE servicio SET direccion_destino ='" + dato + "' WHERE pedido_id = '" + id + "'";
                break;
            case "ciudad_origen":
                sqlActualizar = "UPDATE servicio SET ciudad_origen ='" + dato + "' WHERE pedido_id = '" + id + "'";
                break;
            case "direccion_origen":
                sqlActualizar = "UPDATE servicio SET direccion_origen ='" + dato + "' WHERE pedido_id = '" + id + "'";
                break;
            case "tipo_transporte=carro":
                sqlActualizar = "UPDATE servicio SET tipo_transporte ='carro' WHERE pedido_id = '" + id + "'";
                break;
            case "tipo_transporte=moto":
                sqlActualizar = "UPDATE servicio SET tipo_transporte ='moto' WHERE pedido_id = '" + id + "'";
                break;
            case "tipo_transporte=camion":
                sqlActualizar = "UPDATE servicio SET tipo_transporte ='camion' WHERE pedido_id = '" + id + "'";
                break;
            case "descripcion":
                sqlActualizar = "UPDATE servicio SET descripcion ='" + dato + "' WHERE pedido_id = '" + id + "'";
                break;
            case "mensajero_id":
                sqlActualizar = "UPDATE servicio SET mensajero_id ='" + dato + "' WHERE pedido_id = '" + id + "'";
                break;
            case "num_paquetes":
                sqlActualizar = "UPDATE servicio SET num_paquetes='" + dato + "' WHERE pedido_id = '" + id + "'";
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

    public int BorrarServicio(String id) {

        String sql_borrar;
        int numFilas = 0;

        sql_borrar = "DELETE FROM servicio WHERE pedido_id = '" + id + "'";
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
