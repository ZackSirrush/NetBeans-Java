package disenador;

import conexion.conexion;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class listapedidos extends javax.swing.JInternalFrame {

    public listapedidos() {
        initComponents();
        mostrar();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listapedidos = new javax.swing.JTable();

        setClosable(true);
        setTitle("Lista de pedidos");

        listapedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Pedido", "Estatus", "Fecha y hora de registro", "ID Arreglo", "ID Empleado asignado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        listapedidos.setEnabled(false);
        jScrollPane1.setViewportView(listapedidos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1295, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
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

    private void mostrar(){ /* Muestra una lista con la tabla pedidos y sus valores */
         DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = conexion.getTabla("SELECT * FROM pedidos");
        modelo.setColumnIdentifiers(new Object[]{"ID Pedido","Estatus","Fecha y hora de registro","ID Arreglo","ID Empleado asignado","Aceptado","Fecha de aceptacion","Hora inicial de elaboración","Hora final de elaboración","Tiempo de elaboración transcurrido"});
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("idPedido"),rs.getString("estatus"),rs.getTimestamp("fechahoraregistro"),rs.getInt("idArreglo"),rs.getInt("idEmp"),rs.getBoolean("aceptado"),rs.getDate("fechaAcept"),rs.getTime("horainicial"),rs.getTime("horafin"),rs.getTime("tiempotranscurr")});
            }
            listapedidos.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listapedidos;
    // End of variables declaration//GEN-END:variables
}

