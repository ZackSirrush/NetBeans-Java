package abstractoEmpleados;

public class Temporales extends Empleados{ //Clase hija Empleados temporales

    String datosEmpleado;
    
    public Temporales(String grupoEmpleado, String DatosEmpleado) { //Constructor
        super(grupoEmpleado, DatosEmpleado);
    }
      
    public void setDatosEmpleado(String datosEmpleado) { //Setter
    this.datosEmpleado = datosEmpleado;
    }
    
    @Override
    public String getDatosEmpleado(){ //Getter
        return grupoEmpleado+datosEmpleado;
    }    
}