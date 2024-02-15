package administrador;


import conexion.conexion;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class consultas extends javax.swing.JInternalFrame {

    public consultas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblconsultas = new javax.swing.JTable();
        tiempoTrabajado = new javax.swing.JButton();
        comision = new javax.swing.JButton();
        ventasTotales = new javax.swing.JButton();
        difElab = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consultas");

        tblconsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblconsultas.setEnabled(false);
        jScrollPane1.setViewportView(tblconsultas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                .addContainerGap())
        );

        tiempoTrabajado.setText("Tiempo trabajado");
        tiempoTrabajado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoTrabajadoActionPerformed(evt);
            }
        });

        comision.setText("Comisiones asignadas a empleados");
        comision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comisionActionPerformed(evt);
            }
        });

        ventasTotales.setText("Ventas totales");
        ventasTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasTotalesActionPerformed(evt);
            }
        });

        difElab.setText("Diferencia tiempo elaboración");
        difElab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difElabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(tiempoTrabajado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(comision, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(ventasTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(difElab, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiempoTrabajado)
                    .addComponent(comision)
                    .addComponent(ventasTotales)
                    .addComponent(difElab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tiempoTrabajadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoTrabajadoActionPerformed
        mostrarTiempoTrabajo(); /* boton */
    }//GEN-LAST:event_tiempoTrabajadoActionPerformed

    private void comisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comisionActionPerformed
        comisionGanada(); /* invoca el método pertinente en el botón */
    }//GEN-LAST:event_comisionActionPerformed

    private void ventasTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasTotalesActionPerformed
        ventasTotales(); /* botón */
    }//GEN-LAST:event_ventasTotalesActionPerformed

    private void difElabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difElabActionPerformed
        difElaboracion(); /* botón */
    }//GEN-LAST:event_difElabActionPerformed
  
    private void mostrarTiempoTrabajo(){ /* Metodo para mostrar tabla de tiempo de trabajo */
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = conexion.getTabla("SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(tiempotranscurr))) AS horas,idEmp,fechaAcept FROM pedidos GROUP BY idEmp,fechaAcept;"); /* Realiza la suma de los tiempos de trabajo */
        modelo.setColumnIdentifiers(new Object[]{"Tiempo trabajado","ID Empleado","Fecha"});
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getTime("horas"),rs.getInt("idEmp"),rs.getDate("fechaAcept")}); /* Establece las tablas de la consulta */
            }
            tblconsultas.setModel(modelo); /* Establece el modelo de la tabla */
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    private void comisionGanada(){ /* Metodo para comisiones */
        DefaultTableModel modelo = new DefaultTableModel(); /* suma las comisiones de cada empleado al dia y las devuelve en una tabla */
        ResultSet rs = conexion.getTabla("SELECT catalogo.idArreglo,SUM(catalogo.comision) AS comisionesganadas,pedidos.idEmp,pedidos.fechaAcept FROM catalogo INNER JOIN pedidos ON catalogo.idArreglo=pedidos.idArreglo GROUP BY idEmp,fechaAcept");
        modelo.setColumnIdentifiers(new Object[]{"ID Arreglo","Comisiones Ganadas","ID Empleado","Fecha de aceptación de pedido"});
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("idArreglo"),rs.getDouble("comisionesganadas"),rs.getInt("idEmp"),rs.getDate("fechaAcept")});
            }
            tblconsultas.setModel(modelo); /* devuelve valores de la consulta en la tabla */
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    private void ventasTotales(){ /* metodo de ventas totales */
        DefaultTableModel modelo = new DefaultTableModel(); /* realiza una consulta donde suma las ventas y las agrupa */
        ResultSet rs = conexion.getTabla("SELECT catalogo.idArreglo,SUM(catalogo.costoArreglo) AS totalventas,SUM(catalogo.comision) AS totalcomisiones,pedidos.fechaAcept FROM catalogo INNER JOIN pedidos ON catalogo.idArreglo=pedidos.idArreglo GROUP BY idArreglo,fechaAcept");
        modelo.setColumnIdentifiers(new Object[]{"ID Arreglo","Ventas totales","Comisiones pagadas","Fecha de venta"});
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("idArreglo"),rs.getDouble("totalventas"),rs.getDouble("totalcomisiones"),rs.getDate("fechaAcept")});
            }
            tblconsultas.setModel(modelo);
        }catch(Exception e){ /* valores en tabla */
            System.out.println(e);
        }
    }
    
    private void difElaboracion(){ /* Metodo que miestra la diferencia en tuiempos de elaboración con los arreglos */
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = conexion.getTabla("Select TIMEDIFF(catalogo.tiempoElaboracion,pedidos.tiempotranscurr) AS diferencia,idPedido FROM catalogo INNER JOIN pedidos ON catalogo.idArreglo=pedidos.idArreglo GROUP BY idPedido");
        modelo.setColumnIdentifiers(new Object[]{"Diferencia de tiempo de elaboración","ID Pedido"});
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getTime("diferencia"),rs.getInt("idPedido")});
            }
            tblconsultas.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comision;
    private javax.swing.JButton difElab;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblconsultas;
    private javax.swing.JButton tiempoTrabajado;
    private javax.swing.JButton ventasTotales;
    // End of variables declaration//GEN-END:variables
}
