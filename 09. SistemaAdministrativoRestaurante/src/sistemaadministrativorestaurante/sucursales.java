package sistemaadministrativorestaurante;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static sistemaadministrativorestaurante.personal_bajas.getConnection;

public class sucursales extends javax.swing.JInternalFrame {

    //Atributos
    public static final String URL = "jdbc:mysql://localhost:3306/proyecto?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "root"; //Ubicación de la base de datos, nombre de usuario y contraseña de la BD
    public static final String PASSWORD = "";
    PreparedStatement ps; //Invocar Prepared statement y Result set
    ResultSet rs;  
    public sucursales() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nosucEt = new javax.swing.JLabel();
        nosucTxt = new javax.swing.JTextField();
        nombresucEt = new javax.swing.JLabel();
        nombresucTxt = new javax.swing.JTextField();
        dirsucEt = new javax.swing.JLabel();
        dirsucTxt = new javax.swing.JTextField();
        guardarBttn = new javax.swing.JButton();
        limpiarBttn = new javax.swing.JButton();
        EditarBttn = new javax.swing.JButton();
        salirBttn = new javax.swing.JButton();
        elimBttn = new javax.swing.JButton();
        buscarInvBajas = new javax.swing.JButton();

        setTitle("Alta sucursales");
        setPreferredSize(new java.awt.Dimension(537, 370));

        nosucEt.setText("Número de sucursal");

        nosucTxt.setText("Ingresar número de sucursal solo para realizar búsquedas");
        nosucTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nosucTxtActionPerformed(evt);
            }
        });
        nosucTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nosucTxtKeyTyped(evt);
            }
        });

        nombresucEt.setText("Nombre sucursal");

        nombresucTxt.setText("Ingresar nombre de sucursal");
        nombresucTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresucTxtActionPerformed(evt);
            }
        });
        nombresucTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombresucTxtKeyTyped(evt);
            }
        });

        dirsucEt.setText("Dirección sucursal");

        dirsucTxt.setText("Ingresar la dirección de la sucursal");
        dirsucTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirsucTxtActionPerformed(evt);
            }
        });
        dirsucTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dirsucTxtKeyTyped(evt);
            }
        });

        guardarBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        guardarBttn.setDefaultCapable(false);
        guardarBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardarBttn.setIconTextGap(1);
        guardarBttn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        guardarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBttnActionPerformed(evt);
            }
        });

        limpiarBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gnome_edit_clear.png"))); // NOI18N
        limpiarBttn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        limpiarBttn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        limpiarBttn.setIconTextGap(1);
        limpiarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBttnActionPerformed(evt);
            }
        });

        EditarBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document_save_as.png"))); // NOI18N
        EditarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBttnActionPerformed(evt);
            }
        });

        salirBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        salirBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBttnActionPerformed(evt);
            }
        });

        elimBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/remove.png"))); // NOI18N
        elimBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimBttnActionPerformed(evt);
            }
        });

        buscarInvBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AppListIcon.targetsize-24.png"))); // NOI18N
        buscarInvBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarInvBajasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nosucEt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nosucTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombresucEt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nombresucTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dirsucEt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dirsucTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(guardarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(limpiarBttn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buscarInvBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(EditarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(elimBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(salirBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nosucEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nosucTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombresucEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombresucTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dirsucEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dirsucTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditarBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(limpiarBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(salirBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarInvBajas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(elimBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
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

        public static Connection getConnection(){ //Método get conecction establece la conexión con la BD
        Connection con = null; //Coloca la conexión como null
        try{//Try catch para prevenir errores
            Class.forName("com.mysql.cj.jdbc.Driver"); //Invocar nombre de clase
            con = (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD); //Ingresar directamente los datos para usar la base de datos
            JOptionPane.showMessageDialog(null,"Conexión exitosa"); //Muestra un mensaje cuando se logra establecer la conexión
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            System.out.println(e); //Error en caso de conexión fallida
        }
        return con;//Devuelve el valor de la conexión
    }
    
    private void nosucTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nosucTxtActionPerformed

    }//GEN-LAST:event_nosucTxtActionPerformed

    private void nosucTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nosucTxtKeyTyped
        char c = evt.getKeyChar(); //Limita los caracteres a ingresar en la caja de texto
        if(c<'0'||c>'9') evt.consume();//Solo permite números
        Toolkit.getDefaultToolkit().beep();
    }//GEN-LAST:event_nosucTxtKeyTyped

    private void nombresucTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresucTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresucTxtActionPerformed

    private void nombresucTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombresucTxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresucTxtKeyTyped

    private void dirsucTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirsucTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dirsucTxtActionPerformed

    private void dirsucTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dirsucTxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_dirsucTxtKeyTyped

    private void guardarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBttnActionPerformed
        Toolkit.getDefaultToolkit().beep(); //Muestra un mensaje y emite un sonido para guardar el registro.
        int i = JOptionPane.showConfirmDialog(this, "¿Desea guardar el registro?");//Switch case de confirmación de gguardado
        switch(i){
            case 0:
                Connection con = null; //Establece la conexión como null
                try{//Try catch a prueba de errores y cierres inesperados del sistema
                    con = getConnection(); //Invoca el método get connection
                    ps = con.prepareStatement("INSERT INTO sucursales (nombre_suc, direccion) VALUES (?,?)");
                    ps.setString(1,nombresucTxt.getText()); //Utiliza el comando de SQL para insertar los datos a la BD
                    ps.setString(2,dirsucTxt.getText());//Ingresa los datos vertidos en lo JText
                    
                    int res = ps.executeUpdate(); //Actualiza
                    ps.close(); //Termina el proceso
                    if(res>0){ //Si al actualizarse se almacenaron mas de 0 datos indica que el guardado se realizó correctamente
                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(null,"Registro guardado"); //Registro guardado en la base de datos
                    } else { //Si no
                        JOptionPane.showMessageDialog(null,"Error al guardar registro"); //Muestra error
                    }
                    con.close(); //Cierra la conexión
                }catch(HeadlessException | SQLException e){
                    System.err.println(e);//Excepción
                }  
                break;
            case 1:
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this,"Registro no guardado"); //No guarda el registro
                break;
            default:
                break;
        }
    }//GEN-LAST:event_guardarBttnActionPerformed

    private void limpiarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBttnActionPerformed
        Toolkit.getDefaultToolkit().beep(); //Muestra un mensaje de advertencia para salir del formulario
        JOptionPane.showMessageDialog(this, "Se borrará el contenido del formulario", "Precaución", JOptionPane.WARNING_MESSAGE);
        int i = JOptionPane.showConfirmDialog(this, "¿Desea continuar?");//Permite al usuario seleccionar si desea hacerlo
        switch(i){
            case 0://En caso de acceder, devuelve los valores del textBox a vaciíos
                nosucTxt.setText(null);
                nombresucTxt.setText(null);
                dirsucTxt.setText(null);
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this,"Limpieza exitosa"); //Muestra un mensaje de haber realizzado la limpieza bien
                break;
            case 1:
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this,"Limpieza no realizada"); //Indica que no se realizó la acción
                break;
            default:
                break;
        }
    }//GEN-LAST:event_limpiarBttnActionPerformed

    private void EditarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBttnActionPerformed
        Toolkit.getDefaultToolkit().beep(); //Muestra un recuadro de seleccion para que el usuario edite los registros.
        int i = JOptionPane.showConfirmDialog(this,"¿Desea editar el registro?");
        switch (i){
            case 0:
                Connection con = null; //Establece la conexión como null
                try{//Try catch a prueba de errores y cierres inesperados del sistema
                    con = getConnection(); //Invoca el método get connection
                    ps = con.prepareStatement("UPDATE sucursales SET nombre_suc=?,direccion=? WHERE sucursal=?");
                    ps.setString(1,nombresucTxt.getText()); //Utiliza el comando de SQL para modificar los datos a la BD
                    ps.setString(2,dirsucTxt.getText());//Ingresa los datos vertidos en lo JText
                    ps.setString(3,nosucTxt.getText());
                    
                    int res = ps.executeUpdate(); //Actualiza
                    ps.close(); //Termina el proceso
                    if(res>0){ //Si al actualizarse se modificaron mas de 0 datos indica que la modificación se realizó correctamente
                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(null,"Registro modificado exitosamente"); //Registro guardado en la base de datos
                    } else { //Si no
                        JOptionPane.showMessageDialog(null,"Error al modificar registro"); //Muestra error
                    }
                    con.close(); //Cierra la conexión
                }catch(HeadlessException | SQLException e){
                    System.err.println(e);//Excepción
                }
                break;
            case 1:
                JOptionPane.showMessageDialog(this,"No se han realizadoo cambios");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_EditarBttnActionPerformed

    private void salirBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBttnActionPerformed
        Toolkit.getDefaultToolkit().beep(); //Muestra una advertencia de la salida del formulario
        JOptionPane.showMessageDialog(this, "Esta a punto de salir del formulario", "Precaución", JOptionPane.WARNING_MESSAGE);
        int i = JOptionPane.showConfirmDialog(this, "¿Desea salir?");
        switch(i){//si el usuario decide salir, se cerrará el formulario, de lo contrario, se mantendrá abierto
            case 0:
                dispose();//Cierra el formulario
                break;
            case 1:
                break;
            default:
                break;
        }
    }//GEN-LAST:event_salirBttnActionPerformed

    private void elimBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimBttnActionPerformed
        Toolkit.getDefaultToolkit().beep(); //Muestra un mensaje de advertencia para eliminar datos del formulario
        JOptionPane.showMessageDialog(this, "Se borrará el registro", "Precaución", JOptionPane.WARNING_MESSAGE);
        int i = JOptionPane.showConfirmDialog(this, "¿Desea continuar?");//Permite al usuario seleccionar si desea hacerlo
        switch(i){
            case 0://En caso de acceder, eliminará el registro seleccionado
                Connection con = null; //Establece la conexión como null
                try{//Try catch a prueba de errores y cierres inesperados del sistema
                    con = getConnection(); //Invoca el método get connection
                    ps = con.prepareStatement("DELETE FROM sucursales WHERE sucursal=?");//Utiliza el comando de SQL para eliminar los datos de la BD
                                     
                    ps.setInt(1,Integer.parseInt(nosucTxt.getText()));//elimina los datos vertidos en el JText
                                                        
                    int res = ps.executeUpdate(); //Actualiza
                    ps.close(); //Termina el proceso
                    if(res>0){ //Si al actualizarse se eliminaron mas de 0 datos indica que se ha borrado el registro
                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(null,"Registro eliminado correctamente"); //Registro guardado en la base de datos
                    } else { //Si no
                        JOptionPane.showMessageDialog(null,"Error al eliminar registro"); //Muestra error
                    }
                    con.close(); //Cierra la conexión
                }catch(HeadlessException | SQLException e){
                    System.err.println(e);//Excepción
                }    
                break;
            case 1:
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this,"Registro no eliminado"); //Indica que no se realizó la acción
                break;
            default:
                break;
        }
    }//GEN-LAST:event_elimBttnActionPerformed

    private void buscarInvBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarInvBajasActionPerformed
        Connection con = null; //Establece como null la conexión con la BD
        try{
            con = getConnection(); //establece conexión con la BD
            ps = con.prepareStatement("SELECT * FROM sucursales WHERE sucursal = ?"); //realiza la busqueda de sucursal
            ps.setString(1,nosucTxt.getText()); //en la tabla a través del numero de sucursal

            rs = ps.executeQuery(); //Ejecuta consulta SQL

            if(rs.next()){ //Si encuentra algo:
                nombresucTxt.setText(rs.getString("nombre_suc")); //Coloca en los campos de texto el resultado
                dirsucTxt.setText(rs.getString("direccion"));
            } else { //Si no, indica que no existe el empleado
                JOptionPane.showMessageDialog(null,"No existe ninguna sucursal con ese número");
            }
        } catch (SQLException e){ //Previene errores
            System.out.println(e);
        }
    }//GEN-LAST:event_buscarInvBajasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditarBttn;
    private javax.swing.JButton buscarInvBajas;
    private javax.swing.JLabel dirsucEt;
    private javax.swing.JTextField dirsucTxt;
    private javax.swing.JButton elimBttn;
    private javax.swing.JButton guardarBttn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiarBttn;
    private javax.swing.JLabel nombresucEt;
    private javax.swing.JTextField nombresucTxt;
    private javax.swing.JLabel nosucEt;
    private javax.swing.JTextField nosucTxt;
    private javax.swing.JButton salirBttn;
    // End of variables declaration//GEN-END:variables
}
