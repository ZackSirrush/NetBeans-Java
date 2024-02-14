package sistemaadministrativorestaurante;

//Importar librerias necesarias
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class InvAltas extends javax.swing.JInternalFrame { //Formulario
    
    //Atributos
    public static final String URL = "jdbc:mysql://localhost:3306/proyecto?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "root"; //Ubicación de la base de datos, nombre de usuario y contraseña de la BD
    public static final String PASSWORD = "Isaac110696..";
    PreparedStatement ps; //Invocar Prepared statement y Result set
    ResultSet rs;   
   
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
    
    public InvAltas() {
        initComponents();//Inicializa componentes
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nomArtEt = new javax.swing.JLabel();
        codArtInvAltas = new javax.swing.JTextField();
        codArtEt = new javax.swing.JLabel();
        nomArtText = new javax.swing.JTextField();
        sucursalEt = new javax.swing.JLabel();
        sucursalText = new javax.swing.JTextField();
        existenciaEt = new javax.swing.JLabel();
        existenciaText = new javax.swing.JTextField();
        marcaEt = new javax.swing.JLabel();
        marcaText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        salirInvAltas = new javax.swing.JButton();
        limpInvAltas = new javax.swing.JButton();
        guardarInvAltas = new javax.swing.JButton();

        setTitle("Alta de productos");

        nomArtEt.setText("Nombre del artículo");

        codArtInvAltas.setEditable(false);
        codArtInvAltas.setText("Ingresar código");
        codArtInvAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codArtInvAltasActionPerformed(evt);
            }
        });
        codArtInvAltas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codArtInvAltasKeyTyped(evt);
            }
        });

        codArtEt.setText("Código del artículo");

        nomArtText.setText("Ingresar nombre");
        nomArtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomArtTextActionPerformed(evt);
            }
        });

        sucursalEt.setText("Sucursal");

        sucursalText.setText("Ingresar sucursal");
        sucursalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalTextActionPerformed(evt);
            }
        });
        sucursalText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sucursalTextKeyTyped(evt);
            }
        });

        existenciaEt.setText("Existencia");

        existenciaText.setText("Ingresar existencias");
        existenciaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existenciaTextActionPerformed(evt);
            }
        });
        existenciaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                existenciaTextKeyTyped(evt);
            }
        });

        marcaEt.setText("Marca");

        marcaText.setText("Ingresar marca");
        marcaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(marcaEt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(existenciaEt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(sucursalEt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(codArtEt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(nomArtEt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(marcaText)
                    .addComponent(existenciaText)
                    .addComponent(sucursalText)
                    .addComponent(nomArtText)
                    .addComponent(codArtInvAltas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codArtEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codArtInvAltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomArtEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomArtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sucursalEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sucursalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(existenciaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(existenciaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marcaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marcaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        salirInvAltas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        salirInvAltas.setText("Salir");
        salirInvAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirInvAltasActionPerformed(evt);
            }
        });

        limpInvAltas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gnome_edit_clear.png"))); // NOI18N
        limpInvAltas.setText("Limpiar");
        limpInvAltas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        limpInvAltas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        limpInvAltas.setIconTextGap(1);
        limpInvAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpInvAltasActionPerformed(evt);
            }
        });

        guardarInvAltas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        guardarInvAltas.setText("Guardar");
        guardarInvAltas.setDefaultCapable(false);
        guardarInvAltas.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        guardarInvAltas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        guardarInvAltas.setIconTextGap(1);
        guardarInvAltas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        guardarInvAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarInvAltasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limpInvAltas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guardarInvAltas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salirInvAltas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(guardarInvAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(limpInvAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salirInvAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codArtInvAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codArtInvAltasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codArtInvAltasActionPerformed

    private void nomArtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomArtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomArtTextActionPerformed

    private void sucursalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sucursalTextActionPerformed

    private void existenciaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existenciaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_existenciaTextActionPerformed

    private void marcaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaTextActionPerformed

    private void guardarInvAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarInvAltasActionPerformed
        Toolkit.getDefaultToolkit().beep(); //Muestra un mensaje y emite un sonido para guardar el registro.
        int i = JOptionPane.showConfirmDialog(this, "¿Desea guardar el registro?");//Switch case de confirmación de gguardado
        switch(i){
            case 0: //En caso de aceptar guardar los cambios
                Connection con = null; //Establece la conexión como null
                try{//Try catch a prueba de errores y cierres inesperados del sistema
                    con = getConnection(); //Invoca el método get connection
                    ps = con.prepareStatement("INSERT INTO inventario (articulo, sucursal2, existencia, marca) VALUES (?,?,?,?)");
                    ps.setString(1,nomArtText.getText()); //Utiliza el comando de SQL para insertar los datos a la BD
                    ps.setString(2,sucursalText.getText());//Ingresa los datos vertidos en lo JText
                    ps.setString(3,existenciaText.getText());
                    ps.setString(4,marcaText.getText());
                    
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
            default: //Al pulsar cancelar se omite el guardado.
                break;
        }
    }//GEN-LAST:event_guardarInvAltasActionPerformed
   
    private void limpInvAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpInvAltasActionPerformed
        Toolkit.getDefaultToolkit().beep(); //Muestra un mensaje de advertencia para salir del formulario
        JOptionPane.showMessageDialog(this, "Se borrará el contenido del formulario", "Precaución", JOptionPane.WARNING_MESSAGE);
        int i = JOptionPane.showConfirmDialog(this, "¿Desea continuar?");//Permite al usuario seleccionar si desea hacerlo
        switch(i){
            case 0:
                codArtInvAltas.setText(null);
                nomArtText.setText(null);
                sucursalText.setText(null);        
                existenciaText.setText(null);
                marcaText.setText(null);
                JOptionPane.showMessageDialog(this,"Limpieza exitosa"); //Muestra un mensaje de haber realizzado la limpieza bien
                break;
            case 1:
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this,"Limpieza no realizada"); //Indica que no se realizó la acción
                break;
            default:
                break;
        }
    }//GEN-LAST:event_limpInvAltasActionPerformed

    private void salirInvAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirInvAltasActionPerformed
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
    }//GEN-LAST:event_salirInvAltasActionPerformed

    private void codArtInvAltasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codArtInvAltasKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();//Permite solo agregar números al TextBox
        Toolkit.getDefaultToolkit().beep();
    }//GEN-LAST:event_codArtInvAltasKeyTyped

    private void existenciaTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_existenciaTextKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();//Permite solo agregar números al TextBox
        Toolkit.getDefaultToolkit().beep();
    }//GEN-LAST:event_existenciaTextKeyTyped

    private void sucursalTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sucursalTextKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();//Permite solo agregar números al TextBox
        Toolkit.getDefaultToolkit().beep();
    }//GEN-LAST:event_sucursalTextKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codArtEt;
    private javax.swing.JTextField codArtInvAltas;
    private javax.swing.JLabel existenciaEt;
    private javax.swing.JTextField existenciaText;
    private javax.swing.JButton guardarInvAltas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpInvAltas;
    private javax.swing.JLabel marcaEt;
    private javax.swing.JTextField marcaText;
    private javax.swing.JLabel nomArtEt;
    private javax.swing.JTextField nomArtText;
    private javax.swing.JButton salirInvAltas;
    private javax.swing.JLabel sucursalEt;
    private javax.swing.JTextField sucursalText;
    // End of variables declaration//GEN-END:variables
}
