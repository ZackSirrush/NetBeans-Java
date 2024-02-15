package chat;

import static conexion.conexion.getConexion;
import java.io.*;
import java.net.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class clientes extends javax.swing.JInternalFrame implements Runnable {
    
    public clientes() {
        
        initComponents();
        
        Connection con = null; /* establece conexion a bd */
        ResultSet rs = null;
        
        try{
            con = getConexion();
            Statement ps = con.createStatement(); /* consulta sql */
            rs = ps.executeQuery("SELECT * FROM empleados");
            while(rs.next()){
                this.cboxempleado.addItem(rs.getString("nombreEmp")+" "+rs.getString("apellidoPaterno")+" "+rs.getString("apellidoMaterno"));
            }/* Inserta en combo box usuarios registrados */
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        Thread mihilo = new Thread(this);/* inicia hilo */
        mihilo.start();
                
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboxempleado = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mensajestxtcliente = new javax.swing.JTextArea();
        enviarTxt = new javax.swing.JTextField();
        enviarBttn = new javax.swing.JButton();

        setTitle("Cliente");
        setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel1.setText("Usuario: ");

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
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mensajestxtcliente.setEditable(false);
        mensajestxtcliente.setColumns(20);
        mensajestxtcliente.setLineWrap(true);
        mensajestxtcliente.setRows(5);
        jScrollPane1.setViewportView(mensajestxtcliente);

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enviarBttn)
                    .addComponent(enviarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBttnActionPerformed
        
        try {
            
            Socket misocket = new Socket("192.168.56.1",9999);/* Envía mensaje abriendo el puerto e ip */
            paqueteenvio datos = new paqueteenvio();            
            datos.setNick((String) cboxempleado.getSelectedItem());
            datos.setMensaje(enviarTxt.getText());
            
            ObjectOutputStream paquete_datos=new ObjectOutputStream(misocket.getOutputStream());
            paquete_datos.writeObject(datos);/* Envía paquete de datos */
            misocket.close();  
            
            enviarTxt.setText("");/* limpia caja de texto */
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
    private javax.swing.JTextArea mensajestxtcliente;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        try{
            
            ServerSocket servidor_cliente = new ServerSocket(9090);    /* Se mantiene escuchando al servidor */        
            Socket cliente;
            paqueteenvio paqueterecibido;   /* recibe paquetes */         
            while(true){
                
                cliente=servidor_cliente.accept();/* acepta entradas del servidor */
                ObjectInputStream flujoentrada = new ObjectInputStream(cliente.getInputStream());                
                paqueterecibido=(paqueteenvio) flujoentrada.readObject();/* lee paquete recibido */
                mensajestxtcliente.append("\n[ "+paqueterecibido.getNick()+" ] : "+paqueterecibido.getMensaje()); /* Muestra paquete en area de texto */
                
            }                
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
