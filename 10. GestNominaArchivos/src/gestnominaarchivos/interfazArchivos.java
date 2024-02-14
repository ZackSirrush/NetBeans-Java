package gestnominaarchivos;

import Metodos.metodosnom;
import empleado.empleados;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*; /* Importa librerias para trabajar con JFrames */
import javax.swing.table.DefaultTableModel;
import sun.util.logging.PlatformLogger;
        
public class interfazArchivos extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    File archivo; /* Crea el objeto para seleccionar archivos */
    gestiona gestion = new gestiona(); 
    
    empleados empleado = new empleados();
    metodosnom metodos = new metodosnom();
    DefaultTableModel mdlTabla;
    Vector vCabeceras = new Vector();
    

    public interfazArchivos() {
        initComponents();
        
        vCabeceras.addElement("Nombre");
        vCabeceras.addElement("RFC");
        vCabeceras.addElement("Número de empleado");
        mdlTabla = new DefaultTableModel(vCabeceras, 0);
        jTable1.setModel(mdlTabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtnombretrabajador = new javax.swing.JTextField();
        txtrfc = new javax.swing.JTextField();
        txtnoemp = new javax.swing.JTextField();
        etnombretrab = new javax.swing.JLabel();
        etrfc = new javax.swing.JLabel();
        etnoemp = new javax.swing.JLabel();
        buscaremp = new javax.swing.JButton();
        guardaremp = new javax.swing.JButton();
        crearbttn = new javax.swing.JButton();
        renombrarbttn = new javax.swing.JButton();
        eliminarbttn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de archivos");

        txtnombretrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombretrabajadorActionPerformed(evt);
            }
        });

        txtrfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrfcActionPerformed(evt);
            }
        });

        txtnoemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoempActionPerformed(evt);
            }
        });

        etnombretrab.setText("Nombre del trabajador:");

        etrfc.setText("RFC:");

        etnoemp.setText("No. de empleado");

        buscaremp.setText("Leer");
        buscaremp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarempActionPerformed(evt);
            }
        });

        guardaremp.setText("Guardar");
        guardaremp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarempActionPerformed(evt);
            }
        });

        crearbttn.setText("Crear");
        crearbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearbttnActionPerformed(evt);
            }
        });

        renombrarbttn.setText("Renombrar");

        eliminarbttn.setText("Eliminar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setText("Inserte nombre de archivo");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crearbttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscaremp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(renombrarbttn)
                    .addComponent(eliminarbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(guardaremp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(etnombretrab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombretrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(etrfc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtrfc, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(etnoemp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnoemp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(renombrarbttn)
                            .addComponent(crearbttn))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscaremp))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eliminarbttn))))
                    .addComponent(jTextField1))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombretrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etnombretrab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etrfc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnoemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etnoemp))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardaremp)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarempActionPerformed
        if(seleccionado.showDialog(null,"Buscar archivo")== JFileChooser.APPROVE_OPTION){ /* Abre la ventana para búsqueda de archivos en el ordenador */
            archivo = seleccionado.getSelectedFile(); /* Permite seleccionar archivos y buscarlños en el ordenador */
            if(archivo.canRead()){ /* Determina si el archivo es txt */
                if(archivo.getName().endsWith("txt")){
                    String contenido = gestion.abrirarchtexto(archivo); /* Selecciona el contenido del archivo txt */
                } else {
                    JOptionPane.showMessageDialog(null,"Por favor seleccione un archivo de texto"); /* En caso de seleccionar un archivo no valido muestra el mensaje */
                }
            }
        }
    }//GEN-LAST:event_buscarempActionPerformed

    private void txtnoempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoempActionPerformed

    private void txtnombretrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombretrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombretrabajadorActionPerformed

    private void txtrfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrfcActionPerformed

    private void guardarempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarempActionPerformed
        mdlTabla = new DefaultTableModel();
        String nombre = txtnombretrabajador.getText();
        String RFC = txtrfc.getText();
        String noemp = txtnoemp.getText();
        
        empleado.setNombre(nombre);
        empleado.setRFC(RFC);
        empleado.setNodeemp(noemp);
        
        metodos.guardar(empleado);
        metodos.guardarArchivo(empleado);
        
        JOptionPane.showMessageDialog(null,"Registro exitoso");
        
        txtnombretrabajador.setText("");
        txtrfc.setText("");
        txtnoemp.setText("");
        
        jTable1.setModel(metodos.listadeempleados());
    }//GEN-LAST:event_guardarempActionPerformed

    private void crearbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearbttnActionPerformed

    }//GEN-LAST:event_crearbttnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(interfazArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazArchivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscaremp;
    private javax.swing.JButton crearbttn;
    private javax.swing.JButton eliminarbttn;
    private javax.swing.JLabel etnoemp;
    private javax.swing.JLabel etnombretrab;
    private javax.swing.JLabel etrfc;
    private javax.swing.JButton guardaremp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton renombrarbttn;
    private javax.swing.JTextField txtnoemp;
    private javax.swing.JTextField txtnombretrabajador;
    private javax.swing.JTextField txtrfc;
    // End of variables declaration//GEN-END:variables
}
