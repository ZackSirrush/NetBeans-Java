package sistemaadministrativorestaurante;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class consultas extends javax.swing.JInternalFrame {

    //Atributos
    public static final String URL = "jdbc:mysql://localhost:3306/proyecto?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "root"; //Ubicación de la base de datos, nombre de usuario y contraseña de la BD
    public static final String PASSWORD = "Isaac110696..";
    PreparedStatement ps = null; //Invocar Prepared statement y Result set
    ResultSet rs = null; 
    
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
    
    public consultas() {
        initComponents(); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nominaTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        buscarInvBajas = new javax.swing.JButton();
        exportarBttn1 = new javax.swing.JButton();
        limpInvAltas = new javax.swing.JButton();
        buscarEt = new javax.swing.JLabel();
        buscarTxt = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setTitle("Consulta de nómina");

        nominaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No. empleado", "Nombre", "Ap. paterno", "Ap. materno", "Salario", "Incentivos", "Descuentos", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        nominaTable.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                nominaTableComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(nominaTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        buscarInvBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AppListIcon.targetsize-24.png"))); // NOI18N
        buscarInvBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarInvBajasActionPerformed(evt);
            }
        });

        exportarBttn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/file_pdf.png"))); // NOI18N
        exportarBttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarBttn1ActionPerformed(evt);
            }
        });

        limpInvAltas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gnome_edit_clear.png"))); // NOI18N
        limpInvAltas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        limpInvAltas.setIconTextGap(1);
        limpInvAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpInvAltasActionPerformed(evt);
            }
        });

        buscarEt.setText("Buscar por número de empleado");

        buscarTxt.setText("Ingrese número de empleado");
        buscarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscarEt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscarInvBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(limpInvAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exportarBttn1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscarEt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(exportarBttn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarInvBajas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limpInvAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarInvBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarInvBajasActionPerformed
        
        String campo = buscarTxt.getText();
        String where = "";
        
        if(!"".equals(campo)){
            where = " WHERE no_empleado = '"+ campo + "'";
        }
        
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            nominaTable.setModel(modelo);
            Connection con = null;
            con = getConnection();
            
            String sql = "SELECT no_empleado, nombre_emp, apellido_patemp, apellido_matemp,salario, incentivo, descuentos,total "
                    + "FROM personal INNER JOIN nomina" 
                    + " ON personal.no_empleado = nomina.no_empleado2"+where;
            System.out.println(sql);
            
            ps = con.prepareStatement(sql);
            
            rs= ps.executeQuery();
            
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("No. empleado");
            modelo.addColumn("Nombre");
            modelo.addColumn("Ap. paterno");
            modelo.addColumn("Ap. materno");
            modelo.addColumn("Salario");
            modelo.addColumn("Incentivos");
            modelo.addColumn("Descuentos");
            modelo.addColumn("Total");
            
            
            
            while(rs.next()){
                Object[] filas =new Object [cantidadColumnas];                
                for(int i = 0; i<cantidadColumnas; i++){
                    filas[i]=rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex){
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_buscarInvBajasActionPerformed

    private void exportarBttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarBttn1ActionPerformed
        Toolkit.getDefaultToolkit().beep(); //Muestra un mensaje y emite un sonido para exportar el reporte.
        int i = JOptionPane.showConfirmDialog(this, "¿Desea exportar el registro?");//Switch case de confirmación de gguardado
        switch(i){
            case 0:
                {
                try {    
                    Connection con = null;
                    con = getConnection();
                    JasperReport reporte = null;
                    String path = "src\\reportes\\reportconsultas.jasper";
            
                    reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
                    
                    JasperPrint jprint = JasperFillManager.fillReport(reporte,null,con);
                    
                    JasperViewer view = new JasperViewer(jprint,false);
                    view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    view.setVisible(true);
                } catch (JRException ex) {
                    Logger.getLogger(consultas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this,"Registro exportado"); //Aqui se configurará para ser exportado de la base de datos                    
                break;

            case 1:
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this,"Registro no exportado"); //No exporta el registro
                break;
            default:
                break;
        }
    }//GEN-LAST:event_exportarBttn1ActionPerformed

    private void limpInvAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpInvAltasActionPerformed
        Toolkit.getDefaultToolkit().beep(); //Muestra un mensaje de advertencia para salir del formulario
        JOptionPane.showMessageDialog(this, "Se borrará el contenido del formulario", "Precaución", JOptionPane.WARNING_MESSAGE);
        int i = JOptionPane.showConfirmDialog(this, "¿Desea continuar?");//Permite al usuario seleccionar si desea hacerlo
        switch(i){
            case 0:
            DefaultTableModel modelo = (DefaultTableModel)nominaTable.getModel();
            modelo.getDataVector().removeAllElements();
            modelo.fireTableDataChanged(); // Limpia la tabla
            buscarTxt.setText(null);
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

    private void nominaTableComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_nominaTableComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_nominaTableComponentAdded

    private void buscarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarEt;
    private javax.swing.JButton buscarInvBajas;
    private javax.swing.JTextField buscarTxt;
    private javax.swing.JButton exportarBttn;
    private javax.swing.JButton exportarBttn1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpInvAltas;
    private javax.swing.JTable nominaTable;
    // End of variables declaration//GEN-END:variables
}
