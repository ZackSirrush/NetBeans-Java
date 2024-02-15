package supervisor;

import conexion.conexion;
import static conexion.conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class listapedidosPV extends javax.swing.JInternalFrame implements Runnable{/* clase runnable para el metodo run */
    
    Thread hilo3; /* Instanciar hilo */
    
    public listapedidosPV() {
        initComponents();
        hilo3 = new Thread(this); /* declara nuevo hilo */
        
        
    }        

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        bttnbuscarPV = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bttnFiltrar = new javax.swing.JButton();
        cboxEstatus = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        selecpv = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pedidosPVtbl = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idPedido = new javax.swing.JTextField();
        bttnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cboxAutoris = new javax.swing.JComboBox<>();
        bttnAutorizar = new javax.swing.JButton();
        closebttn = new javax.swing.JButton();

        setTitle("Pedidos del punto de venta");
        setToolTipText("");

        bttnbuscarPV.setText("Mostrar");
        bttnbuscarPV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnbuscarPVActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese su punto de venta:");

        bttnFiltrar.setText("Filtrar");
        bttnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnFiltrarActionPerformed(evt);
            }
        });

        cboxEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin asignar", "Asignado", "En elaboracion", "Terminado", "Autorizado" }));

        jLabel2.setText("Filtrar por estatus");

        selecpv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un punto de venta", "Punto de venta 1", "Punto de venta 2", "Punto de venta 3" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboxEstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selecpv, 0, 219, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttnbuscarPV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bttnbuscarPV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selecpv)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboxEstatus, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bttnFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pedidosPVtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Punto de venta", "Diseñador asignado", "ID Pedido", "Estatus", "Fecha y hora de registro", "ID Arreglo", "ID Empleado", "Aceptado", "Fecha de aceptación", "Hora inicial", "Hora final", "Tiempo transcurrido"
            }
        ));
        pedidosPVtbl.setEnabled(false);
        jScrollPane2.setViewportView(pedidosPVtbl);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Autorizar pedidos");

        jLabel4.setText("Escriba el ID del pedido que desea autorizar");

        idPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPedidoActionPerformed(evt);
            }
        });

        bttnBuscar.setText("Buscar");
        bttnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Estatus");

        cboxAutoris.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Autorizado" }));
        cboxAutoris.setEnabled(false);

        bttnAutorizar.setText("Autorizar");
        bttnAutorizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAutorizarActionPerformed(evt);
            }
        });

        closebttn.setText("Cerrar ventana");
        closebttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idPedido)
                            .addComponent(cboxAutoris, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttnAutorizar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(52, 52, 52)
                .addComponent(closebttn)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bttnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idPedido))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closebttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttnAutorizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxAutoris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnbuscarPVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnbuscarPVActionPerformed
        mostrarPV();/* muestra la tabla */
        hilo3.start(); /* inicia hilo */ 
        setVisible(true);
    }//GEN-LAST:event_bttnbuscarPVActionPerformed

    private void bttnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnFiltrarActionPerformed
        filtrar();/* filtra la tabla */
    }//GEN-LAST:event_bttnFiltrarActionPerformed

    private void idPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPedidoActionPerformed

    private void bttnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBuscarActionPerformed
        Connection con = null;
        PreparedStatement ps = null; /* Conectar sql */
        ResultSet rs = null;

        try{
            con = getConexion();
            ps = con.prepareStatement("SELECT * FROM pedidos WHERE idPedido=?"); /* consulta sql */
            ps.setString(1,idPedido.getText());

            rs = ps.executeQuery();

            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Pedido existente y seleccionado");
                idPedido.setText(rs.getString("idPedido"));/* devuelve valores al jtext */

            } else{
                JOptionPane.showMessageDialog(null,"No existen pedidos con ese ID");
            }

        } catch(Exception e){
            System.out.println(e); /* devuelve excepcion */
        }
    }//GEN-LAST:event_bttnBuscarActionPerformed

    private void bttnAutorizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAutorizarActionPerformed
        /* Acciones del boton asignar */
        String status = (String) cboxAutoris.getSelectedItem();/* obtiene como string los datos del combobox */
        PreparedStatement ps = null;
        Connection con = getConexion();  /* Establece conexión */

        String sql = "UPDATE pedidos SET estatus=? WHERE idPedido=?"; /* Consulta SQL */

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,status); /* Actualiza campos de tabla pedidos */
            ps.setString(2,idPedido.getText());

            ps.execute();

            int res=ps.executeUpdate(); /* ejecuta la consulta */

            if(res>0){
                JOptionPane.showMessageDialog(null,"Pedido autorizado"); /* si se obtiene un resultado muestra mensaje */
            } else {
                JOptionPane.showMessageDialog(null,"Error al autorizar pedido");
            }

        } catch (SQLException ex) {
            Logger.getLogger(listapedidosPV.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar(); /* Invoca metodo limpiar */
    }//GEN-LAST:event_bttnAutorizarActionPerformed

    private void closebttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebttnActionPerformed
        hilo3.interrupt();/* interrumpe hilo y cierra pestaña */
        dispose();
    }//GEN-LAST:event_closebttnActionPerformed
 
    private void mostrarPV(){
        String puntoDeVenta = this.selecpv.getSelectedItem().toString();/* Selecciona punto de venta del combo box */
        conexion cn = new conexion();
        ResultSet rs = cn.seleccionarPV(puntoDeVenta);
        DefaultTableModel buscarpv = new DefaultTableModel();/* genera la tabla filtrada por puntos de venta */
        this.pedidosPVtbl.setModel(buscarpv);
        buscarpv.setColumnIdentifiers(new Object[]{"Punto de venta","Diseñador asignado","ID Pedido","Estatus","Fecha y hora de registro","ID Arreglo","ID Empleado","Aceptado","Fecha de aceptación","Hora inicial","Hora final","Tiempo transcurrido"});
        try{
            while(rs.next()){
                buscarpv.addRow(new Object[]{rs.getString("puntoDeVenta"),rs.getString("user"),rs.getInt("idPedido"),rs.getString("estatus"),rs.getTimestamp("fechahoraregistro"),rs.getInt("idArreglo"),rs.getInt("idEmp"),rs.getBoolean("aceptado"),rs.getDate("fechaAcept"),rs.getTime("horainicial"),rs.getTime("horafin"),rs.getTime("tiempotranscurr")});
            }
        } catch(Exception e){
            
        }
    }
    
    private void filtrar(){
        String filpuntoDeVenta = this.selecpv.getSelectedItem().toString(); /* selecciona los valores en el combo box */
        String filestatus = this.cboxEstatus.getSelectedItem().toString();
        conexion con = new conexion();
        ResultSet rs = con.filtrarestatusPV(filpuntoDeVenta, filestatus);
        DefaultTableModel buscarpv = new DefaultTableModel(); /* consulta bd y muestra una tabla con los datos filtrados por estatus del pedido */
        this.pedidosPVtbl.setModel(buscarpv);
        buscarpv.setColumnIdentifiers(new Object[]{"Punto de venta","Diseñador asignado","ID Pedido","Estatus","Fecha y hora de registro","ID Arreglo","ID Empleado","Aceptado","Fecha de aceptación","Hora inicial","Hora final","Tiempo transcurrido"});
        try{
            while(rs.next()){
                buscarpv.addRow(new Object[]{rs.getString("puntoDeVenta"),rs.getString("user"),rs.getInt("idPedido"),rs.getString("estatus"),rs.getTimestamp("fechahoraregistro"),rs.getInt("idArreglo"),rs.getInt("idEmp"),rs.getBoolean("aceptado"),rs.getDate("fechaAcept"),rs.getTime("horainicial"),rs.getTime("horafin"),rs.getTime("tiempotranscurr")});
            }
        } catch(Exception e){
            
        }
    }
    private void limpiar(){ /* metodo limpiar */
        cboxAutoris.setSelectedIndex(0);
        cboxEstatus.setSelectedIndex(0); /* establece valores de cajas de texto y combo box */
        idPedido.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAutorizar;
    private javax.swing.JButton bttnBuscar;
    private javax.swing.JButton bttnFiltrar;
    private javax.swing.JButton bttnbuscarPV;
    private javax.swing.JComboBox<String> cboxAutoris;
    private javax.swing.JComboBox<String> cboxEstatus;
    private javax.swing.JButton closebttn;
    private javax.swing.JTextField idPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable pedidosPVtbl;
    private javax.swing.JComboBox<String> selecpv;
    // End of variables declaration//GEN-END:variables

    public void run(){
        Thread current = Thread.currentThread(); /* inicia hilo para hora del sistema */
        
        try{
            int x=0;/* inicializa variable x */
            while(current==hilo3){ 
                Thread.sleep(60000); /* establece 1 minuto de "distancia" */
                System.out.println(x+" - "+Thread.currentThread().getName());/* imprime el numero de iteraciones y el nombre del hilo en ejecución */
                mostrarPV();/* ejecuta metodos */
                x++;/* incrementa el valor de x */
            }
        } catch(Exception e){
            System.out.println("Hilo interrumpido"); /* Muestra mensaje cuando el hilo es interrumpido */
        }
        
    }   
}

