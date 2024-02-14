package abstractoEmpleados;

public class Operativos extends Empleados { //Clase hija

    private String datosEmpleado;
    
    public Operativos(String grupoEmpleado, String datosEmpleado) { //Constructor
        super(grupoEmpleado,datosEmpleado);
    }
       
    public void setDatosEmpleado(String datosEmpleado) { //Setter
    this.datosEmpleado = datosEmpleado;
    }
    
    @Override
    public String getDatosEmpleado(){
        return grupoEmpleado+datosEmpleado;//Getter heredado
    }  
}
