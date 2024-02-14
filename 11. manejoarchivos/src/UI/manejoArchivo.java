package UI;

import java.io.BufferedWriter; /* Importa los paquetes necesarios para la ejecución del sistema */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import manejoarchivos.Manejoarchivos; /* Importa las clases a la interfaz */
import manejoarchivos.abrirArchivos;

public class manejoArchivo extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser(); /* Crea un objeto de tipo File Chooser */
    File archivo; /* Crea el objeto para seleccionar archivos */
    abrirArchivos gestion = new abrirArchivos();
    
    File Archivo = new File("");
    
    
    public manejoArchivo() {
        initComponents(); /* Inicializa componentes de interfaz */
    }
    /* Código generado automáticamente */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomArch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaContenido = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        bttnCrear = new javax.swing.JButton();
        bttnLeer = new javax.swing.JButton();
        bttnEditar = new javax.swing.JButton();
        bttnRenom = new javax.swing.JButton();
        bttnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bttnSelect = new javax.swing.JButton();
        txtanterior = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnuevo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MANEJO DE ARCHIVOS DE TEXTO");

        jLabel2.setText("Escriba el nombre del archivo que desea crear: ");

        txtNomArch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomArchActionPerformed(evt);
            }
        });

        txaContenido.setColumns(20);
        txaContenido.setRows(5);
        jScrollPane1.setViewportView(txaContenido);

        jLabel3.setText("Aquí se puede ingresar información en un archivo nuevo o modificable y se muestra la información existente de otro");

        bttnCrear.setText("Crear");
        bttnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCrearActionPerformed(evt);
            }
        });

        bttnLeer.setText("Leer");
        bttnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnLeerActionPerformed(evt);
            }
        });

        bttnEditar.setText("Editar");
        bttnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEditarActionPerformed(evt);
            }
        });

        bttnRenom.setText("Renombrar");
        bttnRenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRenomActionPerformed(evt);
            }
        });

        bttnEliminar.setText("Eliminar");
        bttnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEliminarActionPerformed(evt);
            }
        });

        jLabel4.setText("Busque el archivo que desea cargar y o editar:");

        jLabel5.setText("Seleccione el archivo que desea renombrar:");

        jLabel6.setText("RENOMBRAR ARCHIVOS (Debe iniciar de nuevo el sistema en caso de haber creado un nuevo archivo)");

        jLabel7.setText("CREACIÓN Y BÚSQUEDA DE ARCHIVOS");

        bttnSelect.setText("Seleccionar");
        bttnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSelectActionPerformed(evt);
            }
        });

        txtanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanteriorActionPerformed(evt);
            }
        });

        jLabel8.setText("Ingrese el nuevo nombre del archivo:");

        txtnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnuevoActionPerformed(evt);
            }
        });

        jLabel9.setText("ELIMINAR ARCHIVOS");

        jLabel10.setText("Seleccione el archivo que desea eliminar: ");

        jLabel11.setText("Para editar un archivo, primero seleccione desde el botón leer el archivo a editar, posteriormente añada los cambios ");

        jLabel12.setText("y pulse en el botón editar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bttnLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNomArch, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttnCrear))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel7)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(bttnEditar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bttnSelect)
                                    .addComponent(bttnRenom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomArch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bttnLeer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bttnSelect)
                    .addComponent(txtanterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnRenom)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(bttnEliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomArchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomArchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomArchActionPerformed

    private void bttnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCrearActionPerformed
        /* Botón crear archivo */
        String nombreArchivo = txtNomArch.getText(); /* selecciona el contenido del campo de texto   */
        String carpeta = System.getProperty("user.dir"); /* Selecciona la carpeta por defecto utilizada por el usuario */
        String direccioncompleta = carpeta + "/" + nombreArchivo + ".txt"; /* Coloca la dirección donde se encontrará el archivo de texto */
        FileWriter ubicacion = null; /* Al no existir archivos se considera "NULL" */
        try{ /* Sentencia try catch */
            ubicacion = new FileWriter(direccioncompleta); /* Se sobreescribe la ubicación del archivo */
        }catch(IOException ex){
            Logger.getLogger(Manejoarchivos.class.getName()).log(Level.SEVERE,null,ex);
        }
        try{
            BufferedWriter escritor = new BufferedWriter(ubicacion); 
            escritor.write(txaContenido.getText());/* Ingresa el contenido del text area en el documento */
            escritor.close(); /* Fin del proceso */
            JOptionPane.showMessageDialog(null,"Archivo creado correctamente"); /* Muestra el mensaje de creación exitosa */
        }catch(Exception ex){
        }
    }//GEN-LAST:event_bttnCrearActionPerformed

    private void bttnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLeerActionPerformed
        /* Botón leer */    
        if(seleccionado.showDialog(null,"Buscar archivo")== JFileChooser.APPROVE_OPTION){ /* Abre la ventana para búsqueda de archivos en el ordenador */
            archivo = seleccionado.getSelectedFile(); /* Permite seleccionar archivos y buscarlños en el ordenador */
            if(archivo.canRead()){ /* Determina si el archivo es txt */
                if(archivo.getName().endsWith("txt")){
                    String contenido = gestion.abrirarchtexto(archivo); /* Selecciona el contenido del archivo txt */
                    txaContenido.setText(contenido);
                } else {
                    JOptionPane.showMessageDialog(null,"Por favor seleccione un archivo de texto"); /* En caso de seleccionar un archivo no valido muestra el mensaje */
                }
            }
        }
    }//GEN-LAST:event_bttnLeerActionPerformed

    private void txtanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanteriorActionPerformed

    private void txtnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnuevoActionPerformed

    private void bttnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSelectActionPerformed
        /* Botón seleccionar */
        JFileChooser fc = new JFileChooser(); /* Crea un nuevo objeto File Chooser */
        fc.showOpenDialog(null);
        Archivo = fc.getSelectedFile(); /* Asigna el archivo seleccionado */
        txtanterior.setText(Archivo.getParent()+"\\"+Archivo.getName()); /* Llena el campo de texto con la dirección del archivo seleccionado */
    }//GEN-LAST:event_bttnSelectActionPerformed

    private void bttnRenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRenomActionPerformed
        /* Botón renombrar */
        String nvo = Archivo.getParent() + "\\" + txtnuevo.getText() + ".txt"; /* Define como deberá escribirse el nombre del archivo nuevo */
        File f2 = new File(nvo); /* Instancia un objeto nuevo */
        boolean correcto = Archivo.renameTo(f2); /* Permite renombrar y almacena su valor como tipo bool */
        if(correcto==true){
            JOptionPane.showMessageDialog(null,"El archivo se renombró correctamente");
        } else {
            JOptionPane.showMessageDialog(null,"El archivo no se pudo renombrar");
        }
    }//GEN-LAST:event_bttnRenomActionPerformed

    private void bttnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEliminarActionPerformed
        /* Botón eliminar */
        JFileChooser fc = new JFileChooser(); /* Instancia un nuevo objeto */
        fc.showOpenDialog(null); 
        File arch = fc.getSelectedFile(); /* Selecciona y elimina el archivo a eliminar */
        if(arch.delete()){
            JOptionPane.showMessageDialog(null,"El archivo se ha borrado satisfactoriamente"); /* Mensaje del sistema */
        } else {
            JOptionPane.showMessageDialog(null,"El archivo no se ha borrado");
        }
        
    }//GEN-LAST:event_bttnEliminarActionPerformed

    private void bttnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEditarActionPerformed
        /* Botón editar */
        if(seleccionado.showDialog(null,"Guardar cambios")== JFileChooser.APPROVE_OPTION){ /* Abre la ventana de nombre guardar cambios */
            archivo = seleccionado.getSelectedFile(); /* Seleccionar el archivos y buscado en el ordenador */
                if(archivo.getName().endsWith("txt")){ /* Selecciona el archivo txt */
                    String contenido = txaContenido.getText(); /* Obtiene el contenido almacenado en la text area */
                    String respuesta = gestion.guardararchtexto(archivo, contenido); /* Ejecuta el método guardararchtexto */
                    if(respuesta!=null){
                        JOptionPane.showMessageDialog(null,respuesta);
                    } else {
                        JOptionPane.showMessageDialog(null,"Error al guardar archivo"); /* Mensaje del sistema */
                    }
                } else {
                    JOptionPane.showMessageDialog(null,"Guarde el archivo en formato txt");
                }
    }//GEN-LAST:event_bttnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(manejoArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manejoArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manejoArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manejoArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manejoArchivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnCrear;
    private javax.swing.JButton bttnEditar;
    private javax.swing.JButton bttnEliminar;
    private javax.swing.JButton bttnLeer;
    private javax.swing.JButton bttnRenom;
    private javax.swing.JButton bttnSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaContenido;
    private javax.swing.JTextField txtNomArch;
    private javax.swing.JTextField txtanterior;
    private javax.swing.JTextField txtnuevo;
    // End of variables declaration//GEN-END:variables
}
