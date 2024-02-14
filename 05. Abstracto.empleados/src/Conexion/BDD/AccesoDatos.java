package Conexion.BDD;

public interface AccesoDatos { //Interfaz
    
    public void establecerConexion(); //Métodos a implementar
    public void insertar();
    public void cerrarConexion(boolean statusConexion);
}
