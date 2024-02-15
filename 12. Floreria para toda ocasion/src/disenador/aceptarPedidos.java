package disenador;


import administrador.asignarPedidos;
import conexion.conexion;
import static conexion.conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class aceptarPedidos extends javax.swing.JInternalFrame implements Runnable {

    String hora,minutos,segundos; /* variables para el hilo que muestra fecha y hora del sistema */
    Thread hilo; /* declara el hilo */
    
    static int hour=0,minute=0,seg=0;
    static boolean iniciaHilo=true;/* variables para el hilo del cronometro */
    boolean corriendo=false;
    
    public aceptarPedidos() {
        initComponents();
        mostrar(); /* muestra tabla */
        lblfechasistem.setText(fecha()); /* establece la fecha del sistema */
        hilo = new Thread(this); 
        hilo.start();/* establece hora del sistema en la etiqueta */
        setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listapedidosaceptar = new javax.swing.JTable();
        jPanelAcept = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtidPedido = new javax.swing.JTextField();
        bttnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cboxEstatus = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cboxidEmp = new javax.swing.JComboBox<>();
        bttnAceptar = new javax.swing.JButton();
        lblidemp = new javax.swing.JLabel();
        txtidEmpleado = new javax.swing.JTextField();
        panelCronometro = new javax.swing.JPanel();
        lbltiempotrabajo = new javax.swing.JLabel();
        bttnhorainicio = new javax.swing.JButton();
        lblfecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblfechasistem = new javax.swing.JLabel();
        bttnhorafin = new javax.swing.JButton();
        lblhora = new javax.swing.JLabel();
        lblhorasistem = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Trabajar sobre pedidos");

        listapedidosaceptar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Pedido", "Estatus", "Fecha y hora de registro", "ID Arreglo", "ID Empleado asignado", "Aceptar pedido", "Fecha de aceptación", "Hora inicial", "Hora final", "Tiempo transcurrido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listapedidosaceptar.setEnabled(false);
        listapedidosaceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listapedidosaceptarKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(listapedidosaceptar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("ID Pedido");

        txtidPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidPedidoActionPerformed(evt);
            }
        });

        bttnBuscar.setText("Buscar");
        bttnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Estatus");

        cboxEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin asignar", "Asignado", "En elaboracion", "Terminado" }));
        cboxEstatus.setEnabled(false);

        jLabel6.setText("ID Empleado asignado");

        cboxidEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26" }));
        cboxidEmp.setEnabled(false);

        bttnAceptar.setText("Aceptar pedido");
        bttnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAceptarActionPerformed(evt);
            }
        });

        lblidemp.setText("ID Empleado asignado");

        txtidEmpleado.setEnabled(false);
        txtidEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidEmpleadoActionPerformed(evt);
            }
        });
        txtidEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidEmpleadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidEmpleadoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelAceptLayout = new javax.swing.GroupLayout(jPanelAcept);
        jPanelAcept.setLayout(jPanelAceptLayout);
        jPanelAceptLayout.setHorizontalGroup(
            jPanelAceptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAceptLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAceptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblidemp, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAceptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnAceptar)
                    .addGroup(jPanelAceptLayout.createSequentialGroup()
                        .addGroup(jPanelAceptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtidEmpleado)
                            .addComponent(cboxidEmp, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboxEstatus, javax.swing.GroupLayout.Alignment.LEADING, 0, 141, Short.MAX_VALUE)
                            .addComponent(txtidPedido, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(bttnBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAceptLayout.setVerticalGroup(
            jPanelAceptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAceptLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelAceptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblidemp, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAceptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAceptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtidPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bttnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanelAceptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAceptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxidEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttnAceptar)
                .addGap(17, 17, 17))
        );

        lbltiempotrabajo.setFont(new java.awt.Font("DialogInput", 0, 36)); // NOI18N
        lbltiempotrabajo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltiempotrabajo.setText("00:00:00");

        bttnhorainicio.setText("Hora de inicio");
        bttnhorainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnhorainicioActionPerformed(evt);
            }
        });

        lblfecha.setText("Fecha:");

        lblfechasistem.setText("YYYY/MM/DD");

        bttnhorafin.setText("Hora fin");
        bttnhorafin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnhorafinActionPerformed(evt);
            }
        });

        lblhora.setText("Hora:");

        lblhorasistem.setText("00:00:00");

        jLabel4.setText("Diferencia tiempo de elaboración sugerido - tiempo transcurrido de todos los pedidos es:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Diferencia", "ID Pedido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout panelCronometroLayout = new javax.swing.GroupLayout(panelCronometro);
        panelCronometro.setLayout(panelCronometroLayout);
        panelCronometroLayout.setHorizontalGroup(
            panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCronometroLayout.createSequentialGroup()
                .addGroup(panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCronometroLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbltiempotrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelCronometroLayout.createSequentialGroup()
                                .addGap(0, 138, Short.MAX_VALUE)
                                .addGroup(panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelCronometroLayout.createSequentialGroup()
                                        .addComponent(bttnhorainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(102, 102, 102)
                                        .addComponent(bttnhorafin, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(158, 158, 158))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCronometroLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCronometroLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCronometroLayout.createSequentialGroup()
                                        .addComponent(lblfecha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblfechasistem, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCronometroLayout.createSequentialGroup()
                                        .addComponent(lblhora)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblhorasistem, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelCronometroLayout.createSequentialGroup()
                                .addGroup(panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(34, 34, 34))
        );
        panelCronometroLayout.setVerticalGroup(
            panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCronometroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbltiempotrabajo)
                .addGap(18, 18, 18)
                .addGroup(panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnhorainicio)
                    .addComponent(bttnhorafin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfecha)
                    .addComponent(lblfechasistem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhora)
                    .addComponent(lblhorasistem))
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelAcept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCronometro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelAcept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void mostrar(){ /* muestra la tabla de pedidos en el formulario */
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = conexion.getTabla("SELECT * FROM pedidos");
        modelo.setColumnIdentifiers(new Object[]{"ID Pedido","Estatus","Fecha y hora de registro","ID Arreglo","ID Empleado asignado","Aceptado","Fecha de aceptacion","Hora inicial de elaboración","Hora final de elaboración","Tiempo de elaboración transcurrido"});
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("idPedido"),rs.getString("estatus"),rs.getTimestamp("fechahoraregistro"),rs.getInt("idArreglo"),rs.getInt("idEmp"),rs.getBoolean("aceptado"),rs.getDate("fechaAcept"),rs.getTime("horainicial"),rs.getTime("horafin"),rs.getTime("tiempotranscurr")});
            }
            listapedidosaceptar.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    private void txtidPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidPedidoActionPerformed

    private void bttnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBuscarActionPerformed
        Connection con = null;
        PreparedStatement ps = null; /* botón buscar, establece conexion a bd */
        ResultSet rs = null;
        
        try{
            con = getConexion();
            ps = con.prepareStatement("SELECT * FROM pedidos WHERE idPedido=?"); /* consulta sql */
            ps.setString(1,txtidPedido.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                
                txtidEmpleado.setText(rs.getString("idEmp"));
                txtidPedido.setText(rs.getString("idPedido"));
                cboxEstatus.setSelectedItem(rs.getString("estatus")); /* obtiene pedidos de la base de datos por su id y los coloca en los jtext y combo box */
                cboxidEmp.setSelectedItem(rs.getString("idEmp"));
                
            } else{
                JOptionPane.showMessageDialog(null,"No existen pedidos con ese ID");
            }            
        } catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_bttnBuscarActionPerformed

    private void bttnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAceptarActionPerformed
                
        String status = "En elaboracion"; /* Botón aceptar pedido */
        
        PreparedStatement ps = null; /* define status como en elabroación y establece conmexión */
        Connection con = getConexion();
        
        String sql = "UPDATE pedidos SET estatus=?,aceptado=?,fechaAcept=? WHERE idPedido=?"; /* actualiza campos de bd */
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,status);
            ps.setBoolean(2,true); /* agrega aceptado como true, cambia estatus y establece fecha de aceptado */
            ps.setString(3,lblfechasistem.getText());
            ps.setString(4,txtidPedido.getText());
            
            ps.execute();
            
            int res=ps.executeUpdate();
                
            if(res>0){
                JOptionPane.showMessageDialog(null,"Pedido aceptado"); /* muestra mensaje de aceptación del pedido */
                mostrar();
                
            } else {
                JOptionPane.showMessageDialog(null,"Error al aceptar pedido");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(asignarPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_bttnAceptarActionPerformed

    private void txtidEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidEmpleadoActionPerformed

    private void txtidEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidEmpleadoKeyTyped

    }//GEN-LAST:event_txtidEmpleadoKeyTyped

    private void listapedidosaceptarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listapedidosaceptarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_listapedidosaceptarKeyReleased

    private void txtidEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidEmpleadoKeyReleased
        
    }//GEN-LAST:event_txtidEmpleadoKeyReleased

    private void bttnhorainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnhorainicioActionPerformed
        if(corriendo==false){
            iniciaHilo=true; /* boton de hora inicio del cronometro */
            corriendo=true; /* inicializa variables */
            iniciarHiloCronometro(); /* inicia metodo */
        }

        PreparedStatement ps = null; /* conecta a bd */
        Connection con = getConexion();

        String sql = "UPDATE pedidos SET horainicial=? WHERE idPedido=?"; /* realiza consulta sql */

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,lblhorasistem.getText()); /* establece como hora inicial el valor que se encuentra en la etiquieta */
            ps.setString(2,txtidPedido.getText());

            ps.execute();

            int res=ps.executeUpdate();

            if(res>0){
                JOptionPane.showMessageDialog(null,"Hora de inicio actualizada"); /* mensaje de actualización de hora correcta */
                mostrar();
            } else {
                JOptionPane.showMessageDialog(null,"No se ha podido actualizar la hora de inicio");
            }

        } catch (SQLException ex) {
            Logger.getLogger(asignarPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bttnhorainicioActionPerformed

    private void bttnhorafinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnhorafinActionPerformed
        if(corriendo==true){
            corriendo=false; /* botón de finalizar pedido */
            iniciaHilo=false; /* pausa el hilo */
        }

        String status = "Terminado"; /* establece status como terminado */

        PreparedStatement ps = null;
        Connection con = getConexion(); /* conecta a bd */
        ResultSet rs = null;

        String sql = "UPDATE pedidos SET estatus=?,horafin=?,tiempotranscurr=? WHERE idPedido=?"; /* consulta sql */

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,status);
            ps.setString(2,lblhorasistem.getText());
            ps.setString(3,lbltiempotrabajo.getText());/* actualiza campos */
            ps.setString(4,txtidPedido.getText());

            int res=ps.executeUpdate();

            if(res>0){
                JOptionPane.showMessageDialog(null,"Datos actualizados"); /* devuelve datos actualizados */
                mostrar();/* actualiza tabla de pedidos */
                mostrar2(); /* muestra tabla de registros de tiempos por id */
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null,"No se han podido actualizar los datos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(asignarPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bttnhorafinActionPerformed

    private void limpiar(){ /* metodo limpiar devuelve valores de labels y jtexts a predefinidos */
        cboxEstatus.setSelectedIndex(0);
        cboxidEmp.setSelectedIndex(0);
        txtidEmpleado.setText("");
        lbltiempotrabajo.setText("00:00:00");
    }
    
        private void iniciarHiloCronometro(){ /* metodo iniciar hilo del cronometro */
        if(iniciaHilo==true){
            System.out.println("Hilo iniciado");
            cronThread cron = new cronThread(lbltiempotrabajo); /* obtiene el valor resultante de cronThread */
            cron.start();
        }
    }  
    
    public static String fecha(){ /* fecha del sistema */
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("YYYY/MM/dd");
        return formatofecha.format(fecha); /* obtiene fecha en formato año/mes/dia */
    }
    
    public void hora(){/* método para hora del sistema */
        Calendar calendario = new GregorianCalendar(); /* inicia un objeto calendario */
        Date horaactual = new Date();/* objeto de hora */
        calendario.setTime(horaactual);
        hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);/* obtiene los valores del sistema */
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
    public void mostrar2(){/* muestra la tabla que compara el tiempo diferencial entre la elaboración sugerida y el tiempo de elaboracion real */
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = conexion.getTabla("Select TIMEDIFF(catalogo.tiempoElaboracion,pedidos.tiempotranscurr) AS diferencia,idPedido FROM catalogo INNER JOIN pedidos ON catalogo.idArreglo=pedidos.idArreglo GROUP BY idPedido");
        modelo.setColumnIdentifiers(new Object[]{"Diferencia","ID Pedido"});
        try{
            while(rs.next()){
            modelo.addRow(new Object[]{rs.getTime("diferencia"),rs.getInt("idPedido")});
            }
            jTable1.setModel(modelo);
        } catch(Exception e){
            System.out.println(e);
        }
    }  
    
    public void run(){
        Thread current = Thread.currentThread(); /* inicia hilo para hora del sistema */
        
        while(current==hilo){
            hora();
            lblhorasistem.setText(hora+":"+minutos+":"+segundos);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAceptar;
    private javax.swing.JButton bttnBuscar;
    private javax.swing.JButton bttnhorafin;
    private javax.swing.JButton bttnhorainicio;
    private javax.swing.JComboBox<String> cboxEstatus;
    private javax.swing.JComboBox<String> cboxidEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAcept;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblfechasistem;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel lblhorasistem;
    private javax.swing.JLabel lblidemp;
    private javax.swing.JLabel lbltiempotrabajo;
    private javax.swing.JTable listapedidosaceptar;
    private javax.swing.JPanel panelCronometro;
    private javax.swing.JTextField txtidEmpleado;
    private javax.swing.JTextField txtidPedido;
    // End of variables declaration//GEN-END:variables

}

