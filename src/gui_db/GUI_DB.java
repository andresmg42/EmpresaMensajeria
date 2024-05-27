/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui_db;

public class GUI_DB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI x  = new GUI();
        x.setVisible(true);
        PCliente c = new PCliente();
        PMensajero m = new PMensajero();
        PGerente g = new PGerente();
        c.setVisible(true);
        m.setVisible(true);
        g.setVisible(true);
    }   
}
