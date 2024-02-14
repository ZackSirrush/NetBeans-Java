package sistemaadministrativorestaurante;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class repInventario extends javax.swing.JInternalFrame {

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
    
    public repInventario() {
        initComponents();
        JOptionPane.showMessageDialog(null,"Puede buscar, ingresando el dato solicitado, o bien no ingresar nada "
                + "y pulsar directamente al botón buscar para visualizar todos los registros");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        codartEt = new javax.swing.JLabel();
        codartTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        buscarBttn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Reporte de inventarios");

        codartEt.setText("Código de producto");

        codartTxt.setText("Buscar por código");
        codartTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codartTxtActionPerformed(evt);
            }
        });
        codartTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codartTxtKeyTyped(evt);
            }
        });

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código de producto", "Nombre producto", "Sucursal", "Existencias", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaInventario.setEnabled(false);
        jScrollPane1.setViewportView(tablaInventario);

        buscarBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AppListIcon.targetsize-24.png"))); // NOI18N
        buscarBttn.setText("Buscar");
        buscarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(codartEt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codartTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codartEt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codartTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void codartTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codartTxtActionPerformed

    }//GEN-LAST:event_codartTxtActionPerformed

    private void codartTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codartTxtKeyTyped
        char c = evt.getKeyChar(); //Limita los caracteres a ingresar en la caja de texto
        if(c<'0'||c>'9') evt.consume();//Solo permite números
        Toolkit.getDefaultToolkit().beep();
    }//GEN-LAST:event_codartTxtKeyTyped

    private void buscarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBttnActionPerformed
        String campo = codartTxt.getText(); //Permite realizar busqueda por número de artículo
        String where = "";
        
        if(!"".equals(campo)){ //Iguala campo a comillas para que el usuairo pueda ingresar y buscar el codigo de producto
            where = " WHERE cod_prod = '"+ campo + "'";
        }
        
        try{
            DefaultTableModel modelo = new DefaultTableModel(); //Crea el objetp para la tabla
            tablaInventario.setModel(modelo); //Indica que la tabla es: su nombre
            Connection con = null; //establece conección null con la BD
            con = getConnection(); //conecta a la BD
            
            String sql = "SELECT * FROM inventario "+where; //Consulta SQL
            System.out.println(sql); //Muestra en consola la consulta
            
            ps = con.prepareStatement(sql); //prepara la consulta
            
            rs = ps.executeQuery();//ejecuta consulta
            
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData(); //presenta resultados de consulta
            int cantidadColumnas = rsMd.getColumnCount();//cuenta las columnas obtenidas
            
            modelo.addColumn("Código de producto"); //Indica las columnas de la tabla
            modelo.addColumn("Nombre producto");
            modelo.addColumn("Sucursal");
            modelo.addColumn("Existencias");
            modelo.addColumn("Marca");

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBttn;
    private javax.swing.JLabel codartEt;
    private javax.swing.JTextField codartTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaInventario;
    // End of variables declaration//GEN-END:variables

}
