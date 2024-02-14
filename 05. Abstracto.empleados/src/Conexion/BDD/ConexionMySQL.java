package Conexion.BDD;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionMySQL implements AccesoDatos {//Implementación desde Interfaz

    @Override
    public void establecerConexion(){//Sobreescritura de métodos
        System.out.println("Conexión establecida"); 
    }

    @Override
    public void insertar() {//Sobreescritura de métodos
        System.out.println("Inserta un registro en MySQL");
    }

    @Override
    public void cerrarConexion(boolean statusConexion) {//Sobreescritura de método boolean
        statusConexion=false; //Establece el valor como falso para que salte la excepción
        if(statusConexion==false){//ciclo If-else
            try {//Inicio del bloque try-catch
                throw new ExcepcionBoleana("Error al cerrar la conexión");//Creación de objeto arrojable con mensaje
            } catch (ExcepcionBoleana ex) {//Catch
                Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{//Fin de if else
            System.out.println("Conexión finalizada correctamente");//Mensaje de conexión cerrada si se cambia a true el boolean
        }    
    }
}

class ExcepcionBoleana extends Exception{ //Excepción creada

    public ExcepcionBoleana() {
    }

    public ExcepcionBoleana(String message) {//Envía mensaje
        super(message);
    }
    
}
