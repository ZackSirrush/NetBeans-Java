package administrador;

import conexion.conexion; /* Importar librerias */
import static conexion.conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class asignarPedidos extends javax.swing.JInternalFrame {

    public asignarPedidos() {
        initComponents();
        
        Connection con = null; /* botón buscar, establece conexion a bd */
        ResultSet rs = null;
        
        try{
            con = getConexion();
            Statement ps = con.createStatement(); /* consulta sql */
            rs = ps.executeQuery("SELECT * FROM empleados WHERE idPuesto=2");
            while(rs.next()){
                this.cboxidEmp.addItem(rs.getInt("idEmpleado"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        mostrar(); /* Llamado a la clase mostrar */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboxEstatus = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        bttnAsignar = new javax.swing.JButton();
        cboxidEmp = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        idPedido = new javax.swing.JTextField();
        bttnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();

        setClosable(true);
        setTitle("Asignar pedidos");
        setName(""); // NOI18N
        setOpaque(false);

        jLabel1.setText("Estatus");

        cboxEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin asignar", "Asignado" }));

        jLabel6.setText("ID Empleado asignado");

        bttnAsignar.setText("Asignar pedido");
        bttnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAsignarActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Pedido");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboxidEmp, 0, 141, Short.MAX_VALUE)
                    .addComponent(cboxEstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idPedido))
                .addGap(18, 18, 18)
                .addComponent(bttnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(bttnAsignar)
                .addContainerGap(429, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboxidEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bttnAsignar)
                .addGap(40, 40, 40))
        );

        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Pedido", "Estatus", "Fecha y hora de registro", "ID arreglo", "ID empleado asignado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPedidos.setEnabled(false);
        jScrollPane1.setViewportView(tblPedidos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void bttnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAsignarActionPerformed
        /* Acciones del boton asignar */
        String status = (String) cboxEstatus.getSelectedItem(); 
        Object idEmp = (Object) cboxidEmp.getSelectedItem(); /* obtiene como string los datos del combobox */
        
        PreparedStatement ps = null;
        Connection con = getConexion();  /* Establece conexión */
        
        String sql = "UPDATE pedidos SET estatus=?,idEmp=? WHERE idPedido=?"; /* Consulta SQL */
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,status); /* Actualiza campos de tabla pedidos */
            ps.setObject(2,idEmp);
            ps.setString(3,idPedido.getText());
            
            ps.execute();
            
            int res=ps.executeUpdate(); /* ejecuta la consulta */
                
            if(res>0){
                JOptionPane.showMessageDialog(null,"Pedido asignado"); /* si se obtiene un resultado muestra mensaje, limpia y actualiza la tabla */
                limpiar();
                mostrar();
            } else {
                JOptionPane.showMessageDialog(null,"Error al asignar pedido");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(asignarPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar(); /* Invoca metodo limpiar */
    }//GEN-LAST:event_bttnAsignarActionPerformed

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
                idPedido.setText(rs.getString("idPedido"));
                cboxEstatus.setSelectedItem(rs.getString("estatus")); /* devuelve valores de combobox y  */
                cboxidEmp.setSelectedItem(rs.getString("idEmp"));
                
            } else{
                JOptionPane.showMessageDialog(null,"No existen pedidos con ese ID"); 
            }
            
        } catch(Exception e){
            System.out.println(e); /* devuelve excepcion */
        } 
    }//GEN-LAST:event_bttnBuscarActionPerformed
    
    private void mostrar(){ /* metodo mostrar */
        DefaultTableModel modelo = new DefaultTableModel(); /* inserta una tabla default */
        ResultSet rs = conexion.getTabla("SELECT * FROM pedidos"); /* devuelve todos los valores de la consulta */
        modelo.setColumnIdentifiers(new Object[]{"ID Pedido","Estatus","Fecha y hora de registro","ID Arreglo","ID Empleado asignado",}); /* columnas de tabla */
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("idPedido"),rs.getString("estatus"),rs.getTimestamp("fechahoraregistro"),rs.getInt("idArreglo"),rs.getInt("idEmp")}); /* ingresa valores hasta que acabe */
            }
            tblPedidos.setModel(modelo); /* ingresa los datos en tabla */
        }catch(Exception e){
            System.out.println(e);
        }
    }

    private void limpiar(){ /* metodo limpiar */
        cboxEstatus.setSelectedIndex(0);
        cboxidEmp.setSelectedIndex(0); /* establece valores de cajas de texto y combo box */
        idPedido.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAsignar;
    private javax.swing.JButton bttnBuscar;
    private javax.swing.JComboBox<String> cboxEstatus;
    private javax.swing.JComboBox<Object> cboxidEmp;
    private javax.swing.JTextField idPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPedidos;
    // End of variables declaration//GEN-END:variables
}
