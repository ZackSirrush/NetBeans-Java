package home;

import chat.servidors;
import conexion.SQLEmpleados;
import conexion.empleados;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.hash;

public class loginSistem extends javax.swing.JFrame {
    
    FondoPanel fondo = new FondoPanel();

    public loginSistem() {
        initComponents();
        setLocationRelativeTo(null); /* coloca el login al centro de la pantalla */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jLabel1 = new javax.swing.JLabel();
        usuarioTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        contraPass = new javax.swing.JPasswordField();
        iniciarsesionBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        iniciarsesionBttn.setText("Iniciar Sesión");
        iniciarsesionBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarsesionBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(usuarioTxt)
                    .addComponent(jLabel2)
                    .addComponent(contraPass, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(iniciarsesionBttn))
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iniciarsesionBttn)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarsesionBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarsesionBttnActionPerformed
        SQLEmpleados modSQL = new SQLEmpleados();/* boton iniciar sesion */
        empleados mod = new empleados();/* conecta a bd */
        
        String pass = new String(contraPass.getPassword()); /* obntiene la contraseña cifrada */
        
        if(!usuarioTxt.getText().equals("") && !pass.equals("")){ /* compara si la contraseña no coincide */
            String nuevoPass = hash.sha1(pass); /* usa la contraseña cifrada */
            
            mod.setUser(usuarioTxt.getText()); /* obtiene el valor del jtext usuario */
            mod.setPassword(nuevoPass);
            
            if(modSQL.logIn(mod)){ /* si coincide todo: */
                
                Home frmHome = new Home(mod);
                frmHome.setVisible(true); /* muestra la interfaz */

                this.dispose(); /* cierra menu de login */
                
            }else{
                JOptionPane.showMessageDialog(null,"Datos erroneos");/* indica error en los datos */
            }
        } else {
            JOptionPane.showMessageDialog(null,"Ingrese sus datos"); /* jtext vacios */
        }
    }//GEN-LAST:event_iniciarsesionBttnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginSistem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginSistem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginSistem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginSistem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginSistem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contraPass;
    private javax.swing.JButton iniciarsesionBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField usuarioTxt;
    // End of variables declaration//GEN-END:variables
}

class FondoPanel extends JPanel{
    private Image imagen;/* coloca la imagen del login */
    
    @Override
    public void paint (Graphics g){
        imagen = new ImageIcon(getClass().getResource("/Imagenes/loginImg.jpg")).getImage(); /* selecciona ubicación de la imagen */
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}