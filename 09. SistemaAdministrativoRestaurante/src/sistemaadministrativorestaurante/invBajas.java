package sistemaadministrativorestaurante;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class invBajas extends javax.swing.JInternalFrame {

        //Atributos
    public static final String URL = "jdbc:mysql://localhost:3306/proyecto?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "root"; //Ubicación de la base de datos, nombre de usuario y contraseña de la BD
    public static final String PASSWORD = "Isaac110696..";
    PreparedStatement ps; //Invocar Prepared statement y Result set
    ResultSet rs; 
    
    public invBajas() {
        initComponents();
    }
    
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        codArtInvBajasEt = new javax.swing.JLabel();
        codArtInvBajasText = new javax.swing.JTextField();
        nomArtInvBajasEt = new javax.swing.JLabel();
        nomArtInvBajasText = new javax.swing.JTextField();
        noSucInvBajasEt = new javax.swing.JLabel();
        noSucInvBajasText = new javax.swing.JTextField();
        existenciasInvBajasEt = new javax.swing.JLabel();
        existenciasInvBajasText = new javax.swing.JTextField();
        marcaInvBajasEt = new javax.swing.JLabel();
        marcaInvBajasText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        salirInvBajas = new javax.swing.JButton();
        buscarInvBajas = new javax.swing.JButton();
        elimInvBajas = new javax.swing.JButton();

        setTitle("Baja de producto");

        codArtInvBajasEt.setText("Código del artículo");

        codArtInvBajasText.setText("Ingresar código");
        codArtInvBajasText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codArtInvBajasTextActionPerformed(evt);
            }
        });
        codArtInvBajasText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codArtInvBajasTextKeyTyped(evt);
            }
        });

        nomArtInvBajasEt.setText("Nombre del artículo");

        nomArtInvBajasText.setText("Mostrar nombre");
        nomArtInvBajasText.setEnabled(false);
        nomArtInvBajasText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomArtInvBajasTextActionPerformed(evt);
            }
        });

        noSucInvBajasEt.setText("Número de sucursal");

        noSucInvBajasText.setText("Mostrar sucursal");
        noSucInvBajasText.setEnabled(false);
        noSucInvBajasText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noSucInvBajasTextActionPerformed(evt);
            }
        });

        existenciasInvBajasEt.setText("Existencia");

        existenciasInvBajasText.setText("Mostrar existencias");
        existenciasInvBajasText.setEnabled(false);
        existenciasInvBajasText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existenciasInvBajasTextActionPerformed(evt);
            }
        });

        marcaInvBajasEt.setText("Marca");

        marcaInvBajasText.setText("Mostrar marca");
        marcaInvBajasText.setEnabled(false);
        marcaInvBajasText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaInvBajasTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(marcaInvBajasEt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(existenciasInvBajasEt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(noSucInvBajasEt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(codArtInvBajasEt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(nomArtInvBajasEt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(codArtInvBajasText)
                    .addComponent(nomArtInvBajasText)
                    .addComponent(noSucInvBajasText)
                    .addComponent(existenciasInvBajasText)
                    .addComponent(marcaInvBajasText))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(codArtInvBajasEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codArtInvBajasText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomArtInvBajasEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomArtInvBajasText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noSucInvBajasEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noSucInvBajasText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(existenciasInvBajasEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(existenciasInvBajasText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marcaInvBajasEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marcaInvBajasText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        salirInvBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        salirInvBajas.setText("Salir");
        salirInvBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirInvBajasActionPerformed(evt);
            }
        });

        buscarInvBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AppListIcon.targetsize-24.png"))); // NOI18N
        buscarInvBajas.setText("Buscar");
        buscarInvBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarInvBajasActionPerformed(evt);
            }
        });

        elimInvBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/remove.png"))); // NOI18N
        elimInvBajas.setText("Eliminar");
        elimInvBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimInvBajasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salirInvBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elimInvBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarInvBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscarInvBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(elimInvBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salirInvBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void marcaInvBajasTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaInvBajasTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaInvBajasTextActionPerformed

    private void existenciasInvBajasTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existenciasInvBajasTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_existenciasInvBajasTextActionPerformed

    private void noSucInvBajasTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSucInvBajasTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noSucInvBajasTextActionPerformed

    private void nomArtInvBajasTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomArtInvBajasTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomArtInvBajasTextActionPerformed

    private void codArtInvBajasTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codArtInvBajasTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codArtInvBajasTextActionPerformed

    private void salirInvBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirInvBajasActionPerformed
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
    }//GEN-LAST:event_salirInvBajasActionPerformed

    private void codArtInvBajasTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codArtInvBajasTextKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();//Limita los caracteres a solo números
    }//GEN-LAST:event_codArtInvBajasTextKeyTyped

    private void elimInvBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimInvBajasActionPerformed
        Toolkit.getDefaultToolkit().beep(); //Muestra un mensaje de advertencia para eliminar datos del formulario
        JOptionPane.showMessageDialog(this, "Se borrará el registro", "Precaución", JOptionPane.WARNING_MESSAGE);
        int i = JOptionPane.showConfirmDialog(this, "¿Desea continuar?");//Permite al usuario seleccionar si desea hacerlo
        switch(i){
            case 0://En caso de acceder, eliminará el registro seleccionado
                Connection con = null; //Establece la conexión como null
                try{//Try catch a prueba de errores y cierres inesperados del sistema
                    con = getConnection(); //Invoca el método get connection
                    ps = con.prepareStatement("DELETE FROM inventario WHERE cod_prod=?");//Utiliza el comando de SQL para eliminar los datos de la BD
                                     
                    ps.setInt(1,Integer.parseInt(codArtInvBajasText.getText()));//elimina los datos vertidos en lo JText
                                                        
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
    }//GEN-LAST:event_elimInvBajasActionPerformed

    private void buscarInvBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarInvBajasActionPerformed
        Connection con = null; //Establece como null la conexión con la BD
        try{
            con = getConnection(); //establece conexión con la BD
            ps = con.prepareStatement("SELECT * FROM inventario WHERE cod_prod = ?"); //realiza la busqueda del producto
            ps.setString(1,codArtInvBajasText.getText()); //en la tabla a través del no_empleado
            
            rs = ps.executeQuery(); //Ejecuta consulta SQL
            
            if(rs.next()){ //Si encuentra algo:
                nomArtInvBajasText.setText(rs.getString("articulo")); //Coloca en los campos de texto el resultado
                noSucInvBajasText.setText(rs.getString("sucursal2"));
                existenciasInvBajasText.setText(rs.getString("existencia"));
                marcaInvBajasText.setText(rs.getString("marca"));
            } else { //Si no, indica que no existe el empleado
                JOptionPane.showMessageDialog(null,"No existe ningún producto con esa clave");
            }                    
        } catch (SQLException e){ //Previene errores
            System.out.println(e);
        }
    }//GEN-LAST:event_buscarInvBajasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarInvBajas;
    private javax.swing.JLabel codArtInvBajasEt;
    private javax.swing.JTextField codArtInvBajasText;
    private javax.swing.JButton elimInvBajas;
    private javax.swing.JLabel existenciasInvBajasEt;
    private javax.swing.JTextField existenciasInvBajasText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel marcaInvBajasEt;
    private javax.swing.JTextField marcaInvBajasText;
    private javax.swing.JLabel noSucInvBajasEt;
    private javax.swing.JTextField noSucInvBajasText;
    private javax.swing.JLabel nomArtInvBajasEt;
    private javax.swing.JTextField nomArtInvBajasText;
    private javax.swing.JButton salirInvBajas;
    // End of variables declaration//GEN-END:variables
}
