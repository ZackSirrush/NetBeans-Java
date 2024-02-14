package sistemaadministrativorestaurante;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class repRh extends javax.swing.JInternalFrame {

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
    
    public repRh() {
        initComponents();
        JOptionPane.showMessageDialog(null,"Puede buscar, ingresando el dato solicitado, o bien no ingresar nada "
                + "y pulsar directamente al botón buscar para visualizar todos los registros");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNomina = new javax.swing.JTable();
        buscarBttn = new javax.swing.JButton();
        modifEt = new javax.swing.JLabel();
        noempTxt = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Reporte de nómina");
        setToolTipText("");

        tablaNomina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No. empleado", "Área", "Salario", "Incentivo", "Días", "Descuentos", "Total", "Desempeño"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaNomina.setEnabled(false);
        jScrollPane1.setViewportView(tablaNomina);

        buscarBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AppListIcon.targetsize-24.png"))); // NOI18N
        buscarBttn.setText("Buscar");
        buscarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBttnActionPerformed(evt);
            }
        });

        modifEt.setText("Buscar por número de empleado");
        modifEt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modifEtKeyTyped(evt);
            }
        });

        noempTxt.setText("Ingresar Número de empleado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(modifEt, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(noempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
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

    private void buscarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBttnActionPerformed
        String campo = noempTxt.getText(); //Permite realizar busqueda según la caja de texto
        String where = "";
        
        if(!"".equals(campo)){ //Iguala campo a comillas para que el usuario pueda ingresar y buscar
            where = " WHERE no_empleado2 = '"+ campo + "'";
        }
        
        try{
            DefaultTableModel modelo = new DefaultTableModel(); //Crea el objetp para la tabla
            tablaNomina.setModel(modelo); //Indica que la tabla es: su nombre
            Connection con = null; //establece conección null con la BD
            con = getConnection(); //conecta a la BD
            
            String sql = "SELECT * FROM nomina "+where; //Consulta SQL
            System.out.println(sql); //Muestra en consola la consulta
            
            ps = con.prepareStatement(sql); //prepara la consulta
            
            rs = ps.executeQuery();//ejecuta consulta
            
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData(); //presenta resultados de consulta
            int cantidadColumnas = rsMd.getColumnCount();//cuenta las columnas obtenidas
            
            modelo.addColumn("No. empleado"); //Indica las columnas de la tabla
            modelo.addColumn("Área");
            modelo.addColumn("Salario");
            modelo.addColumn("Incentivo");
            modelo.addColumn("Días");
            modelo.addColumn("Descuentos");
            modelo.addColumn("Total");
            modelo.addColumn("Desempeño");

            while(rs.next()){ //Bucle que imprime los resultados de la tabla
                Object[] filas =new Object [cantidadColumnas];     //Arreglo           
                for(int i = 0; i<cantidadColumnas; i++){
                    filas[i]=rs.getObject(i + 1); //Arreglo de filas
                }
                modelo.addRow(filas); //Agrega filas a la tabla
            }
        } catch (SQLException ex){
            System.err.println(ex.toString());//Previene cierres inesperados
        }
    }//GEN-LAST:event_buscarBttnActionPerformed

    private void modifEtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modifEtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modifEtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBttn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel modifEt;
    private javax.swing.JTextField noempTxt;
    private javax.swing.JTable tablaNomina;
    // End of variables declaration//GEN-END:variables

}
