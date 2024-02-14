package abstractoEmpleados;

public class Gerentes extends Empleados {//Clase hija

    String datosEmpleado;
    
    public Gerentes(String grupoEmpleado, String DatosEmpleado) {//Constructor
        super(grupoEmpleado, DatosEmpleado);
    }

    public void setDatosEmpleado(String datosEmpleado) {//Setter
        this.datosEmpleado = datosEmpleado;
    }
 
    @Override
    public String getDatosEmpleado(){//Getter heredado
        return grupoEmpleado+datosEmpleado;
    }
}
