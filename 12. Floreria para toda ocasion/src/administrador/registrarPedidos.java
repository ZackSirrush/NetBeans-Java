package administrador;

import conexion.conexion;
import static conexion.conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class registrarPedidos extends javax.swing.JInternalFrame {

    public registrarPedidos() {
        initComponents();
        
        Connection con = null; /* botón buscar, establece conexion a bd */
        ResultSet rs = null;
        
        try{
            con = getConexion();
            Statement ps = con.createStatement(); /* consulta sql */
            rs = ps.executeQuery("SELECT * FROM catalogo");
            while(rs.next()){
                this.cboxIdarr.addItem(rs.getInt("idArreglo"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboxEstatus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboxIdarr = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        bttnRegistrar = new javax.swing.JButton();
        cboxidEmp = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();

        setClosable(true);
        setTitle("Registrar pedidos");
        setName(""); // NOI18N
        setOpaque(false);

        jLabel1.setText("Estatus");

        cboxEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin asignar", " " }));
        cboxEstatus.setEnabled(false);

        jLabel3.setText("Fecha y hora de registro");

        jLabel5.setText("Id Arreglo");

        cboxIdarr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel6.setText("ID Empleado asignado");

        bttnRegistrar.setText("Registrar pedido");
        bttnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRegistrarActionPerformed(evt);
            }
        });

        cboxidEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        cboxidEmp.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboxIdarr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboxidEmp, 0, 165, Short.MAX_VALUE))
                        .addGap(290, 290, 290))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bttnRegistrar)
                        .addGap(414, 414, 414))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(494, 494, 494)
                .addComponent(cboxEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxIdarr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxidEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bttnRegistrar)
                .addGap(26, 26, 26))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void bttnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRegistrarActionPerformed
        
        String status = (String) cboxEstatus.getSelectedItem(); /* boton registrar pedidos */
        String idEmp = (String) cboxidEmp.getSelectedItem(); /* obtiene el valor del combobox en cadena */
        Object idArr = (Object) cboxIdarr.getSelectedItem();
        
        PreparedStatement ps = null;
        Connection con = getConexion(); /* conexion sql */

        String sql = "INSERT INTO pedidos (estatus,fechahoraregistro,idArreglo,idEmp,aceptado) VALUES (?,?,?,?,?)"; /* consulta sql ingresa datos */

        try {
            ps = con.prepareStatement(sql); /* ingresa valor de los campos en Base de datos */
            ps.setString(1,status);
            ps.setString(2,((JTextField)jdateIni.getDateEditor().getUiComponent()).getText());
            ps.setObject(3,idArr);
            ps.setString(4,idEmp);
            ps.setBoolean(5,false);

            int res=ps.executeUpdate(); /* ejecuta consulta */

            if(res>0){
                JOptionPane.showMessageDialog(null,"Pedido guardado con éxito"); /* si ejecuta la consulta devuelve mensaje */
                mostrar(); /* actualiza tabla y limpia campos */
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null,"No se han podido actualizar los datos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(asignarPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bttnRegistrarActionPerformed
    
    private void mostrar(){
        DefaultTableModel modelo = new DefaultTableModel(); /* muestra la tabla de pedidos */
        ResultSet rs = conexion.getTabla("SELECT * FROM pedidos");
        modelo.setColumnIdentifiers(new Object[]{"ID Pedido","Estatus","Fecha y hora de registro","ID Arreglo","ID Empleado asignado",});
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("idPedido"),rs.getString("estatus"),rs.getTimestamp("fechahoraregistro"),rs.getInt("idArreglo"),rs.getInt("idEmp")});
            }
            tblPedidos.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    private void limpiar(){ /* metodo para limpiar los campos de texto y combo box */
        cboxEstatus.setSelectedIndex(0);
        cboxIdarr.setSelectedIndex(0);
        cboxidEmp.setSelectedIndex(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnRegistrar;
    private javax.swing.JComboBox<String> cboxEstatus;
    private javax.swing.JComboBox<Object> cboxIdarr;
    private javax.swing.JComboBox<String> cboxidEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPedidos;
    // End of variables declaration//GEN-END:variables
}
