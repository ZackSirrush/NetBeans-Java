package sistemaadministrativorestaurante;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class nomina extends javax.swing.JInternalFrame {

    //Atributos
    public static final String URL = "jdbc:mysql://localhost:3306/proyecto?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "root"; //Ubicación de la base de datos, nombre de usuario y contraseña de la BD
    public static final String PASSWORD = "Isaac110696..";
    PreparedStatement ps; //Invocar Prepared statement y Result set
    ResultSet rs; 
    public nomina() {
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
        noempEt = new javax.swing.JLabel();
        noempTxt = new javax.swing.JTextField();
        areaEt = new javax.swing.JLabel();
        areaTxt = new javax.swing.JTextField();
        desemEt = new javax.swing.JLabel();
        desemCB = new javax.swing.JComboBox<>();
        incentEt = new javax.swing.JLabel();
        incentTxt = new javax.swing.JTextField();
        diastrabEt = new javax.swing.JLabel();
        diastrabTxt = new javax.swing.JTextField();
        incentEt2 = new javax.swing.JLabel();
        salarioTxt = new javax.swing.JTextField();
        descuentosEt = new javax.swing.JLabel();
        descuentosTxt = new javax.swing.JTextField();
        totalEt = new javax.swing.JLabel();
        totalTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        guardarBttn = new javax.swing.JButton();
        limpiarBttn = new javax.swing.JButton();
        salirBttn = new javax.swing.JButton();
        buscarInvBajas = new javax.swing.JButton();
        elimInvBajas = new javax.swing.JButton();

        setTitle("Nómina");

        noempEt.setText("Número de empleado");

        noempTxt.setText("Buscar número de empleado");
        noempTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noempTxtActionPerformed(evt);
            }
        });
        noempTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noempTxtKeyTyped(evt);
            }
        });

        areaEt.setText("Área");

        areaTxt.setText("Ingresar área laboral");
        areaTxt.setEnabled(false);
        areaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTxtActionPerformed(evt);
            }
        });

        desemEt.setText("Desempeño");

        desemCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Excelente", "Bueno", "Regular", "Malo", "Pésimo", " " }));

        incentEt.setText("Incentivos");

        incentTxt.setText("Ingresar incentivos");
        incentTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incentTxtActionPerformed(evt);
            }
        });
        incentTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                incentTxtKeyTyped(evt);
            }
        });

        diastrabEt.setText("Días trabajados");

        diastrabTxt.setText("Ingresar días trabajados");
        diastrabTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diastrabTxtActionPerformed(evt);
            }
        });
        diastrabTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                diastrabTxtKeyTyped(evt);
            }
        });

        incentEt2.setText("Salario");

        salarioTxt.setText("Ingresar salario");
        salarioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioTxtActionPerformed(evt);
            }
        });
        salarioTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salarioTxtKeyTyped(evt);
            }
        });

        descuentosEt.setText("Descuentos");

        descuentosTxt.setText("Ingresar los descuentos");
        descuentosTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descuentosTxtActionPerformed(evt);
            }
        });
        descuentosTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descuentosTxtKeyTyped(evt);
            }
        });

        totalEt.setText("Total");

        totalTxt.setText("Calcular total");
        totalTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTxtActionPerformed(evt);
            }
        });
        totalTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalTxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(noempTxt)
                        .addComponent(noempEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(areaTxt)
                        .addComponent(areaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(salarioTxt)
                        .addComponent(incentEt2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(desemCB, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desemEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(incentTxt)
                        .addComponent(incentEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(diastrabTxt)
                        .addComponent(diastrabEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(totalTxt)
                        .addComponent(totalEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(descuentosTxt)
                        .addComponent(descuentosEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(noempEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(incentEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(incentTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(areaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(areaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(diastrabEt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diastrabTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(desemEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desemCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(descuentosEt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descuentosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(incentEt2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(salarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(totalEt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        salirBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        salirBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBttnActionPerformed(evt);
            }
        });

        buscarInvBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AppListIcon.targetsize-24.png"))); // NOI18N
        buscarInvBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarInvBajasActionPerformed(evt);
            }
        });

        elimInvBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/remove.png"))); // NOI18N
        elimInvBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimInvBajasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guardarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(limpiarBttn)
                .addGap(18, 18, 18)
                .addComponent(buscarInvBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(elimInvBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salirBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(elimInvBajas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guardarBttn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(limpiarBttn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(salirBttn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarInvBajas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noempTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noempTxtActionPerformed

    }//GEN-LAST:event_noempTxtActionPerformed

    private void noempTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noempTxtKeyTyped
        char c = evt.getKeyChar(); //Limita los caracteres a ingresar en la caja de texto
        if(c<'0'||c>'9') evt.consume();//Solo permite números
        Toolkit.getDefaultToolkit().beep();
    }//GEN-LAST:event_noempTxtKeyTyped

    private void areaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTxtActionPerformed

    private void incentTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incentTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incentTxtActionPerformed

    private void incentTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_incentTxtKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='.'){//Limita el text Box de incentivos
            evt.consume();                                               //a números con punto decimal
            Toolkit.getDefaultToolkit().beep();
        }
        if(evt.getKeyChar()=='.'&&incentTxt.getText().contains(".")){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_incentTxtKeyTyped

    private void diastrabTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diastrabTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diastrabTxtActionPerformed

    private void diastrabTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diastrabTxtKeyTyped
        if(diastrabTxt.getText().length() >= 2){//Limita el textBox de sucursal a dos número 
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        } 
    }//GEN-LAST:event_diastrabTxtKeyTyped

    private void salarioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarioTxtActionPerformed

    private void salarioTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salarioTxtKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='.'){//Limita el text Box de salario
            evt.consume();                                               //a números con punto decimal
            Toolkit.getDefaultToolkit().beep();
        }
        if(evt.getKeyChar()=='.'&&salarioTxt.getText().contains(".")){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();                
        }
    }//GEN-LAST:event_salarioTxtKeyTyped

    private void descuentosTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descuentosTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descuentosTxtActionPerformed

    private void descuentosTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descuentosTxtKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='.'){//Limita el text Box de salario
            evt.consume();                                               //a números con punto decimal
            Toolkit.getDefaultToolkit().beep();
        }
        if(evt.getKeyChar()=='.'&&descuentosTxt.getText().contains(".")){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();                
        }
    }//GEN-LAST:event_descuentosTxtKeyTyped

    private void totalTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTxtActionPerformed

    }//GEN-LAST:event_totalTxtActionPerformed

    private void totalTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalTxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTxtKeyTyped

    private void guardarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBttnActionPerformed
        Toolkit.getDefaultToolkit().beep(); //Muestra un mensaje y emite un sonido para guardar el registro.
        int i = JOptionPane.showConfirmDialog(this, "¿Desea guardar el registro?");//Switch case de confirmación de gguardado
        switch(i){
            case 0:
               Connection con = null; //Establece la conexión como null
                try{//Try catch a prueba de errores y cierres inesperados del sistema
                    con = getConnection(); //Invoca el método get connection
                    ps = con.prepareStatement("INSERT INTO nomina (no_empleado2, area, salario, "
                            + "incentivo, dias, descuentos, total, desempeño) VALUES (?,?,?,?,?,?,?,?)");
                    ps.setString(1,noempTxt.getText()); //Utiliza el comando de SQL para insertar los datos a la BD
                    ps.setString(2,areaTxt.getText());//Ingresa los datos vertidos en lo JText
                    ps.setString(3,salarioTxt.getText());
                    ps.setString(4,incentTxt.getText());
                    ps.setString(5,diastrabTxt.getText());
                    ps.setString(6,descuentosTxt.getText());
                    ps.setString(7,totalTxt.getText());
                    ps.setString(8, (String) desemCB.getSelectedItem());
                                        
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
            noempTxt.setText(null);
            salarioTxt.setText(null);
            diastrabTxt.setText(null);
            descuentosTxt.setText(null);
            areaTxt.setText(null);
            totalTxt.setText(null);
            incentTxt.setText(null);
            desemCB.setSelectedIndex(0);
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

    private void buscarInvBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarInvBajasActionPerformed
        Connection con = null; //Establece la conexión de la BD como null
        try{ //Método try-catch
            con = getConnection(); //Establece conexión con la BD
            ps = con.prepareStatement("SELECT * FROM personal WHERE no_empleado = ?"); //Consulta SQL
            ps.setString(1,noempTxt.getText());//Busca en la tabla personal con el no_empleado
            
            rs = ps.executeQuery(); //Ejecuta la consulta
            
            if(rs.next()){ //Si encuentra algo, 
                areaTxt.setText(rs.getString("area"));//Coloca en el espacio designado el resultado
            } else { //Si no
                JOptionPane.showMessageDialog(null,"No existe nadie con esa clave"); //Indica que no existe la clave
            }                    
        } catch (SQLException e){ //Recibe error
            System.out.println(e);
        }
    }//GEN-LAST:event_buscarInvBajasActionPerformed

    private void elimInvBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimInvBajasActionPerformed
        Toolkit.getDefaultToolkit().beep(); //Muestra un mensaje de advertencia para eliminar datos del formulario
        JOptionPane.showMessageDialog(this, "Se borrará el registro", "Precaución", JOptionPane.WARNING_MESSAGE);
        int i = JOptionPane.showConfirmDialog(this, "¿Desea continuar?");//Permite al usuario seleccionar si desea hacerlo
        switch(i){
            case 0://En caso de acceder, eliminará el registro seleccionado
            Connection con = null; //Establece la conexión como null
            try{//Try catch a prueba de errores y cierres inesperados del sistema
                con = getConnection(); //Invoca el método get connection
                ps = con.prepareStatement("DELETE FROM nomina WHERE no_empleado2=?");//Utiliza el comando de SQL para eliminar los datos de la BD

                ps.setInt(1,Integer.parseInt(noempTxt.getText()));//elimina los datos vertidos en lo JText

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaEt;
    private javax.swing.JTextField areaTxt;
    private javax.swing.JButton buscarInvBajas;
    private javax.swing.JLabel descuentosEt;
    private javax.swing.JTextField descuentosTxt;
    private javax.swing.JComboBox<String> desemCB;
    private javax.swing.JLabel desemEt;
    private javax.swing.JLabel diastrabEt;
    private javax.swing.JTextField diastrabTxt;
    private javax.swing.JButton elimInvBajas;
    private javax.swing.JButton guardarBttn;
    private javax.swing.JLabel incentEt;
    private javax.swing.JLabel incentEt2;
    private javax.swing.JTextField incentTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpiarBttn;
    private javax.swing.JLabel noempEt;
    private javax.swing.JTextField noempTxt;
    private javax.swing.JTextField salarioTxt;
    private javax.swing.JButton salirBttn;
    private javax.swing.JLabel totalEt;
    private javax.swing.JTextField totalTxt;
    // End of variables declaration//GEN-END:variables
}
