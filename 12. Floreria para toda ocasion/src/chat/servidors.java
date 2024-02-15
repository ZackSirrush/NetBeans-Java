package chat;

import static conexion.conexion.getConexion;
import java.io.*;
import java.io.IOException;
import java.net.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class servidors extends javax.swing.JInternalFrame implements Runnable {
    
    public servidors() {
        initComponents();
        
        Connection con = null; /* establece conexion a bd */
        ResultSet rs = null;
        
        try{
            con = getConexion();
            Statement ps = con.createStatement(); /* consulta sql */
            rs = ps.executeQuery("SELECT * FROM empleados");
            while(rs.next()){
                this.cboxempleado.addItem(rs.getString("nombreEmp")+" "+rs.getString("apellidoPaterno")+" "+rs.getString("apellidoMaterno")); /* Concatena el nombre y apellidos en  */
            }/* el combobox */
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        Thread mihilo = new Thread(this); /* Inicializa el hilo del servidor */
        mihilo.start();
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mensajestxtservidor = new javax.swing.JTextArea();
        enviarTxt = new javax.swing.JTextField();
        enviarBttn = new javax.swing.JButton();
        cboxempleado = new javax.swing.JComboBox<>();

        setTitle("Servidor");

        jLabel1.setText("Usuario: ");

        jPanel2.setPreferredSize(new java.awt.Dimension(390, 412));

        mensajestxtservidor.setEditable(false);
        mensajestxtservidor.setColumns(20);
        mensajestxtservidor.setLineWrap(true);
        mensajestxtservidor.setRows(5);
        jScrollPane1.setViewportView(mensajestxtservidor);

        enviarBttn.setText("Enviar");
        enviarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(enviarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enviarBttn, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enviarTxt)
                    .addComponent(enviarBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        cboxempleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxempleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
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

    private void enviarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBttnActionPerformed

        try {

            Socket misocket = new Socket("192.168.56.1",9999); /* Al pulsar el botóon enviar inicializa un socket dirigido a la ip y abre el puerto*/
            paqueteenvio datos = new paqueteenvio();/* Crea un paquete de datos */
            datos.setNick((String) cboxempleado.getSelectedItem()); /* integra y empaqueta los datos del combobox y del jtext */
            datos.setMensaje(enviarTxt.getText());

            ObjectOutputStream paquete_datos=new ObjectOutputStream(misocket.getOutputStream()); /* Stream para envío de datos */
            paquete_datos.writeObject(datos);/* Escribe los datos en el paquete y se envía */
            misocket.close(); /* cierra el socket */

            enviarTxt.setText(""); /* limpia la barra de texto */
        } catch (IOException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enviarBttnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> cboxempleado;
    private javax.swing.JButton enviarBttn;
    private javax.swing.JTextField enviarTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mensajestxtservidor;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        try {
            
            ServerSocket servidor = new ServerSocket(9999); /* Mantiene el servidor a la escucha en el puerto 9999 */
            String nick,mensaje;            /* recibe nick y mensaje */
            paqueteenvio paquete_recibido;            /* convierte paquete envio en recibido */
            
            while(true){/* ciclo de escucha infinito */
                
            Socket misocket = servidor.accept(); /* conecta el socket */
            ObjectInputStream paquete_datos = new ObjectInputStream(misocket.getInputStream());/* Stream */
            paquete_recibido = (paqueteenvio) paquete_datos.readObject(); /* recibe paquete de datos */
            nick=paquete_recibido.getNick();/* recibe el nick y mensaje */
            mensaje=paquete_recibido.getMensaje();
            mensajestxtservidor.append("\n [ "+nick+" ] : "+mensaje);   /* Muestra el mensaje en formato nombre: mensaje */         
            Socket enviadestinatario = new Socket("192.168.56.1",9090); /* devuelve datos al cliente*/
            ObjectOutputStream paquetereenvio = new ObjectOutputStream(enviadestinatario.getOutputStream());
            paquetereenvio.writeObject(paquete_recibido);
            paquetereenvio.close();
            enviadestinatario.close();            
            misocket.close();               /* cierra el socket */
            
            }           
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(servidors.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
