package sistemaadministrativorestaurante;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class invModif extends javax.swing.JInternalFrame {

    //Atributos
    public static final String URL = "jdbc:mysql://localhost:3306/proyecto?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "root"; //Ubicación de la base de datos, nombre de usuario y contraseña de la BD
    public static final String PASSWORD = "Isaac110696..";
    PreparedStatement ps; //Invocar Prepared statement y Result set
    ResultSet rs; 
    
    public invModif() {
        initComponents();//Inicializa componentes
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
        codArtInvModifEt = new javax.swing.JLabel();
        codArtInvModifText = new javax.swing.JTextField();
        nomArtInvModifEt = new javax.swing.JLabel();
        nomArtInvModifText = new javax.swing.JTextField();
        noSucInvModifEt = new javax.swing.JLabel();
        noSucInvModifText = new javax.swing.JTextField();
        existenciasInvModifEt = new javax.swing.JLabel();
        existenciasInvModifText = new javax.swing.JTextField();
        marcaInvModifEt = new javax.swing.JLabel();
        marcaInvModifText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        buscarInvModif = new javax.swing.JButton();
        salirInvModif = new javax.swing.JButton();
        EditarBttn = new javax.swing.JButton();

        setTitle("Modificar productos");
        setToolTipText("");

        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        codArtInvModifEt.setText("Código del artículo");

        codArtInvModifText.setText("Ingresar código");
        codArtInvModifText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codArtInvModifTextActionPerformed(evt);
            }
        });
        codArtInvModifText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codArtInvModifTextKeyTyped(evt);
            }
        });

        nomArtInvModifEt.setText("Nombre del artículo");

        nomArtInvModifText.setText("Ingresar nombre");
        nomArtInvModifText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomArtInvModifTextActionPerformed(evt);
            }
        });

        noSucInvModifEt.setText("Número de sucursal");

        noSucInvModifText.setText("Ingresar sucursal");
        noSucInvModifText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noSucInvModifTextActionPerformed(evt);
            }
        });

        existenciasInvModifEt.setText("Existencia");

        existenciasInvModifText.setText("Ingresar existencias");
        existenciasInvModifText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existenciasInvModifTextActionPerformed(evt);
            }
        });
        existenciasInvModifText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                existenciasInvModifTextKeyTyped(evt);
            }
        });

        marcaInvModifEt.setText("Marca");

        marcaInvModifText.setText("Ingresar marca");
        marcaInvModifText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaInvModifTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(marcaInvModifEt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(existenciasInvModifEt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(noSucInvModifEt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(codArtInvModifEt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(nomArtInvModifEt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(codArtInvModifText)
                    .addComponent(nomArtInvModifText)
                    .addComponent(noSucInvModifText)
                    .addComponent(existenciasInvModifText)
                    .addComponent(marcaInvModifText))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(codArtInvModifEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codArtInvModifText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomArtInvModifEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomArtInvModifText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noSucInvModifEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noSucInvModifText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(existenciasInvModifEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(existenciasInvModifText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marcaInvModifEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marcaInvModifText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        buscarInvModif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AppListIcon.targetsize-24.png"))); // NOI18N
        buscarInvModif.setText("Buscar");
        buscarInvModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarInvModifActionPerformed(evt);
            }
        });

        salirInvModif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        salirInvModif.setText("Salir");
        salirInvModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirInvModifActionPerformed(evt);
            }
        });

        EditarBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document_save_as.png"))); // NOI18N
        EditarBttn.setText("Modificar");
        EditarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salirInvModif, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(buscarInvModif, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(EditarBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(buscarInvModif, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EditarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salirInvModif, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void codArtInvModifTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codArtInvModifTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codArtInvModifTextActionPerformed

    private void nomArtInvModifTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomArtInvModifTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomArtInvModifTextActionPerformed

    private void noSucInvModifTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSucInvModifTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noSucInvModifTextActionPerformed

    private void existenciasInvModifTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existenciasInvModifTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_existenciasInvModifTextActionPerformed

    private void marcaInvModifTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaInvModifTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaInvModifTextActionPerformed

    private void salirInvModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirInvModifActionPerformed
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
    }//GEN-LAST:event_salirInvModifActionPerformed

    private void codArtInvModifTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codArtInvModifTextKeyTyped
        char c = evt.getKeyChar();//Limita caracteres a números
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_codArtInvModifTextKeyTyped

    private void existenciasInvModifTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_existenciasInvModifTextKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume(); //Limita caracteres a números
    }//GEN-LAST:event_existenciasInvModifTextKeyTyped

    private void buscarInvModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarInvModifActionPerformed
        Connection con = null; //Establece como null la conexión con la BD
        try{
            con = getConnection(); //establece conexión con la BD
            ps = con.prepareStatement("SELECT * FROM inventario WHERE cod_prod = ?"); //realiza la busqueda del producto
            ps.setString(1,codArtInvModifText.getText()); //en la tabla a través del no_empleado
            
            rs = ps.executeQuery(); //Ejecuta consulta SQL
            
            if(rs.next()){ //Si encuentra algo:
                nomArtInvModifText.setText(rs.getString("articulo")); //Coloca en los campos de texto el resultado
                noSucInvModifText.setText(rs.getString("sucursal2"));
                existenciasInvModifText.setText(rs.getString("existencia"));
                marcaInvModifText.setText(rs.getString("marca"));
            } else { //Si no, indica que no existe el empleado
                JOptionPane.showMessageDialog(null,"No existe ningún producto con esa clave");
            }                    
        } catch (SQLException e){ //Previene errores
            System.out.println(e);
        }
    }//GEN-LAST:event_buscarInvModifActionPerformed

    private void EditarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBttnActionPerformed
        Toolkit.getDefaultToolkit().beep(); //Muestra un recuadro de seleccion para que el usuario edite los registros.
        int i = JOptionPane.showConfirmDialog(this,"¿Desea editar el registro?");
        switch (i){
            case 0:
                Connection con = null; //Establece la conexión como null
                try{//Try catch a prueba de errores y cierres inesperados del sistema
                    con = getConnection(); //Invoca el método get connection
                    ps = con.prepareStatement("UPDATE inventario SET articulo=?,sucursal2=?,existencia=?,"
                        + "marca=? WHERE cod_prod=?");
                    ps.setString(1,nomArtInvModifText.getText()); //Utiliza el comando de SQL para modificar los datos a la BD
                    ps.setString(2,noSucInvModifText.getText());//Ingresa los datos vertidos en lo JText
                    ps.setString(3,existenciasInvModifText.getText());
                    ps.setString(4,marcaInvModifText.getText());
                    ps.setString(5,codArtInvModifText.getText());

                    int res = ps.executeUpdate(); //Actualiza
                    ps.close(); //Termina el proceso
                    if(res>0){ //Si al actualizarse se almacenaron mas de 0 datos indica que el guardado se realizó correctamente
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditarBttn;
    private javax.swing.JButton buscarInvModif;
    private javax.swing.JLabel codArtInvModifEt;
    private javax.swing.JTextField codArtInvModifText;
    private javax.swing.JLabel existenciasInvModifEt;
    private javax.swing.JTextField existenciasInvModifText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel marcaInvModifEt;
    private javax.swing.JTextField marcaInvModifText;
    private javax.swing.JLabel noSucInvModifEt;
    private javax.swing.JTextField noSucInvModifText;
    private javax.swing.JLabel nomArtInvModifEt;
    private javax.swing.JTextField nomArtInvModifText;
    private javax.swing.JButton salirInvModif;
    // End of variables declaration//GEN-END:variables
}
