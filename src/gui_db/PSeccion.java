/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui_db;
/**
 *
 * @author Jose Daniel
 */
public class PSeccion extends javax.swing.JFrame {

    /**
     * Creates new form PSecion
     */
    
    
    
    public PSeccion() {
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

        Titulo = new javax.swing.JLabel();
        JRetroceso = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        LInicio = new javax.swing.JLabel();
        LLogin = new javax.swing.JLabel();
        TFLogin = new javax.swing.JTextField();
        LPassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        BIniciar = new javax.swing.JButton();
        TBShow = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(230, 0));

        Titulo.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 24)); // NOI18N
        Titulo.setText("BIENVENIDO");

        JRetroceso.setBorderPainted(true);
        JRetroceso.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jose Daniel\\Desktop\\Universidad\\Programacion\\Bases de datos\\Proyecto\\Imagenes\\newRetroceso(redimencionado).png")); // NOI18N
        JRetroceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRetrocesoActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        LInicio.setText("Inicion de seccion:");

        LLogin.setText("Login:");

        LPassword.setText("Password:");

        jPasswordField.setText("jPasswordField1");

        BIniciar.setText("Iniciar Seccion");
        BIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIniciarActionPerformed(evt);
            }
        });

        TBShow.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jose Daniel\\Desktop\\Universidad\\Programacion\\Bases de datos\\Proyecto\\Imagenes\\Ojocerrado.png")); // NOI18N
        TBShow.setBorderPainted(true);
        TBShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(JRetroceso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LInicio)
                    .addComponent(LLogin)
                    .addComponent(BIniciar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPasswordField)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TBShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(TFLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LPassword))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JRetroceso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LPassword)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBShow, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    PCliente pcliente = new PCliente();
    PMensajero pmensajero = new PMensajero();
    PGerente pgerente = new PGerente();
    GUI miGui = new GUI();
    String codigo_obtenido = miGui.getCode();
    private void JRetrocesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRetrocesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRetrocesoActionPerformed

    private void BIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIniciarActionPerformed

        System.out.println(codigo_obtenido);
        /**switch (code_inicio) {
            case "Cliente" :  pcliente.setVisible(true);
            
            case "Mensajero" : pmensajero.setVisible(true);
            
            case "Gerente" : pgerente.setVisible(true);
                
                break;
            default:
                throw new AssertionError();
        }**/
    }//GEN-LAST:event_BIniciarActionPerformed

    private void TBShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBShowActionPerformed
        if (TBShow.isSelected()==true){
            jPasswordField.setEchoChar((char)0);
            TBShow.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jose Daniel\\Desktop\\Universidad\\Programacion\\Bases de datos\\Proyecto\\Imagenes\\Ojoabierto.png"));
            
        }else{
            jPasswordField.setEchoChar('*');
            TBShow.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jose Daniel\\Desktop\\Universidad\\Programacion\\Bases de datos\\Proyecto\\Imagenes\\Ojocerrado.png"));
        }
    }//GEN-LAST:event_TBShowActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BIniciar;
    private javax.swing.JButton JRetroceso;
    private javax.swing.JLabel LInicio;
    private javax.swing.JLabel LLogin;
    private javax.swing.JLabel LPassword;
    private javax.swing.JToggleButton TBShow;
    private javax.swing.JTextField TFLogin;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
