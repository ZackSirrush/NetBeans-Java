package conexion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexion {
    
    private static final String base = "floreriaparatodaocasionbd"; /* base de datos a la que se conecta mediante xampp */
    private static final String user = "root"; /* usuario de bd */
    private static final String password = ""; /* password de bd */
    private static final String url = "jdbc:mysql://localhost:3306/"+base; /* dirección de bd */
    
    public static Connection getConexion(){ /* metodo para conexion */
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);  /* se entrega el driver, url, usuario y pass */
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con; /* devuelve conexion */
    }
    
    public static Connection conectar(String url, String user, String pass) {
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión a la base de datos exitosa");
            return connection;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

    public static void cerrarConexion(Connection conn) {
        try {
            conn.close();
            System.out.println("Desconexión de la base de datos exitosa");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public static ResultSet getTabla(String Consulta){ /* coneccion a bd de tablas */
        Connection con = getConexion();
        Statement st;
        ResultSet datos = null;
        try{
            st=con.createStatement();
            datos=st.executeQuery(Consulta);
        } catch(Exception e){
            System.out.print(e.toString());
        }
        return datos;        
    }
    
    public ResultSet seleccionarPV(String puntoDeVenta){ /* conecta y realiza la consulta que filtra pedidos por punto de venta */
        Connection con;
        PreparedStatement pst;
        ResultSet rs=null;
        try{
            con=getConexion();
            pst=con.prepareStatement("SELECT empleados.puntoDeVenta,empleados.user,pedidos.* FROM pedidos INNER JOIN empleados ON empleados.idEmpleado=pedidos.idEmp WHERE puntoDeVenta=?");
            pst.setString(1,puntoDeVenta);
            rs=pst.executeQuery();
            
        } catch(Exception e){
            
        }
        return rs;
    }
    
    public ResultSet filtrarestatusPV(String filpuntoDeVenta,String filestatus){/* conecta y realiza la consulta que filtra pedidos por punto de venta + estatus del pedido */
        Connection con;
        PreparedStatement pst;
        ResultSet rs=null;
        try{
            con=getConexion();
            pst=con.prepareStatement("SELECT empleados.puntoDeVenta,empleados.user,pedidos.* FROM pedidos INNER JOIN empleados ON empleados.idEmpleado=pedidos.idEmp WHERE puntoDeVenta=? AND estatus=?");
            pst.setString(1,filpuntoDeVenta);
            pst.setString(2,filestatus);
            rs=pst.executeQuery();
            
        } catch(Exception e){
            
        }
        return rs;
    }
    
    public ResultSet comisionganadaporempleado(String comPV){/* conecta y realiza la consulta que calcula las comisiones ganadas por punto de venta y las agrupa según fecha y empleado*/
        Connection con;
        PreparedStatement pst;
        ResultSet rs=null;
        try{
            con=getConexion();
            pst=con.prepareStatement("SELECT empleados.puntoDeVenta,pedidos.idEmp, empleados.user, SUM(catalogo.comision) AS comisionesau, pedidos.fechaAcept FROM catalogo INNER JOIN pedidos ON catalogo.idArreglo = pedidos.idArreglo INNER JOIN empleados ON pedidos.idEmp = empleados.idEmpleado WHERE pedidos.estatus='Autorizado' AND empleados.puntoDeVenta=? GROUP BY idEmp, fechaAcept");
            pst.setString(1,comPV);

            rs=pst.executeQuery();
            
        } catch(Exception e){
            
        }
        return rs;
    }
    
        public ResultSet bonoeficiencia(String comision){/* conecta y realiza la consulta que calcula los bonos de eficiencia por punto de venta y los agrupa según fecha y empleado*/
        Connection con;
        PreparedStatement pst;
        ResultSet rs=null;
        try{
            con=getConexion();
            pst=con.prepareStatement("SELECT empleados.puntoDeVenta,pedidos.idEmp, empleados.user, SUM(catalogo.costoArreglo) AS ventadiaria,SUM(catalogo.comision) AS comisionesau,SUM(catalogo.costoArreglo)*0.01 AS bonoproduc, pedidos.fechaAcept FROM catalogo INNER JOIN pedidos ON catalogo.idArreglo = pedidos.idArreglo INNER JOIN empleados ON pedidos.idEmp = empleados.idEmpleado WHERE pedidos.estatus ='Autorizado' AND empleados.puntoDeVenta=? GROUP BY idEmp, fechaAcept");
            pst.setString(1,comision);

            rs=pst.executeQuery();
            
        } catch(Exception e){
            
        }
        return rs;
    }
        
    public ResultSet reporte(String iddisenador,String fechaini,String fechafin){/* conecta y realiza la consulta que filtra pedidos por fecha y realiza operaciones para la nómina */
        Connection con;
        PreparedStatement pst;
        ResultSet rs=null;
        try{
            con=getConexion();
            pst=con.prepareStatement("SELECT pedidos.idEmp,COUNT(pedidos.idEmp) AS pedidorealiz,pedidos.fechaAcept,SEC_TO_TIME(SUM(TIME_TO_SEC(tiempotranscurr))) AS tiempodetrabajo,SUM(catalogo.comision) AS comisionesganadas,SUM(catalogo.costoArreglo)*0.01 AS bonoproduc,SUM(catalogo.comision)+SUM(catalogo.costoArreglo)*0.01 AS gananciatotal FROM pedidos INNER JOIN catalogo ON catalogo.idArreglo=pedidos.idArreglo WHERE pedidos.idEmp=? AND pedidos.fechaAcept>=? AND pedidos.fechaAcept<? GROUP BY idEmp,fechaAcept");
            pst.setString(1,iddisenador);
            pst.setString(2,fechaini); /* Variables a contemplar para la consulta */
            pst.setString(3,fechafin);
            rs=pst.executeQuery();
            
        } catch(Exception e){
            
        }
        return rs;
    }
    
    public static boolean registrarArchivoPDF(Connection conn, String file) { /* Stream para generar el reporte */
        FileInputStream input = null; /* Declara el stream */
        PreparedStatement stmt = null;
        try {
            String sql = "INSERT INTO reportes(archivo) VALUES(?);"; /* Realiza la consulta, inserta el reporte en la BD */
            stmt = conn.prepareStatement(sql);
            input = new FileInputStream(new File(file)); /* Conexión vía stream */
            stmt.setBinaryStream(1, input);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Archivo '" + file + "' registrado en la base de datos correctamente"); /* Muestra mensaje de registro exitoso */
            return true;
        } catch (FileNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            try {
                if (input != null) {
                    input.close(); /* Cierra conexión y stream */
                }
                if (stmt != null) {
                    stmt.close();
                }
            } catch (IOException | SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return false;
    }
    
      public static void leerUltimoArchivoRegistrado(Connection conn) { /* Método para leer el último archivo de la BD */
        Statement stmt = null;
        InputStream input = null;
        FileOutputStream output = null; /* Stream */
        try {
            String sql = "SELECT archivo FROM reportes ORDER BY idReporte DESC LIMIT 1;"; /* Selecciona el reporte de ñla tabla */
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            File file = new File("report.jasper"); /* Descarga el reporte y lo almacena en la carpeta jasper */
            output = new FileOutputStream(file);

            if (rs.next()) {
                input = rs.getBinaryStream("archivo");
                System.out.println("Leyendo archivo desde la base de datos..."); /* Lee el reporte  */
                byte[] buffer = new byte[1024];
                while (input.read(buffer) > 0) {
                    output.write(buffer);
                }
                System.out.println("> Archivo guardado en : " + file.getAbsolutePath()); /* Muestra un mensaje en consola con la ruta donde se guardó el archivo */
            }
        } catch (SQLException | IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();/* Cierra stream y conexiones */
                }
                if (stmt != null) {
                    stmt.close();
                }
            } catch (IOException | SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
    
}