/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui_db;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Jose Daniel
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    private String code;
    
    public String getCode(){
        return Lcode.getText();
    }
    
    public GUI() {
        initComponents();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lbienvenido = new javax.swing.JLabel();
        LQuien = new javax.swing.JLabel();
        JBGerente = new javax.swing.JButton();
        JBCliente = new javax.swing.JButton();
        JBExit = new javax.swing.JButton();
        JBMensajero = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Lcode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lbienvenido.setText("Bienvenido");

        LQuien.setText("¿Como quien desea iniciar?");

        JBGerente.setText("Gerente");
        JBGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGerenteActionPerformed(evt);
            }
        });

        JBCliente.setText("Cliente");
        JBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBClienteActionPerformed(evt);
            }
        });

        /**ImageIcon icon = new ImageIcon("X Icon.jpg");
        JBExit.setIcon(icon);**/
        JBExit.setBorderPainted(true);
        JBExit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jose Daniel\\Desktop\\Universidad\\Programacion\\Bases de datos\\Proyecto\\Imagenes\\X Icono.jpg")); // NOI18N
        JBExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExitActionPerformed(evt);
            }
        });

        JBMensajero.setText("Mensajero");
        JBMensajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMensajeroActionPerformed(evt);
            }
        });

        Lcode.setText(" code");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBMensajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBGerente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Lcode)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbienvenido)
                    .addComponent(LQuien))
                .addGap(18, 18, 18)
                .addComponent(JBExit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lbienvenido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LQuien)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBMensajero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lcode))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGerenteActionPerformed
        Lcode.setText(code);
        PSeccion seccion = new PSeccion();
        seccion.setVisible(true);        
        System.out.println(getCode());
    }//GEN-LAST:event_JBGerenteActionPerformed

    private void JBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBClienteActionPerformed
        code = "Cliente";
        PSeccion seccion = new PSeccion();
        seccion.setVisible(true);
        System.out.println(code);
    }//GEN-LAST:event_JBClienteActionPerformed

    private void JBMensajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMensajeroActionPerformed
        code = "Mensajero";
        PSeccion seccion = new PSeccion();
        seccion.setVisible(true);
        System.out.println(code);//prueba
    }//GEN-LAST:event_JBMensajeroActionPerformed

    private void JBExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExitActionPerformed
        
    }//GEN-LAST:event_JBExitActionPerformed

    /**
     * @param args the command line arguments
    **/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCliente;
    private javax.swing.JButton JBExit;
    private javax.swing.JButton JBGerente;
    private javax.swing.JButton JBMensajero;
    private javax.swing.JLabel LQuien;
    private javax.swing.JLabel Lbienvenido;
    private javax.swing.JLabel Lcode;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
