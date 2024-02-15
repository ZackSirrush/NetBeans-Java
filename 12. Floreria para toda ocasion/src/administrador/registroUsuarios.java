package administrador;

import conexion.SQLEmpleados;
import conexion.conexion;
import conexion.empleados;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.hash;

public class registroUsuarios extends javax.swing.JInternalFrame {
    
    public registroUsuarios() {
        initComponents();
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombreLbl = new javax.swing.JLabel();
        nombreempTxt = new javax.swing.JTextField();
        apLbl = new javax.swing.JLabel();
        apTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        amTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordEmp = new javax.swing.JPasswordField();
        confirmLbl = new javax.swing.JLabel();
        confPassword = new javax.swing.JPasswordField();
        registrarBttn = new javax.swing.JButton();
        puestoLbl = new javax.swing.JLabel();
        puestoBox = new javax.swing.JComboBox<>();
        ptovtaLbl = new javax.swing.JLabel();
        pvtaBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();

        setClosable(true);
        setTitle("Registro de usuarios");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setOpaque(false);

        nombreLbl.setText("Nombre");

        apLbl.setText("Apellido Paterno");

        jLabel1.setText("Apellido Materno");

        jLabel2.setText("Usuario");

        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Contraseña");

        confirmLbl.setText("Confirmar contraseña");

        registrarBttn.setText("Registrar");
        registrarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBttnActionPerformed(evt);
            }
        });

        puestoLbl.setText("Puesto");

        puestoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar puesto", "Administrador", "Disenador", "Supervisor" }));
        puestoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puestoBoxActionPerformed(evt);
            }
        });

        ptovtaLbl.setText("Punto de venta");

        pvtaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione p de venta", "Global", "Punto de venta 1", "Punto de venta 2", "Punto de venta 3" }));
        pvtaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pvtaBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(registrarBttn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreLbl)
                            .addComponent(jLabel1)
                            .addComponent(apLbl)
                            .addComponent(puestoLbl)
                            .addComponent(ptovtaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(confirmLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(amTxt)
                            .addComponent(puestoBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pvtaBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userTxt)
                            .addComponent(passwordEmp)
                            .addComponent(confPassword)
                            .addComponent(apTxt)
                            .addComponent(nombreempTxt))))
                .addContainerGap(412, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombreempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apLbl)
                    .addComponent(apTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(amTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puestoLbl)
                    .addComponent(puestoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ptovtaLbl)
                    .addComponent(pvtaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmLbl)
                    .addComponent(confPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(registrarBttn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Empleado", "Nombre", "Apellido Paterno", "Apellido Materno", "idPuesto", "Punto de venta", "Usuario", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpleado.setEnabled(false);
        jScrollPane1.setViewportView(tblEmpleado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void registrarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBttnActionPerformed

        SQLEmpleados modSQL = new SQLEmpleados(); /* botón registrar conecta a clase sqlempleados */
        empleados mod = new empleados(); /* crea un nuevo objeto de tipo empleados */

        String pv = (String) pvtaBox.getSelectedItem(); /* obtiene valores de combobox y passwordfield en string */
        String puesto = (String) puestoBox.getSelectedItem();
        String pass = new String(passwordEmp.getPassword());
        String passConf = new String (confPassword.getPassword());
        
        int idPuesto = 0; /* inicializa variable puesto */

        if(nombreempTxt.getText().equals("") || apTxt.getText().equals("")|| amTxt.getText().equals("") || userTxt.getText().equals("")|| pass.equals("") || passConf.equals("")){
            JOptionPane.showMessageDialog(null,"Existen campos vacíos, llene todos los campos"); /* verifica que se llenen todos los campos */
        } else {
            if(pass.equals(passConf)){ /* verifica contraseñas iguales */

                if(modSQL.existeUsuario(userTxt.getText())==0){ /* verifica que no existan usuarios iguales */
                    
                    switch (puesto){ /* selecciona el puesto según el valor del combobox */
                        case "Administrador": idPuesto=1;
                            break;
                        case "Disenador": idPuesto=2;
                            break;
                        case "Supervisor": idPuesto=3;
                            break;
                        default: JOptionPane.showMessageDialog(null,"Ingrese un puesto válido");
                            break;
                    }

                    String nuevoPass = hash.sha1(pass); /* obtiene contraseña cifrada implementando la clase hash */
                    mod.setNombreEmp(nombreempTxt.getText()); /* obtinen valores de los campos y actualiza tabla empleado */
                    mod.setApellidoPaterno(apTxt.getText());
                    mod.setApellidoMaterno(amTxt.getText());
                    mod.setIdPuesto(idPuesto);
                    mod.setpuntoDeVenta(pv);
                    mod.setUser(userTxt.getText());
                    mod.setPassword(nuevoPass);

                    if(modSQL.registrar(mod)){
                        JOptionPane.showMessageDialog(null,"Registro guardado correctamente"); /* guarda el registro */
                        limpiar();
                        mostrar();/* actualiza la tabla */
                    } else {
                        JOptionPane.showMessageDialog(null,"Error al guardar registro"); /* no guarda registro */
                    }
                } else {
                    JOptionPane.showMessageDialog(null,"El usuario ya existe");/* existen usuarios iguales  */
                }
            } else {
                JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden"); /* las contraseñas son diferentes */
            }
        }
    }//GEN-LAST:event_registrarBttnActionPerformed

    private void limpiar(){ /* metodo limpiar devuelve valores a las cajas de texto y combobox */
        nombreempTxt.setText("");
        apTxt.setText("");
        amTxt.setText("");
        pvtaBox.setSelectedIndex(0);
        puestoBox.setSelectedIndex(0);
        userTxt.setText("");
        passwordEmp.setText("");
        confPassword.setText("");
    }
    
    private void mostrar(){ /* muestra la tabla empleados */
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = conexion.getTabla("SELECT * FROM empleados");
        modelo.setColumnIdentifiers(new Object[]{"ID Empleado","Nombre","Apellido Paterno","Apellido Materno","ID Puesto","Punto de venta","Usuario","Contraseña"});
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("idEmpleado"),rs.getString("nombreEmp"),rs.getString("apellidoPaterno"),rs.getString("apellidoMaterno"),rs.getInt("idPuesto"),rs.getString("puntoDeVenta"),rs.getString("user"),rs.getString("password")});
            }
            tblEmpleado.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    private void puestoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puestoBoxActionPerformed

    private void pvtaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvtaBoxActionPerformed

    }//GEN-LAST:event_pvtaBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amTxt;
    private javax.swing.JLabel apLbl;
    private javax.swing.JTextField apTxt;
    private javax.swing.JPasswordField confPassword;
    private javax.swing.JLabel confirmLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JTextField nombreempTxt;
    private javax.swing.JPasswordField passwordEmp;
    private javax.swing.JLabel ptovtaLbl;
    private javax.swing.JComboBox<String> puestoBox;
    private javax.swing.JLabel puestoLbl;
    private javax.swing.JComboBox<String> pvtaBox;
    private javax.swing.JButton registrarBttn;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}