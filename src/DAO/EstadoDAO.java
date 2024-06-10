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
import logica.Estado;

/**
 *
 * @author diego
 */
public class EstadoDAO {

    FachadaBD fachada;
    Connection conn;

    public EstadoDAO() {
        fachada = new FachadaBD();
        conn = fachada.getConnetion();

    }//

    public int guardarEstado(Estado est) {
        String sql_guardar;
        sql_guardar = "INSERT INTO estado VALUES ('"
                + est.getEstado_id()
                + "', '"
                + est.getPedido_id()
                + "', '"
                + est.getFecha()
                + "', '"
                + est.getHora()
                + "', '"
                + est.getEstado()
                + "', '"
                + est.getFoto()
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

    public int idMasGrande() {

        String sql_select;

        int a = 0;
        sql_select = "SELECT MAX(estado_id) FROM estado";;
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
}
