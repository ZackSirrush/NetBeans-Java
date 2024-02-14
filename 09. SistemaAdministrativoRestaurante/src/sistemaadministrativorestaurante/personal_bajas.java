package sistemaadministrativorestaurante;

import java.awt.HeadlessException;
import java.awt.Toolkit; //Importa extensiones a utilizar en el formulario
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class personal_bajas extends javax.swing.JInternalFrame {

    //Atributos
    public static final String URL = "jdbc:mysql://localhost:3306/proyecto?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "root"; //Ubicación de la base de datos, nombre de usuario y contraseña de la BD
    public static final String PASSWORD = "Isaac110696..";
    PreparedStatement ps; //Invocar Prepared statement y Result set
    ResultSet rs; 
    
    public personal_bajas() { 
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
        noempEt = new javax.swing.JLabel();
        noempTxt = new javax.swing.JTextField();
        nomEt = new javax.swing.JLabel();
        nomTxt = new javax.swing.JTextField();
        apEt = new javax.swing.JLabel();
        apTxt = new javax.swing.JTextField();
        amEt = new javax.swing.JLabel();
        amTxt = new javax.swing.JTextField();
        sucursalTxt = new javax.swing.JTextField();
        sucursalEt = new javax.swing.JLabel();
        puestoEt = new javax.swing.JLabel();
        puestoTxt = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        noEmpRhAltaEt = new javax.swing.JLabel();
        noEmpRhAltaText = new javax.swing.JTextField();
        nomRhAltaEt = new javax.swing.JLabel();
        fechaNacEt = new javax.swing.JLabel();
        nomRhAltaText = new javax.swing.JTextField();
        curpRhAltaText = new javax.swing.JTextField();
        rfcRhAltaEt = new javax.swing.JLabel();
        rfcRhAltaText = new javax.swing.JTextField();
        apRhAltaEt = new javax.swing.JLabel();
        apRhAltaText = new javax.swing.JTextField();
        sbRhAltaEt = new javax.swing.JLabel();
        sbRhAltaText = new javax.swing.JTextField();
        amRhAltaEt = new javax.swing.JLabel();
        amRhAltaText = new javax.swing.JTextField();
        puestoRhAltaEt = new javax.swing.JLabel();
        puestoRhAltaText = new javax.swing.JTextField();
        sucRhAltaEt = new javax.swing.JLabel();
        sucRhAltaText = new javax.swing.JTextField();
        curpRhAltaEt = new javax.swing.JLabel();
        fechaIngEt = new javax.swing.JLabel();
        nacTxtdate = new javax.swing.JFormattedTextField();
        ingresoTxtdate = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        guardarRhAlta = new javax.swing.JButton();
        limpiarRhAlta = new javax.swing.JButton();
        salirRhAlta = new javax.swing.JButton();
        curpRhAltaEt1 = new javax.swing.JLabel();
        curpTxt = new javax.swing.JTextField();
        rfcRhAltaEt1 = new javax.swing.JLabel();
        rfcTxt = new javax.swing.JTextField();
        fechaNacEt1 = new javax.swing.JLabel();
        nacTxtdate1 = new javax.swing.JFormattedTextField();
        fechaIngEt1 = new javax.swing.JLabel();
        ingresoTxtdate1 = new javax.swing.JFormattedTextField();
        areaEt = new javax.swing.JLabel();
        areaTxt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        buscarInvBajas = new javax.swing.JButton();
        elimInvBajas = new javax.swing.JButton();
        salirBttn = new javax.swing.JButton();

        setTitle("Baja de personal");
        setPreferredSize(new java.awt.Dimension(431, 534));

        noempEt.setText("Número de empleado");

        noempTxt.setText("Ingresar número de empleado");
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

        nomEt.setText("Nombre(s)");

        nomTxt.setText("Mostrar nombre");
        nomTxt.setEnabled(false);
        nomTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTxtActionPerformed(evt);
            }
        });
        nomTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomTxtKeyTyped(evt);
            }
        });

        apEt.setText("Apellido paterno");
        apEt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apEtKeyTyped(evt);
            }
        });

        apTxt.setText("Mostrar apellido paterno");
        apTxt.setEnabled(false);
        apTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apTxtActionPerformed(evt);
            }
        });
        apTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apTxtKeyTyped(evt);
            }
        });

        amEt.setText("Apellido materno");

        amTxt.setText("Mostrar apellido materno");
        amTxt.setEnabled(false);
        amTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amTxtActionPerformed(evt);
            }
        });
        amTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amTxtKeyTyped(evt);
            }
        });

        sucursalTxt.setText("Mostrar sucursal");
        sucursalTxt.setEnabled(false);
        sucursalTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalTxtActionPerformed(evt);
            }
        });
        sucursalTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sucursalTxtKeyTyped(evt);
            }
        });

        sucursalEt.setText("Sucursal");

        puestoEt.setText("Puesto");

        puestoTxt.setText("Mostrar puesto");
        puestoTxt.setEnabled(false);
        puestoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puestoTxtActionPerformed(evt);
            }
        });

        jInternalFrame1.setTitle("Alta de personal");

        noEmpRhAltaEt.setText("Número de empleado");

        noEmpRhAltaText.setText("Ingresar número de empleado");
        noEmpRhAltaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noEmpRhAltaTextActionPerformed(evt);
            }
        });
        noEmpRhAltaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noEmpRhAltaTextKeyTyped(evt);
            }
        });

        nomRhAltaEt.setText("Nombre(s)");

        fechaNacEt.setText("Fecha de nacimiento");

        nomRhAltaText.setText("Ingresar nombre");
        nomRhAltaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomRhAltaTextActionPerformed(evt);
            }
        });
        nomRhAltaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomRhAltaTextKeyTyped(evt);
            }
        });

        curpRhAltaText.setText("Ingresar CURP");
        curpRhAltaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curpRhAltaTextActionPerformed(evt);
            }
        });
        curpRhAltaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                curpRhAltaTextKeyTyped(evt);
            }
        });

        rfcRhAltaEt.setText("RFC");

        rfcRhAltaText.setText("XAXX010101000");
        rfcRhAltaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfcRhAltaTextActionPerformed(evt);
            }
        });
        rfcRhAltaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rfcRhAltaTextKeyTyped(evt);
            }
        });

        apRhAltaEt.setText("Apellido paterno");
        apRhAltaEt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apRhAltaEtKeyTyped(evt);
            }
        });

        apRhAltaText.setText("Ingresar apellido paterno");
        apRhAltaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apRhAltaTextActionPerformed(evt);
            }
        });
        apRhAltaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apRhAltaTextKeyTyped(evt);
            }
        });

        sbRhAltaEt.setText("Salario bruto");

        sbRhAltaText.setText("Ingresar salario bruto");
        sbRhAltaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbRhAltaTextActionPerformed(evt);
            }
        });
        sbRhAltaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sbRhAltaTextKeyTyped(evt);
            }
        });

        amRhAltaEt.setText("Apellido materno");

        amRhAltaText.setText("Ingresar apellido materno");
        amRhAltaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amRhAltaTextActionPerformed(evt);
            }
        });
        amRhAltaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amRhAltaTextKeyTyped(evt);
            }
        });

        puestoRhAltaEt.setText("Puesto");

        puestoRhAltaText.setText("Ingresar puesto");
        puestoRhAltaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puestoRhAltaTextActionPerformed(evt);
            }
        });

        sucRhAltaEt.setText("Sucursal");

        sucRhAltaText.setText("Ingresar sucursal");
        sucRhAltaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucRhAltaTextActionPerformed(evt);
            }
        });

        curpRhAltaEt.setText("CURP");

        fechaIngEt.setText("Fecha de ingreso");

        nacTxtdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        nacTxtdate.setText("01/01/1900");

        ingresoTxtdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ingresoTxtdate.setText("01/01/1900");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(curpRhAltaText, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ingresoTxtdate))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nacTxtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaNacEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(amRhAltaText)
                                    .addComponent(amRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(puestoRhAltaText)
                                        .addComponent(puestoRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sucRhAltaText)
                                        .addComponent(sucRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(curpRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fechaIngEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(noEmpRhAltaText)
                                        .addComponent(noEmpRhAltaEt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nomRhAltaText)
                                        .addComponent(nomRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(apRhAltaText)
                                        .addComponent(apRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(rfcRhAltaText)
                                        .addComponent(rfcRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sbRhAltaText)
                                        .addComponent(sbRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(noEmpRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noEmpRhAltaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomRhAltaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rfcRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rfcRhAltaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sbRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sbRhAltaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(apRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apRhAltaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amRhAltaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(curpRhAltaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingresoTxtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(curpRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fechaIngEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(puestoRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puestoRhAltaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sucRhAltaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sucRhAltaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaNacEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nacTxtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        guardarRhAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        guardarRhAlta.setText("Guardar");
        guardarRhAlta.setDefaultCapable(false);
        guardarRhAlta.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        guardarRhAlta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        guardarRhAlta.setIconTextGap(1);
        guardarRhAlta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        guardarRhAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarRhAltaActionPerformed(evt);
            }
        });

        limpiarRhAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gnome_edit_clear.png"))); // NOI18N
        limpiarRhAlta.setText("Limpiar");
        limpiarRhAlta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        limpiarRhAlta.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        limpiarRhAlta.setIconTextGap(1);
        limpiarRhAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarRhAltaActionPerformed(evt);
            }
        });

        salirRhAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        salirRhAlta.setText("Salir");
        salirRhAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirRhAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(guardarRhAlta)
                .addGap(18, 18, 18)
                .addComponent(limpiarRhAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salirRhAlta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarRhAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiarRhAlta)
                    .addComponent(salirRhAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        curpRhAltaEt1.setText("CURP");

        curpTxt.setText("Mostrar CURP");
        curpTxt.setEnabled(false);
        curpTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curpTxtActionPerformed(evt);
            }
        });
        curpTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                curpTxtKeyTyped(evt);
            }
        });

        rfcRhAltaEt1.setText("RFC");

        rfcTxt.setText("XAXX010101000");
        rfcTxt.setEnabled(false);
        rfcTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfcTxtActionPerformed(evt);
            }
        });
        rfcTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rfcTxtKeyTyped(evt);
            }
        });

        fechaNacEt1.setText("Fecha de nacimiento");

        nacTxtdate1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));
        nacTxtdate1.setText("1900/01/01");
        nacTxtdate1.setEnabled(false);

        fechaIngEt1.setText("Fecha de ingreso");

        ingresoTxtdate1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));
        ingresoTxtdate1.setText("1900/01/01");
        ingresoTxtdate1.setEnabled(false);

        areaEt.setText("Área");

        areaTxt.setText("Mostrar Área");
        areaTxt.setEnabled(false);
        areaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTxtActionPerformed(evt);
            }
        });
        areaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                areaTxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(areaTxt)
                            .addComponent(areaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(amTxt)
                                        .addComponent(amEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(apTxt)
                                        .addComponent(apEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechaIngEt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sucursalEt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 11, Short.MAX_VALUE))
                                    .addComponent(sucursalTxt)
                                    .addComponent(ingresoTxtdate1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nomTxt)
                                            .addComponent(nomEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fechaNacEt1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                            .addComponent(nacTxtdate1)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(noempTxt)
                                            .addComponent(noempEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(rfcRhAltaEt1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                            .addComponent(rfcTxt)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(curpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(curpRhAltaEt1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(puestoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                            .addComponent(puestoEt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(32, 32, 32))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(308, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(265, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(noempEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rfcRhAltaEt1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rfcTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaNacEt1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nacTxtdate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fechaIngEt1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ingresoTxtdate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(apEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(amEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sucursalEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sucursalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(curpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(curpRhAltaEt1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(puestoEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puestoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(226, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(226, Short.MAX_VALUE)))
        );

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

        salirBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        salirBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(buscarInvBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(elimInvBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salirBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscarInvBajas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salirBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(elimInvBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Métodos del formulario
    private void noempTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noempTxtActionPerformed

    }//GEN-LAST:event_noempTxtActionPerformed

    private void noempTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noempTxtKeyTyped
        char c = evt.getKeyChar(); //Limita los caracteres a ingresar en la caja de texto 
        if(c<'0'||c>'9') evt.consume();//Solo permite números
        Toolkit.getDefaultToolkit().beep();
    }//GEN-LAST:event_noempTxtKeyTyped

    private void nomTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTxtActionPerformed

    }//GEN-LAST:event_nomTxtActionPerformed

    private void nomTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomTxtKeyTyped
        char c = evt.getKeyChar(); //Limita los caracteres a ingresar en el cuadro de texto
        if(!Character.isLetter(c)&&c!=KeyEvent.VK_SPACE){ //solo permite letras con espacios
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_nomTxtKeyTyped

    private void apEtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apEtKeyTyped

    }//GEN-LAST:event_apEtKeyTyped

    private void apTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apTxtActionPerformed

    private void apTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apTxtKeyTyped
        char c = evt.getKeyChar(); //Limita el text box a letras
        if(!Character.isLetter(c)&&c!=KeyEvent.VK_SPACE){ //Permite introducir espacios
            evt.consume();
            Toolkit.getDefaultToolkit().beep(); //Emite un soinido al ingresar tecla no autorizada
        }
    }//GEN-LAST:event_apTxtKeyTyped

    private void amTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amTxtActionPerformed

    private void amTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amTxtKeyTyped
        char c = evt.getKeyChar(); //Limita el text box a letras
        if(!Character.isLetter(c)&&c!=KeyEvent.VK_SPACE){//Permite ingresar espacios
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_amTxtKeyTyped

    private void sucursalTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sucursalTxtActionPerformed

    private void sucursalTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sucursalTxtKeyTyped
        if(sucursalTxt.getText().length() >= 2){//Limita el textBox de sucursal a dos números
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        } 
    }//GEN-LAST:event_sucursalTxtKeyTyped

    private void puestoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puestoTxtActionPerformed

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

    private void noEmpRhAltaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noEmpRhAltaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noEmpRhAltaTextActionPerformed

    private void noEmpRhAltaTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noEmpRhAltaTextKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();//Limita caracteres a números
        Toolkit.getDefaultToolkit().beep();
    }//GEN-LAST:event_noEmpRhAltaTextKeyTyped

    private void nomRhAltaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomRhAltaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomRhAltaTextActionPerformed

    private void nomRhAltaTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomRhAltaTextKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetter(c)&&c!=KeyEvent.VK_SPACE){//Limita caracteres a letras con espacio
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_nomRhAltaTextKeyTyped

    private void curpRhAltaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curpRhAltaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_curpRhAltaTextActionPerformed

    private void curpRhAltaTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_curpRhAltaTextKeyTyped
        if(curpRhAltaText.getText().length()>=18){//Limita caracteres a 18
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_curpRhAltaTextKeyTyped

    private void rfcRhAltaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfcRhAltaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rfcRhAltaTextActionPerformed

    private void rfcRhAltaTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rfcRhAltaTextKeyTyped
        if(rfcRhAltaText.getText().length()>=13){ //Limita caracteres a 13
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_rfcRhAltaTextKeyTyped

    private void apRhAltaEtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apRhAltaEtKeyTyped

    }//GEN-LAST:event_apRhAltaEtKeyTyped

    private void apRhAltaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apRhAltaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apRhAltaTextActionPerformed

    private void apRhAltaTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apRhAltaTextKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetter(c)&&c!=KeyEvent.VK_SPACE){//Limita caracteres a letras con espacio
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_apRhAltaTextKeyTyped

    private void sbRhAltaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbRhAltaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sbRhAltaTextActionPerformed

    private void sbRhAltaTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sbRhAltaTextKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='.'){//Limita caracteres anúmeros y un punto decimal
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(evt.getKeyChar()=='.'&&sbRhAltaText.getText().contains(".")){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_sbRhAltaTextKeyTyped

    private void amRhAltaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amRhAltaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amRhAltaTextActionPerformed

    private void amRhAltaTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amRhAltaTextKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetter(c)&&c!=KeyEvent.VK_SPACE){//Limita caracteres a letras con espacio
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_amRhAltaTextKeyTyped

    private void puestoRhAltaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestoRhAltaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puestoRhAltaTextActionPerformed

    private void sucRhAltaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucRhAltaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sucRhAltaTextActionPerformed

    private void guardarRhAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarRhAltaActionPerformed
        Toolkit.getDefaultToolkit().beep(); //Muestra un mensaje y emite un sonido para guardar el registro.
        int i = JOptionPane.showConfirmDialog(this, "¿Desea guardar el registro?");//Switch case de confirmación de gguardado
        switch(i){
            case 0:
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this,"Registro guardado"); //Aqui se configurará para ser guardado en la base de datos
            break;
            case 1:
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this,"Registro no guardado"); //No guarda el registro
            break;
            default:
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this,"Registro no guardado"); //Al pulsar cancelar se omite el guardado.
            break;
        }
    }//GEN-LAST:event_guardarRhAltaActionPerformed

    private void limpiarRhAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarRhAltaActionPerformed
        Toolkit.getDefaultToolkit().beep(); //Muestra un mensaje de advertencia para salir del formulario
        JOptionPane.showMessageDialog(this, "Se borrará el contenido del formulario", "Precaución", JOptionPane.WARNING_MESSAGE);
        int i = JOptionPane.showConfirmDialog(this, "¿Desea continuar?");//Permite al usuario seleccionar si desea hacerlo
        switch(i){
            case 0://En caso de acceder, devuelve los valores del textBox a vaciíos y combo box a primera opción
            noEmpRhAltaText.setText(null);
            amRhAltaText.setText(null);
            apRhAltaText.setText(null);
            curpRhAltaText.setText(null);
            nomRhAltaText.setText(null);
            puestoRhAltaText.setText(null);
            rfcRhAltaText.setText(null);
            sbRhAltaText.setText(null);
            sucRhAltaText.setText(null);
            nacTxtdate.setText("01/01/1900");
            ingresoTxtdate.setText("01/01/1900");
            JOptionPane.showMessageDialog(this,"Limpieza exitosa"); //Muestra un mensaje de haber realizzado la limpieza bien
            break;
            case 1:
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this,"Limpieza no realizada"); //Indica que no se realizó la acción
            break;
            default:
            break;
        }
    }//GEN-LAST:event_limpiarRhAltaActionPerformed

    private void salirRhAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirRhAltaActionPerformed
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
    }//GEN-LAST:event_salirRhAltaActionPerformed

    private void curpTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curpTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_curpTxtActionPerformed

    private void curpTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_curpTxtKeyTyped
        if(curpRhAltaText.getText().length()>=18){//Limita caracteres a 18
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_curpTxtKeyTyped

    private void rfcTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfcTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rfcTxtActionPerformed

    private void rfcTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rfcTxtKeyTyped
        if(rfcRhAltaText.getText().length()>=13){ //Limita caracteres a 13
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_rfcTxtKeyTyped

    private void elimInvBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimInvBajasActionPerformed
        Toolkit.getDefaultToolkit().beep(); //Muestra un mensaje de advertencia para eliminar datos del formulario
        JOptionPane.showMessageDialog(this, "Se borrará el registro", "Precaución", JOptionPane.WARNING_MESSAGE);
        int i = JOptionPane.showConfirmDialog(this, "¿Desea continuar?");//Permite al usuario seleccionar si desea hacerlo
        switch(i){
            case 0://En caso de acceder, eliminará el registro seleccionado
                Connection con = null; //Establece la conexión como null
                try{//Try catch a prueba de errores y cierres inesperados del sistema
                    con = getConnection(); //Invoca el método get connection
                    ps = con.prepareStatement("DELETE FROM personal WHERE no_empleado=?");//Utiliza el comando de SQL para eliminar los datos de la BD
                                     
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

    private void areaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTxtActionPerformed

    private void areaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaTxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTxtKeyTyped

    private void buscarInvBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarInvBajasActionPerformed
        Connection con = null; //Establece como null la conexión con la BD
        try{
            con = getConnection(); //establece conexión con la BD
            ps = con.prepareStatement("SELECT * FROM personal WHERE no_empleado = ?"); //realiza la busqueda del personal
            ps.setString(1,noempTxt.getText()); //en la tabla a través del no_empleado
            
            rs = ps.executeQuery(); //Ejecuta consulta SQL
            
            if(rs.next()){ //Si encuentra algo:
                nomTxt.setText(rs.getString("nombre_emp")); //Coloca en los campos de texto el resultado
                apTxt.setText(rs.getString("apellido_patemp"));
                amTxt.setText(rs.getString("apellido_matemp"));
                nacTxtdate1.setText(rs.getString("fechanac"));
                curpTxt.setText(rs.getString("curp"));
                rfcTxt.setText(rs.getString("rfc"));
                puestoTxt.setText(rs.getString("puesto"));
                sucursalTxt.setText(rs.getString("sucursal1"));
                ingresoTxtdate1.setText(rs.getString("fecha_ingreso"));
                areaTxt.setText(rs.getString("area"));
            } else { //Si no, indica que no existe el empleado
                JOptionPane.showMessageDialog(null,"No existe nadie con esa clave");
            }                    
        } catch (SQLException e){ //Previene errores
            System.out.println(e);
        }
    }//GEN-LAST:event_buscarInvBajasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amEt;
    private javax.swing.JLabel amRhAltaEt;
    private javax.swing.JTextField amRhAltaText;
    private javax.swing.JTextField amTxt;
    private javax.swing.JLabel apEt;
    private javax.swing.JLabel apRhAltaEt;
    private javax.swing.JTextField apRhAltaText;
    private javax.swing.JTextField apTxt;
    private javax.swing.JLabel areaEt;
    private javax.swing.JTextField areaTxt;
    private javax.swing.JButton buscarInvBajas;
    private javax.swing.JLabel curpRhAltaEt;
    private javax.swing.JLabel curpRhAltaEt1;
    private javax.swing.JTextField curpRhAltaText;
    private javax.swing.JTextField curpTxt;
    private javax.swing.JButton elimInvBajas;
    private javax.swing.JLabel fechaIngEt;
    private javax.swing.JLabel fechaIngEt1;
    private javax.swing.JLabel fechaNacEt;
    private javax.swing.JLabel fechaNacEt1;
    private javax.swing.JButton guardarRhAlta;
    private javax.swing.JFormattedTextField ingresoTxtdate;
    private javax.swing.JFormattedTextField ingresoTxtdate1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton limpiarRhAlta;
    private javax.swing.JFormattedTextField nacTxtdate;
    private javax.swing.JFormattedTextField nacTxtdate1;
    private javax.swing.JLabel noEmpRhAltaEt;
    private javax.swing.JTextField noEmpRhAltaText;
    private javax.swing.JLabel noempEt;
    private javax.swing.JTextField noempTxt;
    private javax.swing.JLabel nomEt;
    private javax.swing.JLabel nomRhAltaEt;
    private javax.swing.JTextField nomRhAltaText;
    private javax.swing.JTextField nomTxt;
    private javax.swing.JLabel puestoEt;
    private javax.swing.JLabel puestoRhAltaEt;
    private javax.swing.JTextField puestoRhAltaText;
    private javax.swing.JTextField puestoTxt;
    private javax.swing.JLabel rfcRhAltaEt;
    private javax.swing.JLabel rfcRhAltaEt1;
    private javax.swing.JTextField rfcRhAltaText;
    private javax.swing.JTextField rfcTxt;
    private javax.swing.JButton salirBttn;
    private javax.swing.JButton salirRhAlta;
    private javax.swing.JLabel sbRhAltaEt;
    private javax.swing.JTextField sbRhAltaText;
    private javax.swing.JLabel sucRhAltaEt;
    private javax.swing.JTextField sucRhAltaText;
    private javax.swing.JLabel sucursalEt;
    private javax.swing.JTextField sucursalTxt;
    // End of variables declaration//GEN-END:variables
}
