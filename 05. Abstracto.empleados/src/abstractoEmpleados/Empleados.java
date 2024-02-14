package abstractoEmpleados;

public abstract class Empleados {//Superclase
    String grupoEmpleado; //Atributos

    public Empleados(String grupoEmpleado, String DatosEmpleado) {//constructor
        this.grupoEmpleado = grupoEmpleado;
    }

    public void setGrupoEmpleado(String grupoEmpleado) {
        this.grupoEmpleado = "El grupo de empleados es: "; //Setter de grupoEmp´leado
    }

    public String getGrupoEmpleado() {//Getter
        return grupoEmpleado;
    } 

    public abstract String getDatosEmpleado();  //Método abstracto getter de datosempleado
}    
   
