package supervisor;

import conexion.conexion;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class comisionesEmp extends javax.swing.JInternalFrame implements Runnable{ /* extender la clase a runnable para que ejecute el hilo */
    
    Thread hilo4; /* Instanciar hilo */
     
    public comisionesEmp() {
        initComponents();
        hilo4 = new Thread(this); /* declarar nuevo hilo */

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcomisionEmp = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        selecpv = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        bttnCalc = new javax.swing.JButton();
        bttnCerrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBono = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setTitle("Comisiones de empleados");

        tblcomisionEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Punto de venta", "ID Empleado", "Diseñador asignado", "Comisiones autorizadas", "Fecha de aceptación del pedido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblcomisionEmp.setEnabled(false);
        jScrollPane1.setViewportView(tblcomisionEmp);

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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        selecpv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un punto de venta", "Punto de venta 1", "Punto de venta 2", "Punto de venta 3" }));

        jLabel1.setText("Ingrese su punto de venta:");

        bttnCalc.setText("Calcular comisiones y bonos");
        bttnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCalcActionPerformed(evt);
            }
        });

        bttnCerrar.setText("Cerrar");
        bttnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selecpv, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttnCalc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(bttnCerrar)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selecpv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bttnCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnCerrar))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Bono de eficiencia");

        tblBono.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Punto de venta", "ID Empleado", "Diseñador asignado", "Venta diaria", "Comisiones autorizadas", "Bono de eficiencia", "Fecha de aceptación"
            }
        ));
        jScrollPane2.setViewportView(tblBono);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(361, 361, 361))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Comisiones autorizadas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(329, 329, 329))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCerrarActionPerformed
        hilo4.interrupt(); /* interrupción de hilo y cerrar ventana */
        dispose();
    }//GEN-LAST:event_bttnCerrarActionPerformed

    private void bttnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCalcActionPerformed
        comisionautorizada();/* ejecuta metodos */
        bonodiario();
        hilo4.start();       /* inicializa el hilo */
        setVisible(true);
    }//GEN-LAST:event_bttnCalcActionPerformed

    private void comisionautorizada(){/* método comisión autorizada */
        String comPV = this.selecpv.getSelectedItem().toString();
        
        conexion con = new conexion();
        ResultSet rs = con.comisionganadaporempleado(comPV); /* realiza una consulta a la base de datos donde suma  */
        
        DefaultTableModel buscarpv = new DefaultTableModel();/* la comisión de los pedidos autorizados y los muestra en tabla */
        this.tblcomisionEmp.setModel(buscarpv);
        
        buscarpv.setColumnIdentifiers(new Object[]{"Punto de venta","ID Empleado","Diseñador asignado","Comisiones autorizadas (5%)","Fecha de aceptación"});
        try{
            while(rs.next()){
                buscarpv.addRow(new Object[]{rs.getString("puntoDeVenta"),rs.getInt("idEmp"),rs.getString("user"),rs.getDouble("comisionesau"),rs.getDate("fechaAcept")});
            }
        } catch(Exception e){
            
        }
    }
    
    private void bonodiario(){
        
        String bonEFI = this.selecpv.getSelectedItem().toString();/* Realiza una consulta donde multiplica las ventas autorizadas diarias por el 1% */
        
        conexion cn = new conexion(); /* se suman y se agrupan por empleado y fecha de aceptación del pedido */
        ResultSet r = cn.bonoeficiencia(bonEFI);
        
        DefaultTableModel buscarpv = new DefaultTableModel();
        this.tblBono.setModel(buscarpv);
         /* muestra la tabla */
        buscarpv.setColumnIdentifiers(new Object[]{"Punto de venta","ID Empleado","Diseñador asignado","Venta diaria","Comisiones autorizadas","Bono de eficiencia(1%)","Fecha de aceptación"});
        try{
            while(r.next()){
                buscarpv.addRow(new Object[]{r.getString("puntoDeVenta"),r.getInt("idEmp"),r.getString("user"),r.getDouble("ventadiaria"),r.getDouble("comisionesau"),r.getDouble("bonoproduc"),r.getDate("fechaAcept")});
            }
        } catch(Exception e){
            
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnCalc;
    private javax.swing.JButton bttnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> selecpv;
    private javax.swing.JTable tblBono;
    private javax.swing.JTable tblcomisionEmp;
    // End of variables declaration//GEN-END:variables

    public void run(){
        
        Thread current = Thread.currentThread(); /* inicia hilo para hora del sistema */
        
        try{
            int x=0; /* inicializa variable x */
            while(current==hilo4){
                Thread.sleep(60000); /* establece 1 minuto de "distancia" */
                System.out.println(x+" - "+Thread.currentThread().getName());/* imprime el numero de iteraciones y el nombre del hilo en ejecución */
                comisionautorizada();/* ejecuta metodos */
                bonodiario();
                x++;/* incrementa el valor de x */
            }
        }catch(Exception e){
            System.out.println("Interrupción del hilo");
        }
    }
}
