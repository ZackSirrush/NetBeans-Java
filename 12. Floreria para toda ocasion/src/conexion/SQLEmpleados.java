package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLEmpleados extends conexion {
    
    public boolean registrar(empleados emp){/* metodo para registrar un empleado */
        
      PreparedStatement ps = null; /* establece conexión a base de datos */
      Connection con = getConexion();
      
      String sql = "INSERT INTO empleados (nombreEmp,apellidoPaterno,apellidoMaterno,idPuesto,puntoDeVenta,user,password) VALUES (?,?,?,?,?,?,?)"; /* consulta de inserción sql */
      
        try {
            ps = con.prepareStatement(sql);/* obtiene datos de cajas de texto */
            ps.setString(1,emp.getNombreEmp());
            ps.setString(2,emp.getApellidoPaterno());
            ps.setString(3,emp.getApellidoMaterno());
            ps.setInt(4,emp.getIdPuesto());
            ps.setString(5,emp.getpuntoDeVenta());
            ps.setString(6,emp.getUser());
            ps.setString(7,emp.getPassword());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SQLEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }  
    
    public int existeUsuario(String user){
        
      PreparedStatement ps = null;
      ResultSet rs = null;
      Connection con = getConexion();/* conexion sql */
      
        String sql = "SELECT count(idEmpleado) FROM empleados WHERE user=?"; /* consulta usuarios existentes */
      
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,user);
            rs = ps.executeQuery();/* devuelve los usuarios que existen en la bd */
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;  
        } catch (SQLException ex) {
            Logger.getLogger(SQLEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }
    
    public boolean logIn(empleados usr){ /* inicio de sesion */
        
      PreparedStatement ps = null;
      ResultSet rs = null;
      Connection con = getConexion();
      
        String sql = "SELECT u.idEmpleado,u.nombreEmp,u.apellidoPaterno,u.apellidoMaterno,"
                + "u.idPuesto,u.puntoDeVenta,u.user,u.password,t.nombreTipoUser FROM empleados AS u " /* combina tabla empleados y puesto para asignar privilegios */
                + "INNER JOIN tipo_usuario AS t ON u.idPuesto=t.idPuesto WHERE user=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,usr.getUser());
            rs = ps.executeQuery();
            if(rs.next()){
                if(usr.getPassword().equals(rs.getString(8))){
                    
                    usr.setIdEmpleado(rs.getInt(1));
                    usr.setNombreEmp(rs.getString(2));
                    usr.setApellidoPaterno(rs.getString(3));
                    usr.setApellidoMaterno(rs.getString(4)); /* obtiene valores de tablas */
                    usr.setIdPuesto(rs.getInt(5));
                    usr.setpuntoDeVenta(rs.getString(6));
                    usr.setNombreTipoUser(rs.getString(9));
                    
                    return true;
                } else {
                    return false;
                }
            }
            return false;  
        } catch (SQLException ex) {
            Logger.getLogger(SQLEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    } 
}
